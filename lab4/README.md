**CRC cards:**
==============
(A) Class Customer:
	(1) Responsibilities:
		- Sign up for a table
		- Receive notifications about availablility of table
		- Confirm the waitlist
		- leave the waitlist
	(2) Collaborators:
		- ReservationManager

(B) Class ReservationManager:
	(1) Responsibilities:
		- Accept Customer details - name, cell phone and number of people in the party
		- Send sign-up confirmation
		- Add customer to the waitlist in the waitlist
		- Remove customer from the waitlist
		- Notify the customer if a table is available
		- Receive customer response - confirmed or declined
		- Allocate table to the customer
		- Check if a table is available
		- subscribe to TableManager
	(2) Collaborators:
		- Customer
		- TableManager
		- WaitlistHelper

(C) Class WaitlistHelper:
	(1) Responsibilities:
		- Maintain a waitlist of customers
		- Append a customer to the waitlist
		- Remove a customer record from the list
		- Search the list as per requirements provided by ReservationManager
		- Return next customer record in line
	(2) Collaborators:
		- None

(D) Class TableManager:
	(1) Responsibilities:
		- Maintain a list all the tables at the restaurant
		- Check if a table is occupied or not
		- Update status of a table - occupied or unoccupied
		- Return a list of available tables and their capacity as required by the ReservationManager
		- Notify ReservationManager about table availability
	(2) Collaborators:
		- ReservationManager
		- Table

(E) Class Table:
	(1) Responsibilities:
		- Maintain the current status of the table - occupied or unoccupied
		- Maintain the maximum seats available at the table
	(2) Collaborators:
		- None

**Detailed roles of above classes:**
====================================
(1) Class Customer: Represent a customer. Each instance indicates a customer who signs-up for the reservation
(2) Class ReservationManager: Main class that Manages waitlist as well as is responsible to allocate vacant table(s) to appropriate customer in the waitlist (based on the no. of people accompanying). It subscribes to the TableMAnager class for get notifications regarding the table availibility.
(3) Class WaitlistHelper: Maintains the waitlist and performs CRUD operations on the list. Simple helper class for ReservationManager.
(4) Class TableManager: Manages the tables at the restaurant. Notifies ReservationManager whenever a table is available.
(5) Class Table: Class for each Table instance. Has two properties: (a) Current status - occupied or available and (b) max seat count

**Design patterns:** 
====================
Following design patterns are applicable to waitlist scenario:
**(1) Singleton Design Pattern:**
**Explanation:**
The main intent to choose "Singleton design pattern" is to ensure that there are **only one instance** of the ReservationManager, WaitlistHelper and TableManager classes. Each of these three classes maintain a unique lists of objects: the **WaitlistHelper** class maintains list of customers whereas the **TableManager** maintains a unique list of all the tables (occupied as well as un-occupied) tables in the restaurant. The **ReservationManager** is the main driver class which communicates with **Customer**, **WaitlistHelper** and **TableManager** classes. A customer should interact with only one "ReservationManager". In simple words, there should be one and only one "ReservationManager" who is responsible to track customers and allocate tables to them. The use of **singleton** pattern will ensure this while making future modifications by preventing creation of multiple instances of these objects and avoiding accidental changes to the code.

**Objects that play role in singleton pattern:**
- Class ReservationManager
- Class WaitlistHelper
- Class TableManager

**(2) Observer Design Pattern:**
**Explanation:**
The customer signs up with the ReservationManager who is responsible to add the customer to the waitlist. The TableManager is responsible efor maintaining the tables at the restaurant. The ReservtionManager **subscribes to** the TableManager. Now, whenever, a table is available, the TableManager notifies to the ReservationManager about the vacant table and its seat capacity. The ReservationManager picks a customer from its waitlist and sends him/her an SMS (or **publishes**) about it so that customer can either decide to accept or leave. In simple words, the ReservationManager **subscribes** to the TableManager for the information regarding the availibility of vacant tables and the TableManager notifies the appropriate ReservationManager whenever a table is free. Such publisher-subscriber relationship is achieved through the **Observer Design Pattern**. Here the TableManager is the subject and ReservationManager is the observer.

**Objects that play role in observer pattern:**
- Class ReservationManager
- Class TableManager


