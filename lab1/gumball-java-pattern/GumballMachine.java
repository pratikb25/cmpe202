
abstract public class GumballMachine {
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State currState = soldOutState;
	int count = 0;
	int inputCoinValue = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.inputCoinValue = 0;
 		if (numberGumballs > 0) {
			currState = noCoinState;
		} 
	}
 
	abstract public void insertQuarter();
	abstract public void insertDime();
	abstract public void insertNickel();
	abstract public boolean hasEnoughCoins();
	abstract public void ejectCoin();
	abstract public void turnCrank();
	abstract public void releaseBall();
 
	// Getter-setter methods
	public int getCount() {
		return count;
	}
 
	public void refill(int count) {
		this.count = count;
		inputCoinValue = 0;
		currState = noCoinState;
	}

	public void setCoin(int value) {
		if(value >=0)
			inputCoinValue = value;
	}

	public int getCoin() {
		return inputCoinValue;
	}

	void setState(State state) {
		this.currState = state;
	}

	public State getState() {
		return currState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is in '" + currState + "' state\n");
		return result.toString();
	}
}
