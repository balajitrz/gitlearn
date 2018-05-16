Feature: Feature one

Scenario Outline: First scenario in first feature
 Given I have opened the application
 When I try to search on <keyword>
 Then I should be taken to results page with relevant results
 
 Examples:
 |keyword|
 |news|
 |weather|
 
 @Login
 Scenario: Second scenario in First feature
 Given I have opened the application
 When I enter a <keyword> and click IamFeelingLucky button
 Then I should be taken to corresponding website