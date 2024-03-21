Feature: Search Functionality
Background: 
Given user navigate to search field functionality

Scenario: Search for valid Item/product
When user enters valid Item into search field 
And user click on search button
Then user get available option 

Scenario: Search for non existing Item
When user enters non existing Item into search field 
And user click on search button
Then invalid item massage should displayed

Scenario: Search without providing any item
When user dont enter any product into search field 
And user click on search button
Then error massage should display