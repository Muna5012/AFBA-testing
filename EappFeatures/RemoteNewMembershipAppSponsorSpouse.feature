@Remote1
Feature: Member LT12, Better Alternative, LT121. All policies for each Applicant have Primary and Contingent Beneficiaries include DOB. Select Payment Military Allotment test feature 
Scenario: Member LT12, Better Alternative, LT121. All policies for each Applicant have Primary and Contingent Beneficiaries include DOB. Select Payment Military Allotment test scanario

When Input Sponsor SSN, Enrollment City and Enrollment State 
And click Next and click Begin Enrollment Btn
Then Input Sponsor First Name, Last Name, Gender, DOB
And Click Married radio button and Input spouse information
And Select Military on Eligibility option, Army on Branch of Service, Active duty status, 
Then Select O Seven on Rank, Millitary Allotment on Contribution Mode
And Enter Department_Code and Source_Code
Then Input Street address, City, State and Zip
And Input Email address and Daytime Phone Numbers
Then Click Show Coverage Option to select beneficiaries plans
And Click Save for later button to Pause enrollment and Save data
Then Search the name and Resume Enrollment

And Select Better Alternative customize sponsor and spouse 
Then Select FedTerm customize sponsor and spouse 
Then Waived Senior Protect 
Then Select group free to Covered and select Yes or no buttons
And Waived First Protect


And Click Next to Answer All the questions
Then Input Sponsor Information Height Feet, Inches and Weight
And Input Spouse Information SSN, Gender, Height feet inches and Weight

Then Better Alternative Sponsor Coverage Contingent Beneficiary FullName, SSN, Relationship and DOB
And Better Alternative Spouse Coverage Primary Beneficiary FullName, SSN, Relationship and DOB
Then Senior Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB
And Senior Protect Spouse Contingent Beneficiary FullName, SSN, Relationship and DOB
Then First Protect Sponsor Primary Beneficiary FullName, SSN, Relationship and DOB
#And First Protect Spouse Primary Beneficiary FullName, SSN, Relationship and DOB
Then Confirmation page select Email Summary and select Millitary Allotment method payment 
And Select Singing via Email button and input Email address
Then Click Submit and send email for signature

And Navigate back to Email account to login Email username and password
Then Click Inbox and select Email
And Click Review Application button
Then Input Last Name and Last four SSN numbers
And Click Review and Sign my Application btn
Then Click Review Application Ducuments button to review all the application
And Input Sponsor Last Name and last four SSN numbers
Then Select Paper option for receive the Document
