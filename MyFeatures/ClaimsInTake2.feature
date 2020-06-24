@Claims2
Feature: Customer portal Claims in Take Select Child on relationship and select Spouse predeceased the Insured Option on Step four feature file
Scenario: Customer portal Claims in Take Select Child on relationship to Insured test scenarios

Given Step two Input First Name, Last Name, relationship Insured
When Input Email, Address, City, State, ZipCode, Select Country, and Phone
And Step three Input Insured First name, Last name, DOB, DOD, Nature of death and cause of death
Then Input Cinfirmation ID and SSN
Then Step four select first option Spouse Predeceased the Insured
And Input Deceased spouse FN, LN, DOD
Then Click Add another Deceased spouse
And Input second Deceased spouse FN, LN, DOD
Then Step five select the Yes button to check the information
Then Select No to input information
And select Relationship, Email, FN, LN, street, City, State, Zipcode, Country, phone
Then Step six input opinion for this claim
And Select Next of Kin option and click Review 
Then Check all the data and select Note
Then Submit the application

