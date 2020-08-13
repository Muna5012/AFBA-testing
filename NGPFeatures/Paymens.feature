@payment
Feature: National Guard Platform Payment tab page test feature 
Scenario: National Guard Platform Payment tab page test scenario

When login NGP and select Payment button
#Then Select Recently Viewed
#And Select All the list
Then Select February 
And Check Payment Statement Name, Status, Account, Pay Period and Status
Then Check Insurance Volume Member, Spouse and Dependant Insurance Volume 
And Check Member Lives, Spouse Lives, Dependent Lives
Then Check Payment Summary Total Billing, Total Onetime,, Total DFAS, Total Traditional Air, Total Traditional Army
And Check the Payment Summary of Total AGR Air, Total AGR Army, Total Retired, Previous Statements Balance
And Check the Payment Summary of Inforce Contribution, Total Allocation, Current Statemnt Balance, Total Association Fee, Check Amount

