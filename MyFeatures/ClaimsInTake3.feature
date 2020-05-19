@Claims3
Feature: Customer portal Claims in Take Select Child on relationship and select Spouse predeceased the Insured Option on Step four feature file
Scenario: Customer portal Claims in Take Select Child on relationship to Insured test scenarios

Given Step two to select Sibling to relationship Insured
When Input FN, LN, Email, Select Country, Address, City, State, Zipcode, Phone Num
Then Step three Input Insured FN, LN, Policy Num, NOD, Insured complete SSN, CauseOfDeath, DOB, DOB
