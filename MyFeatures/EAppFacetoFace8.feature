@eApp8
Feature: FedTerm (LT12) With two Adult Child and First Protect (LT15), Enrollment state specific NC. Both LT12 or LT15 Contingent Beneficiary FacetoFace test feature
Scenario: Better Alternative FedTerm (LT12) With Adult Child first protect (LT15) and Enrollment state specific NC. Both LT12 or LT15 Contingent Beneficiary  test scenarios

When Click Manage Cases button 
Then Search AFBA cases and click it 
And Click NewEnrollement button to create new case
Then Input Sponsor SSN, Enrollment City, Enrollment State 

And click the Begin Enrollement button to create new Case
Then Input the Sponsor FirstName, LastName and DOB 
Then Select the SponsorGender 
Then Input Spouse information FirstName, LastName, DOB	
And Click Include Children button, input child information first name, last name, DOB 
And Clilk add child button for add more Children
Then Input second child information first name, last name, DOB

Then Select Military on Eligibility option
And Select Air Force on Branch of service 
Then Select Active Duty Status
Then Select O ten for Rank
Then Select Militart Allotment on ContributionMode
Then Input Department Code, Source Code
And Input Street information, City, St Zipcode
Then Input Email Address for confimation
Then Input Daytime phone numbers
Then Click Show Coverage Options to select Benefitiary plans

And Waived Better Alternative and Application Member Benefit 
Then Select FedTerm Tobacco for Sponsor and Spouse, NonTobacco for two adult kids
And Select Customize One Hundred Thousand for Spouse and fifty thousand for Sponsor 
Then Click First Protect select fifty thousand K for two adult kids
And Click Next button to answer all the questions
Then On Next page input Sponsor information, Height and Weight
And Next Page input Spouse information, SSN, Gender, Height and Weight
Then Input Children information, SSN, Gender, Height, Weight and Relationship
And Next page input Beneficiaries for FedTerm Sponsor Contingent Beneficiary FullName, SSN, Relationship and DOB
Then Input Spouse Primary Beneficiary FullName, SSN, Relationship and DOB
And Input Beneficiaries for First Protect Contingent Beneficiary of Demitri FullName, SSN, Relationship and DOB
Then Input Beneficiaries for First Protect Primary Beneficiary of Raven FullName, SSN, Relationship and DOB
And Then Input Beneficiaries for First Protect Contingent Beneficiary of Raven FullName, SSN, Relationship and DOB

Then Click Email Summary to coverage confirmation to email address
And Click Signing in Person button and Click I agree to this coverage and am ready to sign button
Then Review Application Ducuments to Continue
And Input Sponsor LastName for confirm
And Input Sponsor last SSN numbers for confirm
Then Select Paper Option
And Click Sign Button for eSignature to application