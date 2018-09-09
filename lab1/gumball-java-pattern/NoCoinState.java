
public class NoCoinState implements State {
	GumballMachine gumballMachine;

	public NoCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoins(int value) {
		String coinType = "";
		switch(value) {
		case 5:
				coinType = new String("Nickel");
				break;
		case 10:
				coinType = new String("Dime");
				break;
		case 25:
				coinType = "Quarter";
				break;
		default:
				System.out.println("You cannot insert this coin!");
				return;
		}
		System.out.println("You inserted a " + coinType + "!");
		gumballMachine.setCoin(gumballMachine.getCoin() + value);
		if(gumballMachine.hasEnoughCoins())
			gumballMachine.setState(gumballMachine.getHasCoinState());
		else
			System.out.println("Insert more coins!");
	}

	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
		if(gumballMachine.getCoin() > 0) {
			System.out.println("Returning your " + gumballMachine.getCoin() + " coin(s)!");
			gumballMachine.setCoin(0);
		}
		else 
			System.out.println("Insert a coin!");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	} 

	public String toString() {
		return "waiting for quarter";
	}
}
