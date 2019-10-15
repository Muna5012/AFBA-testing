@eApp12
Feature: Minor Children(MC) only with Child Protect (LT16) specific DC area test feature 
Scenario: Minor Children(MC) only with Child Protect (LT16) specific DC area test scanario

When Click Manage Cases button on Homepage and Search IT QA Automation Call Center and click it 
Then Click New Enrollement button to Input Sponsor SSN, Enrollment City, Enrollment State 

And click Begin Enrollement and Input the Sponsor First Name, Last Name, Gender and DOB
And Click Include Children button to input first Child first name, last name, DOB
And Click Add Child button to input second Child first name, last name, DOB
And Click Add Child button to input third Child first name, last name, DOB
Then Select Military on Eligibility Options, Select Air Force on BranchOfService 
Then Select Active Status and Rank option Osix
Then Select MilitaryAllotment on Contribution Mode 
Then Input DepartmentCode and Sourcecode
And Input street address, City, state and ST Zipcode
Then Input Emails for confimation and daytime phone numbers
Then Click Show Coverage Options to Select benefitiary planes

And Waived BA, Fed Term, First protect, Application Member Benefit
Then Click Children Protect and select Covered for Three of children
And Next Page to Answer to All the questions 
Then Next page Input Sponsor Height and weight
And Next page input child one information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship
Then Input child two information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship
And Input child three information SSN, Gender, Height, Weight, Slect US Citizen Option and Relationship
Then Next Page for Benficiaries for childrens Protect
And SomeoneElse for first kid Mark Anthony Contingent Beneficiary FullName, SSN, DOB and Relationship
Then Click SomeoneElse for second kid Wyatt James Primary Beneficiary FullName,SSN, Relationship and DOB
And second kids Wyatt James Contingent Beneficiary FullName,SSN, Relationship and DOB
Then Click SomeoneElse for Third kid Elizabeth Primary Beneficiary FullName, SSN, Relationship and DOB
And Third kid Elizabeth Contingent Beneficiary FullName, SSN, Relastionship and DOB
Then Nexc page Select Email Summary and select Acknowledgement Military Payment option
And Click I agree to this coverage and am ready to signin button
Then Slect Applucation eSignature Three options
And Select recieve documents option for Paper and click sign button
Then Select Sign button for Agent Enroller eSignature

