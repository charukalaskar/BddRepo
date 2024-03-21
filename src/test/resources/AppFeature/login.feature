Feature: Login Functionality
Scenario: Login to application
Given I am at the login Page
When I enter Username
And  I enter Password
And I click on login button
Then I should get logged into application