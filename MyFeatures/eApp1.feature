@eApp1
Feature: eApp application Feature 
Scenario: eApp application Feature test scenarios

	When HomePage to click Manage cases button 
	Then Input search to find AFBA case 
	And click AFBA case 
	Then create a New Enrollment  
	
	Then Input Sponsor SSN 
	Then Input Enrollement City
	Then Input Enrollement State and click Next button
	And Click the Next Button
	Then Click Begin Enrollement button
	
	And Input Sponsor firstName, lastName, dateOfBirth 
	And Select Sponsor gender 
	And Select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode 
	Then Input DepartmentCode and SourceCode 
	Then Input Sponsor address, Email and contact numbers 
	Then Click Show Coverage Options button 
	
	And Select Better Alternative Roy option
	Then Click Applicationfor member benefit
	Then Select waive enrollment in Application radio button
	Then click Next button for next page
	
	Then Click Answer No to All Questions button
	And Click Next button 
	
	Then Input Sponser height and weight
	And Click the Next button again
	
	Then Click Next button for Spouse or child info
	
	And Input Beneficiaries for Better Alternative Sponsor Full Name
	Then Input Beneficiary SSN
	Then Select Relationship
	And Input Beneficiary DOB
	
	Then Click Contingent Beneficiary for Sponsor Coverage Someone else
	And Input Contingent Beneficiary of Sponsor Coverage Beneficiary Full Name
	Then Input Contingent Beneficiary of Sponsor Coverage SSN 
	And Select Contingent Beneficiary of Sponsor Coverage Relationship
	Then Contingent Beneficiary of Sponsor Coverage DOB
	And Click Next button for Confirmation page
	
	And Click Signing in person option
	Then Click I agree to this coverage and ready to sign button
	
	Then Click the Review Application Ducuments 
	Then Close the Application 
	And Input sponsor lastName 
	And Input Last four SSN number 
	Then Select Paper radio button 
	Then Click Sign button 
	And Click Sign button for Angent eSignature 


	