@Claims1
Feature: Customer portal Claims in Take feature file
Scenario: Customer portal Claims in Take test scenarios 

Given Step two to select relationship to Insured
When Input First Name, Last Name, Email, Select Country
Then Input Address, City, State, ZipCode, Phone
And Step three Input Insured First Name, Last Name, Policy Number, Nature of Death, Insured complete SSN
Then Select DOB, and select Death Occur outside of the US

