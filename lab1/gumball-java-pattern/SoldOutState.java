

public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoins(int value) {
		System.out.println("You can't insert a coin, the machine is sold out");
	}

	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted any coin");
	}

	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "'Sold out' State";
	}
}
