@varifyApplicantdata
Feature: Varify input Email Address and Confirmation email address to varify Show Coverage Option button and Next button test feature 
Scenario: Varify input Email Address and Confirmation email address to varify Show Coverage Option button and Next button test scanario

When Click Manage Cases button and Search case
Then create new Case
And Input Sponsor SSN, Enrollment city and state 
And click Begin Enrollement button
Then Input sponsor First Name, Last Name, Gender and DOB
And Click Married button to input spouse First Name, Last Name, DOB
Then Select Military
And Select Army and select Active Status and Rank option
Then Select Military Allotment on Contribution Mode and input Department code and Source code
And Input street address, city and zip code
Then Input Email address And skip confirmation email address
And click Save for later button
Then Click Pause enrollment and Save Data button
And Click Search space to search this case

And Varify the Email and reinput confirmation email address
Then Click Show Coverage Options
And Waived BA, skip FedTerm, waived First Protect and Application Member Benefit
Then Select Senior Protect NonTobacco for Spouse and Customize it
And Next page answer Questions
Then Next page input sponsor information height and weight
And Next page input spouse information, SSN, gender, height and weight
Then Next page Beneficiaries for Senior Protect Primary Beneficiary FullName, SSN, Relationship and DOB
And Input Contingent Beneficiary FullName, SSN, relationship and DOB
Then Next Page select Email Summary and select spouse sign this application click Yes
Then Select Paper to receive documents and click sign button