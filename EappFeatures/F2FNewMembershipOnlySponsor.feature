@F2F1
Feature: New Membership Application (on group free) staging site put the implementation of the membership application with contributory benefits and LT20, Only sponsor select Law Enforcement test feature 
Scenario: New Membership Application (on group free) staging site put the implementation of the membership application with contributory benefits and LT20, Only sponsor select Law Enforcement test scenarios

	When HomePage to click Manage cases button 
	Then Input search to find IT QA Automation Face2Face case 
	And click IT QA Automation Face2Face case 
	Then create a New Enrollment  
	
	Then Input Sponsor SSN 
	Then Input Enrollement City
	Then Input Enrollement State
	And Click the Next Button
	Then Click Begin Enrollement button
	
	And Input Sponsor firstName, lastName, dateOfBirth and gender 
	And Select Law Enforcement on Eligibility, Cerdit Card on Contribution Mode
	Then Input Department Code and Source Code
	Then Input Sponsor address, Email addresses and contact numbers 
	Then Click Show Coverage Options button 
	
	And Select Covered on group free and answer No for first, select Yes on second question
	Then Select Customize sponsor on FedTem and First Protect
	Then Answer all the Questions on next page
	Then Input Sponser Rank or Grade, height and weight on next page
	And Skip the Spouse and Children Information Page
	
	And Input Beneficiary for group free sponsor primary beneficiary full name, SSN, relationship and DOB
	Then Input Beneficiary for group free sponsor contingent beneficiary full name, SSN, relationship and DOB
	And Input Beneficiary for Fed Term sponsor primary beneficiary full name, SSN,relationship and DOB
	
	And Click Email summary btn and input Email address
	Then Input Credit Card Number, expiration Date and CVV
	And Select signing in person button
	Then Click I agree to this coverage and ready to sign button
	Then Click the Review Application Ducuments 
	And Input sponsor lastName, Last four SSN number 
	Then Select Paper radio button and Sign the application



	