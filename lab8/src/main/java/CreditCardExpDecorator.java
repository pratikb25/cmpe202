
public class CreditCardExpDecorator extends CreditCardExp {

	private CreditCardExp ccExp;
	
	public CreditCardExpDecorator(CreditCardExp c) {
		ccExp = c;
	}
	
    public void setNext( IKeyEventHandler next) {
    	if(ccExp != null)
    		ccExp.setNext(next);
    }	
    
    private String formatCardExp(String S) {
		int block = 2;
		boolean addedSlash = false;
		if(S.length() <= 2)
			return S;
		
		StringBuffer r = new StringBuffer("");
		for(int i = 0; i < S.length(); i++) {
			String ch = Character.toString(S.charAt(i));
			r.append(ch);
			if(addedSlash == false && i > 0 && ((i+1) % block) == 0) {
				r.append("/");
				addedSlash = true;
			}
		}

		return r.toString().trim();
	}

	public String display() {
		if(ccExp == null)
			return "[MMYY]";
		String input = ccExp.display().trim();
		input = input.substring(input.indexOf("[") + 1);
		input = input.substring(0, input.indexOf("]"));
		if(input.length() > 2)
			input = formatCardExp(input);
		return "[" + input + "]";
	}	

	public void key(String ch, int cnt) {
		if(ccExp != null)
			ccExp.key(ch, cnt);
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}
