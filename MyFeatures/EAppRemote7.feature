@Remote7
Feature: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship, DOB, NO SSN. Select Military Allotment Credit Card Payment test feature 
Scenario: Member Spouse LT12, Three Adult Children LT15, Three Minor Children LT16. All policies for each Applicant have Primary and Contingent Beneficiaries, Which include FullName, Relationship, DOB, NO SSN. Select Military Allotment Credit Card Payment test scanario

When Click New Enrollment button enter Sponsor SSN, Enrollment City and Enrollment State 
Then Select Begin Enrollment button create case
And Enter Sponsor First Name, Last Name, Gender and DOB
Then Select Married button enter spouse First Name, Last Name and DOB
And Select Include Children button enter Adult Child one First Name, Last Name, DOB
Then Click Add Child button enter Adult Child two First Name, Last Name, DOB
And Click Add Child button enter Adult Child three First Name, Last Name, DOB
Then Click Add Child button enter Minor child one First Name, Last Name, DOB
And Click Add Child button enter Minor Child two First Name, Last Name, DOB
Then Click Add Child button enter Minor Child three First Name, Last Name, DOB

And Select Military on Eligibility option, Navy Banch of service, Dute status IRR, Rank E nine, Credit card Contribution Mode 
Then Enter Street Address one, Stress Adress two, City, State, ZipCode and Daytime phone numbers
And Select Coverage Options
And Coverage Options waive enrollment in Better Alternative, Fed Term, Application Member Benefit
Then Select Senior Protect Tobacco for sponsor and Customize twenty thousand k 
And First Protect select Tobacco for sponsor, spouse, AC1 and Customize fifty thousand K for each child
Then Children Protect Covered three MC
And Answer all the questions Yes or NO for Qualification page
Then Input Sponsor Information include Height and Weight 
And Input Spouse Information include SSN, Gender, Height and Weight
Then Input Children Information include SSN, Gender, Height, Weight, Status, Relationship
