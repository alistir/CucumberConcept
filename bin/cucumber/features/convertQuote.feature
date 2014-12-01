Feature: covers converting quotes to tickets

Scenario: user converts quote to ticket
	Given I have loaded a quote
	When I select the convert to ticket
	And the quote is valid
	Then the quote saves to Universe
	And a ticket is created
	
	
# you can add multiple scenarios to a feature
#Scenario: next scenario
#	Given .....
#	When ....
#	And ....
#	Then ....

