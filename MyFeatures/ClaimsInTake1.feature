@Claims1
Feature: Customer portal Claims in Take Select Spouse in relationship and Select the surviving spouse is still living option on Step four feature file
Scenario: Customer portal Claims in Take Select Spouse in relationship test scenarios 

Given Step two to select relationship to Insured
When Input First Name, Last Name, Email, Select Country
Then Input Address, City, State, ZipCode, Phone
And Step three Input Insured First Name, Last Name, Policy Number, Nature of Death, Insured complete SSN
Then Select DOB, and select Death Occur outside of the US
And Step four select Surviving spouse is still living option
Then Input Spouse SSN 
And Check step five and click Next button
Then Step six Enter your opinion and select Spouse option
