@oneTimePayment
Feature: AFBA Customer Portal Make a One time Payment test feature 
Scenario: AFBA Customer Portal Make a One time Payment test scanario

Given Input Username, Password and click Login button on Login account
When Click Make a One time Payment button
Then Get text of Please select at least one policy for payment
Then Get text of Payor Details
And Get text of Firstname, Lastname, Email, Address, City, status
Then Get text of Selected, Account, Insured, Status, Paid Thru Date, Balance Due, Suspense Amount, Amount To Pay
And Get text of first beneficiary information 
Then Get text of second beneficiary information
And Get text of third beneficiary information
Then Get text of fourth beneficiary information
And Get text of fifth beneficiary information
Then Get text of sixth beneficiary information
And Select first policy payment
Then Select second policy Payment
Then Get text of Total Amount to Pay
And Click Next button to One Time Payment
Then Get text of Payment Details For One Time Payment
And Get text of all Credit Card Details
Then Get text of Account, Insured, Status, Paid Thru Date, Balance Due, Suspense Amount, Amount to Pay
And Get text of first policy payment details on One Time Payment page
Then Get text of second policy payment details on One Time Payment Page
Then Get text of Total Amount to Pay number
And Get text of all notes
Then Click Pay Now button 