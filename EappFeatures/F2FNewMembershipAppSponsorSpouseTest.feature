@F2F2
Feature: EApp Application Better Alternative FedTerm (LT12) With Child rider. LT12 generic NV. Both LT12s Contingent Beneficiary FaceToFace test feature
Scenario: EApp Application Better Alternative FedTerm (LT12) With Child rider. LT12 generic NV. Both LT12s Contingent Beneficiary test scenarios

	When Home Page to click Manage cases button 
	Then Search AFBA cases on Manage Cases page
	And Click the New Enrollement button to create case
	Then Input Sponsor SSN numbers
	And Input Enrollment city
	Then Select Enrollment state
	
	And click Begin Enrollement button to create new sponsor
	Then Input Sponsor First Name, Last Name and DOB
	Then Select Sponsor Gender
	And Click Marreid button 
	And Input Spouse FirstName, LastName and DOB
	
#	Then Click Include Children button to input child information
#	And Input Child First Name, Last Name and DOB 
#	And Clilk Add Child button for add more child
#	Then Input second child First Name and Last Name and DOB
	
	Then Select option Eligibility, Branch of service, Duty Status, Rank  
	Then Select Contribution Mode option, and Source Code
	And Input Street address, City, ST, Zip code, Email Address and repeat Email address and phone number
	Then Click Show Coverage Options to select Benefitiary Plans
	
	Then Selct Better Alternative, customize sponsor and spouse  
	Then Selct group free Application Member Benefit and answer the questions
	And Select Fed Term customize Sponsor and spouse
	Then Waive the First Protect

	And Answer all the questions on qualification page 
	And Input Sponsor informations height and Weight options
	And Input spouse information SSN, gender, height and weight

	And Input BA Alternative Sponsor primary beneficiary full name,SSN, relationship and DOB
	Then Input BA Alternative Spouse primary beneficiary full name,SSN, relationship and DOB
	And Input Group Free Sponsor primary beneficiary full name,SSN, relationship and DOB
	Then Input Fed Term Sponsor primary beneficiary full name,SSN, relationship and DOB
	Then Input Fed Term Spouse primary beneficiary full name,SSN, relationship and DOB
	
	And Select Location for Signing in person option
	Then Click I agree to this coverage and ready for sign button to signin
	Then Click Review Application Ducuments to Continue Button to review all the application
	And Input Sponsor Last Name and last four SSN numbers for confirm
	Then Select Paper Option for receive the documents
	Then Click Sign Button to Signin 
	And Click Sign Button for eSignature to this application
	
	
	
	