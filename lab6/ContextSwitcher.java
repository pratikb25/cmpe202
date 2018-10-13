

public class ContextSwitcher {
	private Printer myPrinter;
	
	public ContextSwitcher(Printer myStrategy) {
		this.myPrinter = myStrategy;
	}

	public void setStrategy(Printer newStrategy) {
		this.myPrinter = newStrategy;
	}

	public void executePrinter(Order order) {
		myPrinter.printMe(order);
	}
}
