

public class PrintPaymentSlipStrategy implements Printer {
	public void printMe(Order order) {
		System.out.println(order.date + "\t" + order.time);
		System.out.println("\tFIVE GUYS\t");
		System.out.println("Order Number: " + order.orderNumber);
		for(Item i : order.items) {
			System.out.println(i.name + "\t\t\t" + i.total);
			if(i.meat != null)
				System.out.println("{{{{ "+ i.meat +"}}}}");
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
		}
		System.out.println("\nSub. Total:\t\t:" + order.getTotal());
	}
}
