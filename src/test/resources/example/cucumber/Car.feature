Feature: An organization of cars 

Scenario: An have the following cars in the stock 
	When The car list we have: 
		| brand    | color  | torque| hp  |
		| Seat     | blue   | 234   | 190 |
		| Audi     | black  | 2424  | 124 |
		| Mercedes | yellow | 23    | 23  |
		| Porsche  | yellow | 23    | 23  |
		
	Then the organization will have 3 cars
