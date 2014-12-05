Feature: covers saving and validating quotes

Scenario: user wants to save quote 1234
	Given I have loaded a quote
	When I select the save button
	Then the quote saves to Universe
	And the quote ID is "1111"
	
	
	Scenario: user wants to save the quote 2345
	Given I have loaded a quote
	When I select the save button
	Then the quote saves to Universe
	And the quote ID is "1112"
	
# you can add multiple scenarios to a feature
#Scenario: next scenario
#	Given .....
#	When ....
#	And ....
#	Then ....

