@AddressChange
Feature: National Guard Platform Address Information Change on Contacts tab page test feature 
Scenario: National Guard Platform Address Information Change on Contacts tab page test scenario

Given login NGP and select Contacts and select the contact person name
When Select the Information Change
Then Select the type of changes
And Input Address Line
Then Input the City name
And Input State 
Then Input Country 
And Input the Zip Code
Then Input Phone Number and Email Address
And Save all the changes