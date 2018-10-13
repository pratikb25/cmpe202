

import java.util.List;
import java.util.ArrayList;

public class Order {
	double total;
	int orderNumber;
	String date;
	String time;
	List <Item> items = new ArrayList<Item>();
	
	public Order(int num, String date, String time) {
		this.orderNumber = num;
		this.date = date;
		this.time = time;
		this.total = 0;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public double getTotal() {
		for(Item i : items) {
			total += i.getPrice(); 
		}
		return total;
	}
}
