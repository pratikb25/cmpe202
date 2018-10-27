
public class CreditCardNumDecorator extends CreditCardNum {
	
	private CreditCardNum ccNum;
	
	public CreditCardNumDecorator(CreditCardNum c) {
		if(c != null)
			ccNum = (CreditCardNum) c;
	}

	@Override
	public void key(String ch, int cnt) {
		if(ccNum != null)
			ccNum.key(ch, cnt);
	}

	@Override
	public void setNext(IKeyEventHandler next) {
		ccNum.setNext(next);
	}
	
	private String formatCardNumber(String S) {
		int block = 4;
		if(S.length() <= block)
			return S;
		
		StringBuffer r = new StringBuffer("");
		for(int i = 0; i < S.length(); i++) {
			String ch = Character.toString(S.charAt(i));
			r.append(ch);
			if(i > 0 && ((i+1) % block) == 0)
				r.append(" ");
		}

		return r.toString().trim();
	}
	
	@Override
	public String display() {
		if(ccNum == null)
			return "[4444 4444 4444 4444]";
		String txtbox = ccNum.display().trim();
		String input = txtbox.substring(txtbox.indexOf("[") + 1);
		input = input.substring(0, input.indexOf("]"));
		// TODO Add login to introduce spaces in the "txtbox"
		input = formatCardNumber(input);
		return "[" + input + "]";
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		ccNum.addSubComponent(c);
	}

}
