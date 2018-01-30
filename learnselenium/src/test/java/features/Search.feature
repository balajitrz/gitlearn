Feature: Search

Scenario Outline: Verify search opens the results page
 Given I have opened the application
 When I perform a search with "<SearchTerm>"
 Then the India page is open
 
 Examples:
 |SearchTerm|
 |India|