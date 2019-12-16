@beneficiaryChange
Feature: AFBA Customer Portal Request Beneficiary Change test feature 
Scenario: AFBA Customer Portal Request Beneficiary Change test scanario

Given Input Username, Password and click Login to Login account
When Click Request Beneficiary Change links
Then Get title of Beneficiary Change Request and Member fullname
And Get text of bule line noties
#And Get text of Account Number, Status, Crated Date, Decision Date
#Then Get text of beneficiary Account Number, Status, Created Date
#And Click View button and get Beneficiary Designation Forms Url 
Then Click New Request button
And Get text of all the Step one Instructions notes 
Then Click Next button to move step two Select Accounts
And Get text of Notes for step two
Then Get text of Policy Number, Insured, Coverage Amount
And Get text of first policy account number, Insured full name and Coverage amount of money and select it
Then Get text of second policy account number, Insured full name and Coverage amount of money and select it 
And Get text of third policy account number, Insured full name and Coverage amount of money and select it 
Then Get text of fourth policy account number, Insured full name and Coverage amount of money and select it 
And Get text of fifth policy account number, Insured full name and Coverage amount of money and select it

And Next page get text of Step three Primary Beneficiaries and get text of notes
Then click Add Primary button
And Get text of Add Primary Beneficiary title
Then Get text of Relationship to insured and select Relastionship to Insured
And Get text of Gender and select gender
Then Get text of First Name and input first name
And Get text of Last Name and input last name
Then Get text of Middle Name and input middle name
And Get text of SSN and input SSN number
Then Get text of DOB and input DOB
And Get text of Percentage and input percentage
Then Get text of Address Line and input address line
And Get text of City and input city name
Then Get text of State and input state name
And Get text of Zip Code and input zip code

Then Click ADD button to add primary beneficiary
And Get text of Notes for percentage
Then Get text of FullName, Primary, Percentage 
And Get text of Relation, Gender, SSN, DOB, Address for Primary Beneficiary
Then Get text of Beneficiary added to list status
And Click Next button to move step four

Then Get text of Step four Contingent Beneficiaries
And Get the notes for add contingent beneficiary
Then Click to Add Contingent Beneficiary
And Get text of Add Contingent Beneficiary
Then Get text Relationship to Insured and select Relationship to Trust
And Get text of Name of Trust and enter name
Then Get text of Trustee named in Trust and enter name 
And Get text of Percentage and enter percentage
Then Get text of DOB and enter DOB
Then Click Add button to Add Contingent Beneficiary

And Get text of total percentage notes
Then After add contingent get text of Contingent beneficiary name, Contingent, percentage, Relation, Date and Trustee Name
And Click Next button to move step five

Then Get text of Step five Summary Of Selection
And Get text of Selected Policies, Primary Beneficiaries, and Contingent Beneficiaries infromation
Then Get text of all the Notes
And Click Checking Box 
Then Click Submit button to submit the application
And Navigate back to home page Get text of Account Number, Status, Crated Date, Decision Date
And Get text of beneficiary Account Number, Status, Created Date
Then Click View button and get Beneficiary Designation Forms Url










