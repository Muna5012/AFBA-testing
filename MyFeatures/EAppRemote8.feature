@Remote8
Feature: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship, NO DOB, NO SSN. Select Military Allotment Checkmatic Payment test feature 
Scenario: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship, NO DOB, NO SSN. Select Military Allotment Checkmatic Payment test scanario

When Click New Enrollment button to create case 
Then Enter Sponsor SSN, Enrollment City is Jackson and Enrollment State is WY
Then Select Begin Enrollment button to start the case
And Enter Sponsor First Name Maude, Last Name Findlay, Gender famale and DOB
Then Select Married button enter spouse First Name Walter, Last Name Findlay and DOB
And Select Include Children button enter Adult Child one First Name Carol, Last Name Findlay, DOB
Then Click Add Child button enter Adult Child two First Name Arthur, Last Name Findlay, DOB
And Click Add Child button enter Adult Child three First Name Edith, Last Name Findlay, DOB
Then Click Add Child button enter Minor child one First Name Gloria, Last Name Findlay, DOB
And Click Add Child button enter Minor Child two First Name Mike, Last Name Findlay, DOB
Then Click Add Child button enter Minor Child three First Name Lionel, Last Name Findlay, DOB

And Select Law Enforcement on Eligibility option and select checkmatic for Contribution Mode
Then Enter Street Address, City, State, Zip and Daytime phone numbers
And Select Beneficiary Coverage Options
And Coverage Benficiary Options waive enrollment in Better Alternative, Fed Term, Application Member Benefit
Then Select Senior Protect select Option one
And First Protect select NonTobacco Customize fifty thousand K for each adult child
Then Childrens Protect Covered three Minor Child 
And Answer Yes or No questions for Qualification
Then Enter Sponsor Information include Height and Weight 
And Enter Spouse Information include Height and Weight
Then Enter Children Information include SSN, Gender, Height, Weight, Status and Relationship

And Enter Senior Protect Primary Beneficiary of Spouse Coverage beneficiary FullName, Relationship 
Then Senior Protect Contingent Beneficiary of Spouse Coverage beneficiary FullName, Relationship
And First Protect first Adult Child Carol Primary Beneficiary FullName, Relationship 
Then First Protect first Adult Child Contingent Beneficiary FullName, Relationship
And First Protect second Adult Child Primary Beneficiary FullName, Relationship 
Then First Protect second Adult Child Contingent Beneficiary FullName, Relationship 
And First Protect last Adult Child Primary Beneficiary FullName, Relationship
Then First Protect last Asult Child Contingent Beneficiary FullName, Relationship

And Children Protect first Minor Child Lillith Primary Beneficiary FullName, Relationship
Then Children Protect first Minor Child Lillith Contingent Bneficiary FullName, Relationship
And Children Protect second Minor Child Milton Primary Benedficiary FullName, Relastionship
Then Children Protect second Minor Child Milton Contingent Beneficiary FullName, Relationship
And Children Protect Minor Child Isabella Primary Beneficiary FullName, Relationship 
Then Children protect Minor Child Isabella Contingent Beneficiary FullName, Relationship

Then Confirmation page select Email Summary enter Email address and repeat it for confirmation
And Select Day Of Deduction, Account Type, Routing Number, Account Number, Bank Name, City, State, Zip
And Click Singing Via Email option and enter Email address and repeat it
Then Click Submit and Send Email for Signature button to submit application

And Navigate back to Email account Login Email Username and Password
Then Select Inbox and check the Email from AFBA Enrollement and click Review Application on AFBA Enrollment  
Then Enter sponsor last Name and Last four SSN numbers
And Click review and sign my Application button
Then Click ReviewAapplication ducuments button to review all application
And Enter sponsor and spouse last Name and last four SSN numbers
Then Select Paper receive the Document option

And Navigate back to login AFBA Enrollment web page
Then Click Access agent to Signing Inbox button
And Sign the Application on Agent Inbox and esingging 

