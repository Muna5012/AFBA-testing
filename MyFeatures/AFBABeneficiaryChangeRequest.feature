@RequestChange
Feature: AFBA Customer Portal Request Beneficiary Change test feature 
Scenario: AFBA Customer Portal Request Beneficiary Change test scanario

Given Input Username, Password and click Login to Login account
When Click Request Beneficiary Change links
Then Get title of Beneficiary Change Request
And Get text of Account Number, Status, Crated Date, Decision Date
Then Get text of first beneficiary 
