/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.regex.*;

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNumDecorator(new CreditCardNum());
        exp = new CreditCardExpDecorator(new CreditCardExp());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(Pattern.matches("([0-9])|X|x", ch)) {
    		count++;
    		screen.key(ch, count);
    		if(ch.matches("x|X")) {
    			if (count > 0)
    				count = count - 2;
    			else
    				count = 0;
    		}
    	}
    }
}

