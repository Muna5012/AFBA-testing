@eApp7
Feature: Better Alternative FedTerm (LT12) With Adult Child first protect (LT15) and Enrollment state specific MO. Both LT12 or LT15 Contingent Beneficiary test feature
Scenario: Better Alternative FedTerm (LT12) With Adult Child first protect (LT15) and Enrollment state specific MO. Both LT12 or LT15 Contingent Beneficiary  test scenarios

When Home page to click Manage Cases button 
Then Search AFBA cases 
Then Click the AFBA case Owner Agent Hugh Wang
And Click New Enrollement button to create new case
Then Input Sponsor valid SSN
And Input Sponsor Enrollment city
Then Select Sponsor Enrollment state 

And click Begin Enrollement button to create new case
Then Input Sponsor first name, last name and DOB 
Then Select Sponsor gender option
And Click marreid button 
Then Input Spouse first name, last name, DOB	
Then Click include children button
And Input child first name, last name, DOB 
And Clilk add child button for add more child
Then Input second child first name, last name, DOB

Then Select Military on Eligibility 
And Select NOAA on Branch of service 
Then Select Active Duty on Duty Status 
And Select O7 on Rank   
Then Select Militart Allotment on Contribution Mode
Then Input SourceCode
And Input Street one, Street two, City, St Zipcode
Then Input Email Address, repeat Email address for confimation
Then Input phone numbers
Then Click Show Coverage options to select Benefitiary Plans

And Waived Better Alternative 
Then Waived Application Member benefit five thousand K 
And Select FedTerm Nontobacco for sponsor and spouse, Tobacco for both kids
Then Select Sponsor Customize One Hundred Thousand k on Fed Term
And Select Spouse Customize One Hundred Thousand K on Fed Term
Then Select First Protect to Customize Fifty Thousand K for both kids
And Click Next button for next steps
Then Answer No to all Questions
And Select Sponser information, SSN, Height and Weight
Then Select Spouse information, Gender, Height and Weight
And Select Children information, Gender, Height, Weight and Relationship

Then Select Beneficiary for FedTerm Sponsor Primary Beneficiary  FullName, SSN, Relationship and DOB
And Select Beneficiary for FedTerm Sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB

Then Select Beneficiary for FedTerm Spouse Primary Beneficiary FullName, SSN, Relationship and DOB
And Select Beneficiary for FedTerm Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB

Then Select Beneficiaries for Frist Protect first child Primary Beneficiary FullName, SSN, Relationship and DOB
Then Select Beneficiaries for Frist Protect second child Primary Beneficiary FullName, SSN, Relationship and DOB

And Click Signin person option
Then Click I agree to this coverage sigin button
Then Click Review Application Ducuments to Continue Button and close it
And Input Sponsor Last Name for confirmation
And Input Sponsor last four SSN numbers for confirmation
Then Select Paper Option for receive the document
And Click Sign Button for eSignature to this applications
 
