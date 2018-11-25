# Comparison Lab1 implementation of Gumball machine with AspectJ-approach:
--------------
## Lab1 Implementation:
   - The Lab1 implementation contains 1 abstract class named 'GumballMachine' and 3 child classes one for each - 25 cent, 50 cent and Any cent Gumball Machines.
   - Based on user choice, the respective class is instantiated and its object is used to perform actions like insertCoin, turnCrank, dispenseGumball. 
   - To add a new kind of Gumball machine, one has to create a new class for that kind and provide implementation for respective actions to it so that users can us it.

## Implementation using AspectJ:
   - AspectJ makes the code quite manageable. 
   - Using the AspectJ, the programmer can simply change the structure of a class at compile time based on the configurations selected in the config file. 
   - So, unlike the Lab1, new kind (configuration) of GumballMachine can be easily added by simply introducing new AspectJ file.
