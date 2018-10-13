

public class Item {
	String name;
	double price;
	int qty;
	double total;
	String [] toppingsOnTopBun;
	String [] toppingsOnBottomBun;
	String meat;
	
	public Item(String name, double price, int qty, String []top, String []bottom, String meat) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.total = price * qty;
		this.toppingsOnTopBun = top;
		this.toppingsOnBottomBun = bottom;
		this.meat = meat;
	}
	
	public double getPrice() {
		return total;
	}
	
	public String [] getToppingsOnTopBun() {
		return toppingsOnTopBun;
	}
	
	public String [] getToppingsOnBottomBun() {
		return toppingsOnBottomBun;
	}
	
	public String getMeat() {
		return meat;
	}
}
