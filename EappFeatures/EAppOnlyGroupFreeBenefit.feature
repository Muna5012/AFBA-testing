@Applicationmember
Feature: Apply EApp Application Member Benefit five thousand K (group free benefit only) only, Eapp will error when reviewing the application prior to signature Test feature 
Scenario:  Apply EApp Application Member Benefit five thousand K (group free benefit only) only, Eapp will error when reviewing the application prior to signature Test scenario

When Search IT_QA Automation Face to Face cases and click it 
Then Click New Enrollement button to create the Case
And Input sponsor SSN, Enrollment City, Enrollment State
Then Click Begin Enrollment button to start new case
And Enter Sponsor First Name, Last Name, DOB, Gender
Then Select Eligibility options, Branch of Service Options, Duty Status Options, Rank and Contribution mode 
And Enter Department and Source Code
Then Enter Street Address, City, State, and valid Zipcode 
And Enter Email Address and repeat Email address for Confirmation 
Then Enter Daytime Phone Number
And Click Show Coverage Options to select benefit plan
Then Waived BA, Fed Term, First Protect
And Select Covered Application Member Benefit five thousand K 
Then Select Primary Beneficiaries for Application Member Benefit five thousand K
And Select Contingent Beneficiary for Application Member Benefit five thousand K
Then Click I agree to this Coverage and ready to sign in button
And Click Review Application Documents button to open the pdf file
Then Enter Spouse Last Name and Last four SSN 
And Select receive life insuarance notices and documents options and Sign in