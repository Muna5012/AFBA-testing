@OneTimePayment
Feature: AFBA Customer Portal Make a One time Payment test feature 
Scenario: AFBA Customer Portal Make a One time Payment test scanario

Given Input Username, Password and click Login button on Login account
When Click Make a One time Payment button
Then Get text of Payor Details
And Get text of Firstname, Lastname, Email, Address, City, status
Then Get text of Selected, Account, Insured, Status, Paid Thru Date, Balance Due, Suspense Amount, Amount To Pay
And Get Text of first police information 
