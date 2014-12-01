Feature: navigate to weather forecast from bbc site

Scenario: select weather from main bbc site
	Given I am on the bbc site
	When I select the weather link
	And I enter Barnstaple into the search box
	Then the weather forecast page loads for Barnstaple
	
