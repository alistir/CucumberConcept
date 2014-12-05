Feature: runs a scenario multiple times based on values from a data table

Scenario Outline: user wants to save quote 
	Given I have loaded a quote
	When I select the save button
	Then the quote saves to Universe
	And the customer is <Customer>
	And the quote ID is <QuoteId>
	
	Examples:
	|QuoteId|Customer|
	|"1111"|Mr Ben|
	|"1112"|Mr Mike Jones|
	|"1113"|Mrs Rachel Simpson|
	