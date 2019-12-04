@EditContactInfo
Feature: AFBA Customer Portal Edit Customer Contact Information test feature 
Scenario: AFBA Customer Portal Edit Contact Information test scanario

Given Input Username and Password ang click button to login Account
When Click Edit Contact Information button
Then Get Text of Edit Contact Information 
Then Click pencil icon to Edit Password
And Get Text of Change Password, Old Passowrd, New Password, Confirm Passowrd 
Then Input Old Password, New Password, Confirm Passoword
And Click Save Button to save new Password
Then Click pencil icon to Edit Primary Mailing Address
And Get Text of Address Change, Mailing Street, Mailing City, Maling State, Mailing Zip Code
And Click Save Button to save new Address
Then Click pencil icon to Edit Email Address
And Get Text of Change Email, Email Address, and button of notice text
And Click Save button to save new Email Address

Then Click pencil icon to Edit Military Salutation
And Get Text of Salutation Change, Branch of Service, Rank, Duty Status and Select it
And Click Save button to save new Salutation Change
Then Click pencil icon to Edit Primary Phone Number
And Get Text of Change Phone and Phone Number and input new Phone number
And Click Save button to save New Phone Number
Then Click pencil icon to Edit Mobile Phone Number
And Get Text of Change Mobile Phone, Mobile Phone Number and input Mobile Phone Number
And Click Save button to save New Mobile Phone Number
And Get all the text of Document Delivery Preference
And Get all the text of Delivery Preference
Then Select checkbox for document delivery method eDelivery to email
Then Get text of Text Alert Preference 
And Select checkbox to sign up for using my mobile device
And Select each alert you want to receive
Then Click Here button to access AFBA Text Message Terms and Conditions
Then Get text of Marketing Alert Preference 
And Select checkbox for currently opted in to receive any Marketing from AFBA option
And Click Save Changes button to save it


