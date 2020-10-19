@AdhocLetter
Feature: National Guard Platform AdhocLetter test feature 
Scenario: National Guard Platform AdhocLetter test scenario

Given login NGP and select AdhocLetter 
When Select the Adhoc Letter Name
Then Get the data of Adhoc Letter name, Request type, Document type, Owner, contact and Policy name
And Get value of General Email message 
Then Get the data of Group information Group name, Gaurd State, Group phone, group Email, Group webside
And Get the data of Group malling street, city, state and zipcode 
Then Get the data of Member information member name, member street, city, state and zipcode