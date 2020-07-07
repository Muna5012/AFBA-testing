@Claims3
Feature: Customer portal Claims in Take Select Child on relationship and select Spouse predeceased the Insured Option on Step four feature file
Scenario: Customer portal Claims in Take Select Child on relationship to Insured test scenarios

Given Step two input First Name, Last Name, Relationship
When Input Email, Address, City, State, Zipcode, Country and Phone Num
Then Step three Input Insured FN, LN, Policy Num, NOD, Insured complete SSN, CauseOfDeath, DOB, DOB
And Step four Select the Insured was dicorced 
Then input Ex Spouse FN, LN, Date of Divorce, select deceased and input Date of Death
And Select add another Ex Spouse, input Ex Spouse FN, LN, Date of  Second Divorce, Date of Death
Then Step five select yrd first, then select No to fill out all the information
And Step six Additional claims Information input opinion and select package to send Information me
Then Step seven Summary of selection Click Notes radio button and submit the application