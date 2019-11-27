@mainPage
Feature: AFBA Customer Portal Main page test feature 
Scenario: AFBA Customer Portal Main page test scanario

Given Get text of Welcome
When Get text of Member Name
Then Get text of Primary Mailing Address
And Get text of Email Address
Then Get text of Primary Phone Number
And Get text of Mobile Phone Number
Then Get Text of You Active Policies
And Get Text of Account, Coverafe Amount, Balance Due, Paid Thru Date and Download Informations
Then Click Edit Contact Information button
#And Click Edit Password button
#Then Change Password to input Old Password, New Password, Confirm Password
#And Click Save Button to save new Password 
Then Click Edit Primary Mailing Address button
And Address Change input Mailing Street, City, State and ZipCode
Then Click Save Button to saving new Address
And Navigate back to Edit Contact Information Page to click Edit Email Address button
Then Input New Email address
And Click Save button to save it 
Then Click Edit Milliraty Salutation
And Select Branch of Service, Rank And Duty Status
And Click Edit Primary Phone Number
Then Input New Phone Number and Save it
And Click Edit Mobile Phone Number
Then Input New Mobile Phone Number and save It
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





