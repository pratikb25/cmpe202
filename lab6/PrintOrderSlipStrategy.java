

public class PrintOrderSlipStrategy implements Printer {
	public void printMe(Order order) {
		System.out.println("Order Number: " + order.orderNumber);
		System.out.println(order.date + "\t" + order.time);
		System.out.println("\tFIVE GUYS\t");
		for(Item i : order.items) {
			System.out.println(i.name + "\t\t\t");
			if(i.toppingsOnTopBun != null) {
				for(String topping : i.toppingsOnTopBun)
					if(!topping.equals(""))
						System.out.println(topping);
			}
			if(i.toppingsOnBottomBun != null) {
				for(String topping : i.toppingsOnBottomBun)
					if(!topping.equals(""))
						System.out.println("->| " + topping);
			}
			if(i.meat != null)
				System.out.println("{{{{ "+ i.meat +"}}}}");
			System.out.println("\n");
		}
	}
}