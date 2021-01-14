@LoginPage
Feature: National Guard Platform Payment Login Page verify forget password test feature 
Scenario: National Guard Platform Payment Login Page verify forget password test scenario
Given Open NGP login page and get the URL of NGP tag
When Input username click Forget your password button
Then Get text of password forget notes
And Input User name
Then Click Reset Password button
And Get text of check Email message
Then click back to button button to login Username and Password