Feature: An organization recruits few more employees

	Scenario: An organization recruits employees based on designations
	  When I see the following cooked I should say:
	  			| name   | role     	|
	  			| Paco   | Panadero		|   
	  			| Juan2  | Carpintero2  |
				| Juan3  | Carpintero3  |
				| Juan4  | Carpintero4  |
				| Juan5  | Carpintero5  |
				| Juan6  | Carpintero6  |
				| Juan7  | Carpintero7  |
				| Juan8  | Carpintero8  |
				| Juan9  | Carpintero9  |
				| Juan10 | Carpintero10 |
				| Juan11 | Carpintero11 |
				| Juan12 | Carpintero12 |
				| Juan13 | Carpintero13 |
	  Then the organization will have 205 Sr. Dev and 5150 Jr. Dev