

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine25Cent(10);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		gumballMachine = new GumballMachineAllCent(500);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.insertNickel();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		

		/*gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);*/
	}
}
