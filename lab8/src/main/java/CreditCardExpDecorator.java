
public class CreditCardExpDecorator extends CreditCardExp {

	private CreditCardExp ccExp;
	
	public CreditCardExpDecorator(CreditCardExp c) {
		ccExp = c;
	}
	
    public void setNext( IKeyEventHandler next) {
    	if(ccExp != null)
    		ccExp.setNext(next);
    }	

	public String display() {
		if(ccExp == null)
			return "[MMYY]";
		String input = ccExp.display().trim();
		input = input.substring(input.indexOf("[") + 1);
		input = input.substring(0, input.indexOf("]"));
		//TODO Insert a "/" in the exp date
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
