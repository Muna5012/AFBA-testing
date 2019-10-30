@Remote6
Feature: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship,SSN, NO DOB. Select Military Allotment Payment test feature 
Scenario: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship,SSN, NO DOB. Select Military Allotment Payment test scanario

When Click New Enrollment button input Sponsor SSN, Enrollment city, Enrollment State 
Then Select Begin Enrollment button to create new case
And Input Sponsor First Name, Last Name, Gender and Date of Birth
Then Select Married button and enter spouse First Name, Last Name and DOB
And Select Include Children button to enter Adult Child one First Name, Last Name, DOB
Then Click Add Child button to enter Adult Child two First Name, Last Name, DOB
And Click Add Child button to enter Adult Child three First Name, Last Name, DOB
Then Click Add Child button to enter Minor child one First Name, Last Name, DOB
And Click Add Child button to enter Minor Child two First Name, Last Name, DOB
Then Click Add Child button to enter Minor Child three First Name, Last Name, DOB

And Select Fire Department on Eligibility option
Then Select Checkmatic on Contribution Mode
Then Enter Street Address, City, State, ZipCode and Daytime phone numbers

And Coverage Options Waive enrollment in Better Alternative, Fed Term and Application Member Benefit
Then Select Senior Protect Customize spouse
And First Protect No benefit for Sponsor and spouse Customize three adult children fifty thousand K
Then Children Protect Covered three Minor children 
And Answer all the questions Yes or NO for Qualification 
Then Input Sponsor Information which include Height and Weight 
And Input Spouse Information which include SSN, Gender, Height and Weight
Then Input Children Information which include SSN, Gender, Height, Weight, Status, Relationship

Then Senior Protect Spouse Primary Beneficiary Full Name, Relationship, SSN
And Senior Protect Spouse Contingent Beneficiary Full Name, Relationship, SSN
Then First Protect Adult Child Falco Primary Beneficiary FullName, SSN, Relationship 
And First Protect Adult Child Falco Contingent Beneficiary FullName, SSN, Relationship 
Then First Protect Adult Child Gavin Primary Beneficiary FullName, SSN, Relationship 
And First Protect Dult Child Gavin Contingent Beneficiary FullName, SSN, Relationship 
Then First Protect Adult Child Hector Primary Beneficiary FullName, SSN, Relationship 
And First Protect Adult Child Hector Contingent Beneficiary FullName, SSN, Relationship

Then Child Protect Minor Child Ibis Primary Beneficiary FullName, SSN, Relationship 
Then Child Protect Minor Child Ibis Contingent Beneficiary FullName, SSN, Relationship 
And Child Protect Minor Child Jayda Primary Beneficiary FullName, SSN, Relationship 
And Child Protect Minor Child Jayda Contingent Beneficiary FullName, SSN, Relationship 
Then Child Protect Minor Child Kyra Primary Beneficiary FullName, SSN, Relationship
Then Child Protect Minor Child Kyra Contingent Beneficiary FullName, SSN, Relationship

Then Select Email Summary and enter Email Address for Confirmation
And Select Day of Deducation one And Account Type for checking Bank Information 
Then Input Routing Number, Account Number, Bank Name, City State ZipCode
And Select Signing Via Email button and enter Email Address for routing application
Then Click Sumbit and send email for Signature 

And Login Email User ID and Password
Then Select Inbox and check the Email from AFBA Enrollement
And Click Review Application on AFBA Enrollement  
Then Enter sponsor LastName and Last four SSN numbers
And Click Review and Sign My Application button to sigin 
Then Click Review Application Ducuments button to review all application information
And Input sponsor and spouse LastName and Last four SSN number
Then Select Paper receive the document

And Navigate back to login AFBA Enrollment login page
Then Select Access agent signing inbox button
And Sign the Application on Agent Inbox and eSigning
