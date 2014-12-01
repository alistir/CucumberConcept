Feature: covers saving and validating quotes

Scenario: user wants to save the quote
	Given I have loaded a quote
	When I select the save button
	Then the quote saves to Universe
	
	
# you can add multiple scenarios to a feature
#Scenario: next scenario
#	Given .....
#	When ....
#	And ....
#	Then ....

