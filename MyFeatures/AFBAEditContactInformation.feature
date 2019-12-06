@contactInfo
Feature: AFBA Customer Portal Edit customer Contact Information test feature 
Scenario: AFBA Customer Portal Edit customer Contact Information test scanario

Given Input Username and Password ang click button to login Account
When Click Edit Contact Information button
Then Get text of Edit Contact Information 
Then Click pencil icon to Edit Password
And Get text of Change Password, Old Passowrd, New Password, Confirm Passowrd 
Then Input Old Password, New Password, Confirm Passoword
And Click Save Button to save new Password
Then Click pencil icon to Edit Primary Mailing Address
And Get text of Address Change, Mailing Street, Mailing City, Maling State, Mailing Zip Code
And Click Save Button to save new Address
Then Click pencil icon to Edit Email Address
And Get text of Change Email, Email Address, and button of notice text
And Click Save button to save new Email Address

Then Click pencil icon to Edit Military Salutation
And Get text of Salutation Change, Branch of Service, Rank, Duty Status and Select it
And Click Save button to save new Salutation Change
Then Click pencil icon to Edit Primary Phone Number
And Get text of Change Phone and Phone Number and input new Phone number
And Click Save button to save New Phone Number
And Get text of Change Mobile Phone, Mobile Phone Number and input Mobile Phone Number
Then Save New Mobile Phone Number 

And Get text of Document Delivery Explained
And Get all the text of Document Delivery Explained

Then Get text of eDelivery
And Get all the text of eDelivery explain 
Then Select checkbox to opt in eDelivery to email

Then Get text of Text Alert 
And Get all the text of Text Alert
And Select checkbox to opt in Text Alerts to the phone number
And Select each alert you want to receive
Then Click Here button to access AFBA Text Message Terms and Conditions

Then Get text of Marketing Preference 
And Get text of all the Marketing Preference
And Select checkbox for currently opted out of receiving Marketing from AFBA third party vendors
And Click Save Changes button to save it
Then Click Ok button to save updated status









