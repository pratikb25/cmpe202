

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		// 1
		gumballMachine.setMachineType(MachineTypes.MACHINE_ANY);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertNickel( 5 );
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		// 2
		gumballMachine.setMachineType(MachineTypes.MACHINE50);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

	}
}
