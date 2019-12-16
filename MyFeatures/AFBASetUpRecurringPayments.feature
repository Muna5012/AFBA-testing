@5setUpPayment
Feature: AFBA Customer Portal set up Payment Details for Recurring Payment test feature 
Scenario: AFBA Customer Portal set up Payment Details for Recurring Payment test scanario

Given Input Username, Password and Click Login button on Login page
When Click Set up Recurring Payments button
Then Get text of Payment Details for Recurring Payments
And Get text of Payment method and select it
Then Get text of Card Type and Select it
And Get text of Cardholder Name and Input name
Then Get text of Card Number and Input Credit or Debit Card Number
And Get text of Expiration Date, Select mounth and Years
Then Get text of CVV Number and Input three digit CVV numbers
And Get text of Billing Zip Code and input zip code
Then Get text of title of status
And Get text of Selected, Account, Insured, Relation, Status and Payment Day information
Then Click authorize informaion and get all the Text
And Click Process button

Then Get text of E Check
Then Select E Check recurring payment
And Get text of Account Type and select Checking account type
Then Get text of Routing Number and input Routing Number
And Get text of Account Number and input account number
Then Get text of Bank Details
And Selected each account and select payment day for each account
Then Click radio button to confirm all information
And Click Process button to 
