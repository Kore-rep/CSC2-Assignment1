UCT CSC2 Assignment 1

@author: Angus Longmore
@date: 26/02/2020

@desc:
	A simple Java program illustrating the difference in efficency of an Array and a Binary Search Tree.
	Uses Data for loadshedding schedules from the Government of the Western Cape, South Africa
	

	To run:
		$ make
		$ java -cp bin LSArrayApp // Will display all data stored in array
		$ java -cp bin LSArrayApp "x" "y" "z" // where x is an integer between 1 and 8 representing stage, 
							y is an int between 1 and 31 representing a day of the month and 
							z is a two digit number representing a starting time in hours. 

		$ java -cp bin BSTApp // Will display all data store in Binary Search Tree
		$ java -cp bin BSTApp "x" "y" "z" // where x is an integer between 1 and 8 representing stage,
						y is an int between 1 and 31 representing a day of the month and
						z is a two digit number representing a starting time in hours. 
