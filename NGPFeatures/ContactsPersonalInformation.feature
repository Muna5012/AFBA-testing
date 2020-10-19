@PersonalInformationChange
Feature: National Guard Platform Personal Information Change on Contacts tab page test feature 
Scenario: National Guard Platform Personal Information Change on Contacts tab page test scenario

Given login NGP and select Contacts and select the contact
When Select the Information Change Request button
Then Select the type of changes for Personal Information Change
And Input First Name
Then Input Last Name
And Input Middle Name
Then Input Gender, Suffix
And Input DOD ID