
public class GumballMachine
{

	private int num_gumballs;
	private boolean has_quarter;
	private MachineTypes machineType;
	private int valueOfCoins;

	public GumballMachine( int size )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.has_quarter = false;
		machineType = MachineTypes.UNRECOGNIZED;
		valueOfCoins = 0;
	}

	public void setMachineType(MachineTypes type)
	{
		if(type != MachineTypes.MACHINE25 && type != MachineTypes.MACHINE50 && type != MachineTypes.MACHINE_ANY)
			machineType = MachineTypes.UNRECOGNIZED;
		else
			machineType = type;
		this.has_quarter = false;
		valueOfCoins = 0;
	}

	public void insertQuarter(int coin)
	{
		if(machineType != MachineTypes.MACHINE25 && machineType != MachineTypes.MACHINE50 && machineType != MachineTypes.MACHINE_ANY)
		{
			System.out.println("Unrecognized machine type! Can't accept your quarter!");
			return;
		}
		if(has_quarter)
		{
			if(machineType == MachineTypes.MACHINE25)
			{
				System.out.println("You already inserted a quarter! Please turn the crank!!");
				return;
			}
			if(machineType == MachineTypes.MACHINE50 && valueOfCoins == 50)
			{
				System.out.println("You already inserted 50 cents! Please turn the crank to eject a gumball!!");
				return;
			}
		}
		if ( coin == 25 )
		{
			valueOfCoins += 25;
			this.has_quarter = true ;
			System.out.println("You inserted a quarter!");
		}
		else
		{
			System.out.println("That's not a quarter!");
			this.has_quarter = false ;
		}
	}

	public void insertDime(int value)
	{
		if(machineType != MachineTypes.MACHINE_ANY)
		{
			System.out.println("Cannot insert a dime!");
			return;
		}
		if(value == 10)
		{
			valueOfCoins += 10;
			System.out.println("You inserted a dime!");
		}
		else
			System.out.println("That's not a dime!");
	}

	public void insertNickel(int value)
	{
		if(machineType != MachineTypes.MACHINE_ANY)
		{
			System.out.println("Cannot insert a Nickel!");
			return;
		}
		if(value == 5)
		{
			valueOfCoins += 5;
			System.out.println("You inserted a Nickel!");
		}
		else
			System.out.println("That's not a Nickel!");
	}

	public void turnCrank()
	{
		int nGumballs = 0;

		switch(machineType)
		{
			case MACHINE25: 
				if ( this.has_quarter )
				{
					if ( this.num_gumballs > 0 )
					{
						this.num_gumballs-- ;
						this.has_quarter = false ;
						valueOfCoins -= 25;
						System.out.println( "Thanks for your quarter. Gumball Ejected!" ) ;
					}
					else
					{
						System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
					}
				}
				else 
				{
					System.out.println( "Please insert a quarter" ) ;
				}
				break;
			case MACHINE50:
				if(has_quarter && valueOfCoins >= 50)
				{
					nGumballs = valueOfCoins / 50;
					if(nGumballs <= num_gumballs)
					{
						System.out.println("Thanks for your 50c. Here are/is your " + nGumballs + " gumballs(s).");
						num_gumballs -= nGumballs;
						has_quarter = false;
						valueOfCoins -= (nGumballs * 50);
					}
					else
					{
						System.out.println("No More Gumballs!  Sorry, can't return your money.");
					}	
				}
				else
					System.out.println("Please insert more quarter(s)!");
				break;
			case MACHINE_ANY:
				if(valueOfCoins >= 50)
				{
					nGumballs = valueOfCoins / 50;
					if(nGumballs <= num_gumballs)
					{
						System.out.println("Thanks for your 50c. Here are/is your " + nGumballs + " gumballs(s).");
						num_gumballs -= nGumballs;
						has_quarter = false;
						valueOfCoins -= (nGumballs * 50);
					}
					else
						System.out.println("No more Gumballs! Sorry, can't return your money.");
				}
				else
					System.out.println("Please insert more coins and then, turn the crank!");
				break;
			default: 
				System.out.println("Unrecognized machine type!");
		}
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled 25c Standing Gumball Model #2004");
		result.append("\nInventory: " + num_gumballs + " gumball");
		if (num_gumballs != 1) {
			result.append("s");
		}
		result.append("\nMachine type: " + machineType);
		result.append("\nRemaining coin value: " + valueOfCoins + " Cents");
		result.append("\n");
		return result.toString();
	}

}
