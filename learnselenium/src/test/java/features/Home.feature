Feature: Feature one

Scenario Outline: Verify the logo text
 Given I have opened the application
 When I view the home page
 Then the logo text should be "<Logotext>"
 
 Examples:
 |Logotext	|
 |Wikipedia\nThe Free Encyclopedia|
  
 @Login
 Scenario: Second scenario in First feature
 Given I have opened the application
 When I view the home page
 Then the search box should be visible