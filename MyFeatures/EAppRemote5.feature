@Remote5
Feature: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship,SSN and DOB. Select Military Allotment Payment test feature 
Scenario: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship,SSN and DOB. Select Military Allotment Payment test scanario

When Click New Enrollment button input Sponsor SSN, Enrollment city and Enrollment state 
Then Select Begin Enrollment button to create case
And Input Sponsor firstName, lastName, gender and DOB
Then Select Married button and input spouse firstName, lastName and DOB
And Select Include Children button to input Adult Child one firstName, lastName, DOB
Then Click Add Child button to input Adult Child two firstName, lastName, DOB
And Click Add Child button to input Adult Child three firstName, lastName, DOB
Then Click Add Child button to input Minor child one firstName, lastName, DOB
And Click Add Child button to input Minor Child two firstName, lastName, DOB
Then Click Add Child button to input Minor Child three firstName, lastName, DOB

And Select Millitary on Eligibility, Coast Guard on Banch of service, Ready Reserve on Duty Status, O four on Rank, Military Allotment on Contribution Mode 
Then Enter Street Address, City, State and Zip code numbers
And Enter Daytime phone numbers
Then Click Show Coverage Option to select Sponsor, Spouse, AC and MC Beneficiary Plans

Then Waived BA, FedTerm and Application Member Benefit Products
And Senior Protect spouse Customize twenty five thousand K 
Then First Protect No Benefit for Sponsor and Spouse Customize fifty thousand K for three AC
And Childrens Protect Covered for three MC
Then Next page Answer All the questions
Then Input Sponsor Height feet inches and Weight 
And Input Spouse SSN, gender, Height feet inches and Weight
Then Input Children Information SSN, Gender, Height, Weight, Status, Relationship

And Senior Protect for Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB
Then First Protect Adult Child Nancy Primary Beneficiary FullName, SSN, Relationship and DOB
And First Protect Adult Child Nancy Contingent Beneficiary FullName, SSN, Relationship and DOB
Then First Protect Adult Child Olivia Primary Beneficiary FullName, SSN, Relationship and DOB
And First Protect Dult Child Olivia Contingent Beneficiary FullName, SSN, Relationship and DOB
Then First Protect Adult Child Pia Primary Beneficiary FullName, SSN, Relationship and DOB
And First Protect Adult Child Pia Contingent Beneficiary FullName, SSN, Relationship and DOB
Then Child Protect Minor Child Roman Primary Beneficiary FullName, SSN, Relationship and DOB
And Child Protect Minor Child Steve Primary Beneficiary FullName, SSN, Relationship and DOB
Then Child Protect Minor Child Travis Primary Beneficiary FullName, SSN, Relationship and DOB

Then Select Email Summary input Email Address for Confirmation
And Click Military Allotment Method of Payment option
Then Click Signing via email option and enter Email for routing application then Submit it

And Login Email UserID and Password
Then Select Inbox and check the Emails
And Select Email from AFBA Enrollement and click Review Application
Then Enter sponsor lastName and Last four SSN numbers and click Review and Sign My Application button
Then Click review application ducuments button to review all the Information
And Enter Sponsor and Spouse lastName and last four SSN
Then Select Paper receive the document option

And Navigate back to login AFBA Enrollment Webpage
Then Click Access Agent Signing Inbox 
And Sign the Applications on Agent Inbox