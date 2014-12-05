Feature: passes in a table of data to a step in the scenario

Scenario: user converts quote to ticket
	Given I have loaded a quote
	When I click the convert to ticket button
	And the quote is valid
	Then a ticket is created on Universe
	|field|value|
	|name|ben|
	|orderno|1234|
	|price|54.25|
	And the quote saves to Universe
	
# you can add multiple scenarios to a feature
#Scenario: next scenario
#	Given .....
#	When ....
#	And ....
#	Then ....


