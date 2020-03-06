@BA1
Feature: EApp BA4 only Sponsor on Eligibility select Military Test feature 
Scenario: EApp BA4 only Sponsor on Eligibility select Military Test scenario

When Search IT_QA Automation Call Center cases and click it 
Then Click New Enrollement button to create a Case
And Input sponsor SSN numbers, Enrollment City and Enrollment State 
Then Select Begin Enrollement
And Input the sponsor First Name, Last Name, Gender, DOB
Then Select Eligibility options 
And Select Branch Of Service 
Then Select Active Status and Rank 
And Select Contribution Mode 
Then Input Department Code and Source Code Num
And Input Street Address, City and ZipCode
Then Input Email Address and phone numbers
And Click Show Coverage Options to Select planes
Then Select Better Alternative and Customize one houndred thousands
And Waived FedTerm, First Protect and Application Member Benefit
Then Answer All Questions regarding Better Alternative
And Input Sponsor height inches and weight
Then Input Beneficiaries for Better Alternative Primary Beneficiary of sponsor Coverage Beneficiary FullName, SSN, Relationship and DOB
And Input Better Alternative sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB
Then Select Email Summary
And Select spouse sign this application click Yes
Then Applicant eSignature and select Paper to receive documents and varify it

