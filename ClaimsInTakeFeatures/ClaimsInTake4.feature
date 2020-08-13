@Claims4
Feature: Customer portal Claims in Take Select more option on relationship and select Other Option on Step four feature file
Scenario: Customer portal Claims in Take Select more option on relationship to Insured test scenarios

Given Step two to select more options to relationship Insured
When Input first name, last name, Email, country, address, city, state, Zipcode, phone number
And Step three Input Insured first name, last name, Policy Num, date of divource, SSN, COD, DOB
Then Step four select Insured was never married
And Step five Next of Kin Information select Yes first, then select No to fill out information
Then select Next of Kin Relationship, Email, FN, LN, Adress, city, state, zipcode, country, and phone number
And Step six to input opinion and select Other on Package be sent
Then Input FN, LN, relationship, street, city, state, zipcode and country for other
And Step seven review all the information, and select Note checking box submit the application
