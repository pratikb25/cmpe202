CRC cards:
==========
(A) Class Customer:
	(1) Responsibilities:
		- Sign up for a table
		- Receive notifications about available table
		- Confirm the reservation
		- Cancel the reservation
	(2) Collaborators:
		- ReservationManager

(B) Class ReservationManager:
	(1) Responsibilities:
		- Add customer to the waitlist in the waitlist
		- Remove customer from the waitlist
		- Notify the customer if a table is available
		- Receive customer response - confirmed or declined
		- Allocate table to the customer
		- Check if a table is available
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

(D) Class Customer:
	(1) Responsibilities:
		- Maintain a list all the tables at the restaurant
		- Check if a table is occupied or not
		- Update status of a table - occupied or unoccupied
		- Return a list of available tables and their capacity as required by the ReservationManager
	(2) Collaborators:
		- Table

(E) Class Table:
	(1) Responsibilities:
		- Maintain the current status of the table - occupied or unoccupied
		- Maintain the maximum seats available at the table
	(2) Collaborators:
		- None
