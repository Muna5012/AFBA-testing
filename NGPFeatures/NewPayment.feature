@NewPayment
Feature: National Guard Platform select New Payment test feature 
Scenario: National Guard Platform New Payment test scenario

Given login NGP and select Payment and create the New PRS
When Input Payment Statement Name
Then Select the Account
And Input Pay Period
Then Input Member Insurance Volume
And Input Spouse Insurance Volume
Then Input Dependant Insurance Volume
And Input Inforce Contribution
Then Input Inforce Member Contribution
And Input Inforce Spouse Contribution
Then Input Inforce Dependent Contribution
And Select the Status for the statement
Then Select the Date and Time
And Seelct the Processed By
Then Input Member Lives
And Input Spouse Lives
Then Input Dependent Lives and check the value of the buttom 
And Click Save button to save the new PRS
