
public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoins(int value) {
		System.out.println("You can't insert another coin");
	}
 
	public void ejectCoin() {
		int coinValue = gumballMachine.getCoin();
		gumballMachine.setCoin(0);
		gumballMachine.setState(gumballMachine.getNoCoinState());
		System.out.println(coinValue + " cents returned!");
	}
 
	public void turnCrank() {
		System.out.println("You turned the crank");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}
