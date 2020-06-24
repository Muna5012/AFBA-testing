@Claims1
Feature: Customer portal Claims in Take Select Spouse in relationship and Select the surviving spouse is still living option on Step four feature file
Scenario: Customer portal Claims in Take Select Spouse in relationship test scenarios 

Given Step two Input First Name, Last Name, Relationship
When Input Email, Address, City, State, ZipCode, country, and Phone number
And Step three Input Insured FN, LN, DOB, DOD, Nature of Death, Cause of Death 
Then select Death Occur outside of the US and select the country
And Input Policy Number and SSN
And Step four select Surviving spouse is still living option
Then Input Spouse FN,LN, DOB, SSN and click Next button
And Check step five check the input data and click Next button
Then Step six Enter anything you would like to tell us and select Spouse option
And Click Review button to review all the data and select Note and Submit the application
