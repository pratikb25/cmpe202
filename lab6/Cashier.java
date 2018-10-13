

public class Cashier {

	public static void main(String[] args) {
		// Generate data set
		// 1. Create new order
		Order order = new Order(123, "08/25/2018", "06:24:55 PM");
		
		// 2. Add item: LBB
		String lbbToppingOnTopBun[] = {"Lettuce", "Tomato"};
		String lbbToppingOnBottomBun[] = {"G Onion", "Jala Grilled"};
		String meat = "Baccon";
		Item lbb = new Item("LBB", 5.59, 1, lbbToppingOnBottomBun, lbbToppingOnTopBun, meat);
		order.addItem(lbb);
		
		// 3. Add item: LTL CAJ
		Item caj = new Item("LTL CAJ", 2.79, 1, null, null, null);
		order.addItem(caj);
		
		// Now, initialize the context switcher
		ContextSwitcher context = new ContextSwitcher(new PrintPaymentSlipStrategy());
		
		// Print pay slip
		System.out.println("Printing Payment Slip ##########################");
		context.executePrinter(order);
		
		// Print order slip
		System.out.println("\n\nPrinting Packaging Slip ##########################");
		context.setStrategy(new PrintOrderSlipStrategy());
		context.executePrinter(order);
	}
}
