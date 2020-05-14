@varifySSN
Feature: Varify Only Sponsor and Spouse valid SSN number required must be nine digit number test feature 
Scenario: Varify Only Sponsor and Spouse valid SSN number required must be nine digit number test scanario

Given Click Manage Cases button to Search case
When click New Enrollment button to create case
Then Input valid Sponsor SSN, Enrollment city and state
And Click Begin Enrollment to create new sponsor
Then Input Sponsor First Name, Last Name, DOB
Then Click Married radio button
And input Spouse First Name, Last Name and DOB
Then Select Eligibility, Branch Of Service, Duty Status, Rank and Contribution Mode
And Enter Department Code, Source Code
Then Input Stress address, City, State and Zip Code
And Input Email address and enter second Email address for confirmation
Then Input Daytime Phone number
And Click Show coverage Options
Then Select BA Customize sponsor and spouse
And waived Fed Term, Application Member benefit Plans and FirstProtect 
And Answer all the questions related to Other Insuarnce and BA
Then Select Sponsor Height, Weight
And Input Spouse valid SSN Number
Then Select sponsor Gender, Height and Weight
And Select Sponsor Better Alternative primary beneficiary Full Name, SSN, Relationship, and DOB
Then Select Sponsor Better Alternative Contingent Beneficiary Full Name, SSN, Relationship, and DOB
And Select Spouce Better Alternaive primary beneficiary Full Name, SSN, Relationship, and DOB
Then Select Spouce Better Alternative Contingent Beneficiary Full Name, SSN, Relationship, and DOB

And Click agree to signin button
Then Select Applicant eSignature options
And Select receive life insurance notices and documents via Paper or Electronic options
Then Select Sign Button to sign it
 
