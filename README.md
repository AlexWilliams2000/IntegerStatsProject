# IntegerStatsProject
A simple integer statistics calculator taking csv files as input

Development environment:

  OS: Windows 10
  
  IDE: IntelliJ IDEA 2017.2.2
  
  Build tool: Maven 3.5.0
  
  Testing: junit 4.12
  
These need refinement...

Epic:

	As hobbyist integer statistician
	I want to extract integers from a CSV file
	So that I can perform statistical analysis on the integers

Stories:

	Data extraction:

		As the owner of a CSV file containing integers
		I want to extract the integers from the CSV file line by line
		So that I can aggregate them into a data structure which preserves the line structure of the original CSV file (CRLF? Win vs Linux..)

		Scenarios:
		
			Happy: One integer
			
			Happy: Many integers
			
			Happy(?): Mixed integers and other data types
			
			Error: No integers
			
			Error: Invalid data in CSV file
			
			Error: Non-CSV file
			
	Data Analysis:
	
		As the owner of a data structure containing integers in a multi-line format
		I want to perform statistical analysis on the integers
		So that I can gather the results of the analysis into a new data structure
		
		More detailed breakdown:
		
		Scenario: Calculate total number of integers
		As the owner of a data structure containing integers in a multi-line format
		I want to go through the lines one by one
		So that I can count the integers
		
		Scenario: Calculate mean of all integers
		As the owner of a data structure containing integers in a multi-line format
		I want to sum all the integers
		And count the integers
		So that I can calculate the mean of the integers to 3dp
		
		Scenario: Calculate mean of all integers
		As the owner of a data structure containing integers in a multi-line format
		I want go through the lines one by one
		So that I can find the number of integers on the line with the highest number of integers
		
		Scenario: Calculate mean of all integers
		As the owner of a data structure containing integers in a multi-line format
		I want go through the lines one by one
		So that I can find the mode of all the integers
		
			Happy: One line data structure
			
			Happy: Many line data structure
			
			Error: Empty data structure
	
	Data presentation:
	
		As the owner of a data structure containing statistics
		I want to display the statistics
		So that a data scientist can interpret the results
		
			Happy: Valid data structure containing statistics and labels
			
			Error: Invalid data structure
			
			Error: Missing labels
			
			Error: Missing statistics
  
  

  
  
