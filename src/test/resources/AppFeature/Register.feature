Feature: Register User
# This is comments
Scenario: Register with mandatory field

Given user navigate to Register Account Page
When user enters firstname "Arun" into the firstname field
And enters lastname "Motoori" into the last name field
And enters email address "arun.motoori@gmail.com" into the Email field
And enters telephone 1245678911 into the telephone field
And enters password 12345 into password field
And enters password 12345 into password confirm field
And select privacy policy field
And clicks on continue button
Then Account should get successfully created


Scenario: Register with all fields
Given user navigate to Register Account Page
When user enters firstname "Arun" into the firstname field
And enters lastname "Motoori" into the last name field
And enters email address "arun.motoori@gmail.com" into the Email field
And enters telephone 1245678911 into the telephone field
And enters password 12345 into password field
And enters password 12345 into password confirm field
And select yes for Newsletter
And select privacy policy field
And clicks on continue button
Then Account should get successfully created

Scenario: Register without providing any fields
Given user navigate to Register Account Page
When user Clicks on continue button 
And Warning messages should be displayed for all the mandatory fields

Scenario: Register with Duplicate email address
Given user navigate to Register Account Page
When user enters firstname "Arun" into the firstname field
And enters lastname "Motoori" into the last name field
And enters email address "amootoricap9@gmail.com" into the Email field
And enters telephone 1245678911 into the telephone field
And enters password 12345 into password field
And enters password 12345 into password confirm field
And select yes for Newsletter
And select privacy policy field
And clicks on continue button
Then Warning message informating the User about duplicate email address should have displayed

