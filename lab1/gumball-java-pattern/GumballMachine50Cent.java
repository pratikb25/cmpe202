class GumballMachine50Cent extends GumballMachine {
	public GumballMachine50Cent(int nGumballs) {
		super(nGumballs);
	}

	public void insertQuarter() {
		currState.insertCoins(25);
	}

	public void insertDime() {
		System.out.println("Dimes not accepted! Insert quarters only.");
	}

	public void insertNickel() {
		System.out.println("Nickels not accepted! Insert quarters only.");
	}

	public void ejectCoin() {
		currState.ejectCoin();
	}

	public boolean hasEnoughCoins() {
		if(getCoin() >= 50)
			return true;
		else
			return false;
	}

	public void turnCrank(){
		currState.turnCrank();
		currState.dispense();
	}

	public void releaseBall() {
		if (count != 0) {
			if(inputCoinValue >= 50) {
				int nGumballs = (inputCoinValue / 50);
				if(nGumballs <= count) {
					count -= nGumballs;
					inputCoinValue -= (nGumballs * 50);
					System.out.println("Here is/are your " + nGumballs + " gumball(s) rolling out the slot...");
				}
				else
					System.out.println("Not enough gumballs!");
			}
			else
				System.out.println("Please insert more coins");
		}
		else
			System.out.println("No gumblls left!");
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled 25c Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is in '" + currState + "' state\n");
		return result.toString();
	}
}
