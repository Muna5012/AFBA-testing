@productionIssue2
Feature: Varify production issue for pause test feature 
Scenario: Varify production issue for pause test scanario

When Click Manage Cases button and Search case and create new Case
And Input Sponsor SSN, Enrollment city and state and click Begin Enrollement button
Then Input sponsor first name, last name, gender and DOB
Then Select Eligibility, Branch of Service, Duty Status, Contribution Mode, Department code and Source code
And Input street address, city and zip code, Email address And phone number
And click Save for later button and Pause enrollment 