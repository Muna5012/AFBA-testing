@NewPolicy
Feature: National Guard Platform select Policy to create new Policy test feature 
Scenario: National Guard Platform select Policy to create new Policy test scenario

Given login NGP and select Portfolio and create the New Policy
When Input Policy or Account Number
Then Select the Owner for new Policy
And Select Insured on the contacts
Then Select the Payor on the contacts
And Input Product Code
Then Search the Group Details 
And enter Reporting Unit Code
Then Search Reporting Unit Detail
And Select Affiliation Code
Then Enter Number of Children
And Enter Contact Reason
Then Enter NG Association Fee
And Enter Balance Due
Then Enter Frequency Amount
And Enter Annual Premium
Then Enter Last Payment
And Enter Suspense
Then Payment Frequency
And Payment Method
Then Enter Paid To Date
And Enter Last Payment Date
Then Enter Product Effective Date