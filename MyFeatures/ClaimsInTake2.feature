@Claims2
Feature: Customer portal Claims in Take Select Child on relationship and select Spouse predeceased the Insured Option on Step four feature file
Scenario: Customer portal Claims in Take Select Child on relationship to Insured test scenarios

Given Step two to select Child to relationship Insured
When Input First Name, Last Name, Email, Select Country, Address, City, State, ZipCode, Phone
And Step three Input Insured First name, Last name, Policy Num, NOD, Insured complete SSN, COD, DOB, DOB
Then Select death outside of US, Australia
Then Step four select first option Spouse Predeceased the Insured
And Input deceased spouse FN, LN, DOD
Then Click Add another deceased spouse
And Input second deceased spouse FN, LN, DOD
Then Step five Next of Kin Information select option for next of kin same the information select yes
Then Select No
And select next of relationship, email, FN, LN, street, City, State, Zipcode, Country, phone
Then Step six input opinion for this claim
And Select Next of Kin option for package be sent
Then Click Review button to move step seven
And Click the radio button on Note
Then Submit the application

