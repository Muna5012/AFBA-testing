@NewClaimIntake
Feature: National Guard Platform New Claim Intake steps test feature 
Scenario: National Guard Platform New Claim Intake steps test scenario

Given login NGP and select Contacts and input contact Number
When Select New Claim Intake
Then Select the reported Date
And Select the Relationship to Member option
Then Input Deceased First Name
And Input Deceased Last Name
Then Input Deceased SSN
And Input Deceased Date of Birth
Then Input Deceased DOD
And Select The Cause of Death
Then Input Notes And Total Coverage in Force
And Input Basic SSLI Coverage
Then Input Enhanced SSLI Coverage
And Input No Cost Paid
Then Input Total Payable By SSLI
And Input Unit POC, Unit Address Stress, city, state,ZipCode
