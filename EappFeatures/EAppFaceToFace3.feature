@face3
Feature: EApp Application Better Alternative test, state specific NC which SOH is five questions, this product include Contingent Beneficiary FaceToFace test feature
Scenario: EApp Application Better Alternative test, state specific NC which SOH is five questions, this product include Contingent Beneficiary test scenarios

	When Home page click Manage cases button
	Then Ale to search AFBA case
	And Create New Enrollement for case census
	Then Input valid Sponsor SSN number
	Then Input City of Enrollment 
	Then Input State of Enrollment
	And Click Next Button for next page
	
	Then Click Begin Enrollement
	And Input Sponsor firstName, lastName, DOB
	And Select the Sponsor gender 
	And Select Eligibility, Contribution Mode, Branch Of Service, Duty Status and Rank
	Then Input Department and Source Code 
	Then Input Sponsor address, Email address and contact numbers 
	Then Click Show Coverage Options button select benefit plans
	
	And Select Better Alternative NonTobacco
	Then Click Application for Member Benefit option 
	Then SelectWaive enrollment for this application
	Then click Next button for answer question
	Then Click Answer No to All Questions
	And Click Next button for Sponsor information
	Then Input Sponser height feet and inches 
	Then Input weight Lbs and click Next button
	Then Click Next button for Spouse and child information

	And Input Primary Beneficiaries Sponsor FullName
	Then Input Primary Beneficiary SSN
	Then Select Primary Beneficiary Relationship option
	And Input Primary Beneficiary Date of Birth
	
	Then Click someone else to add Contingent Beneficiary
	And Input Contingent Beneficiary Full Name
	Then Input Contingent Beneficiary SSN number 
	And Select Contingent Beneficiary Relationship
	Then Input Contingent Beneficiary DOB
	
	And Click Next button for Confirmation
	And Select Signing in person option 
	Then Click I agree to this coverage and ready to sign button to confirm 
	Then Click Review Application Ducuments button
	Then Close the Application Document
	And Input valid sponsor last Name 
	And Input valid last four SSN Number
	Then Select Paper 
	Then Click Sign Button
	And Click Sign Button for Angent eSignature option 
	
	