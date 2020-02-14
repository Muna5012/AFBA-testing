@varifySSN
Feature: Varify Sponsor and Spouse valid SSN number required must be nine digit number test feature 
Scenario: Varify Sponsor and Spouse valid SSN number required must be nine digit number test scanario

Given Click Manage Cases button to Search case
When click New Enrollment button to create case
Then Input valid Sponsor SSN, Enrollment city and state
And Click Begin Enrollment to create new sponsor
Then Input Sponsor First Name, Last Name, DOB
And Select Gender
Then Click Married radio button
And input Spouse First Name, Last Name and DOB
Then Select Eligibility, Branch Of Service, Duty Status, Rank and Contribution Mode
And Enter Department Code, Source Code
Then Input Stress address, City, State and Zip Code
And Input Email address and enter second Email address for confirmation
Then Input Daytime Phone number
And Click Show coverage Options
 
