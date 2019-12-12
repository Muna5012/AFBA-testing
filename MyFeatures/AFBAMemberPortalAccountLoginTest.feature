@login
Feature: AFBA Member Account Login page  Register Here test, Forgot your Password test, Help page test feature 
Scenario: AFBA Member Account Login page test scanario

Given Accout Login page get title
When Click Register Here button 
Then Get text of This is AFBA TEST System, If you are a AFBA Member, Please use following url for Production webside
Then Get the title of Register with AFBA
And Input First Name, Last Name, SSN, DOB, Email, Password and Confirm Password
Then Get the second text of This is AFBA TEST System, If you are a AFBA Member, Please use following url for Production webside
And Get the text of Contact AFBA Customer Service Hours, Toll-free, Local, Address
And Click here to complete Email form 
And Select Subject, name, SSN or Policy number, Email Address, phone number and Message
And Click Submit button 
Then Get Text of Success Your Online Inquiry has been submitted. A representative will be in contact with you shortly
And Nevigate back to Login page

Then Click Forgot your password button
Then Get text of Forgot your password
And Input Username
And Click Submit button to submit Username
Then Get text of Welcome to the AFBA member portal
And Get text of An email has been sent to you with your temporary password
Then Click Go to Login Page button

And Click Help button 
Then Get text of Frequently Asked Questions
And Get all the text of How do I login to AFBA Member Portal explanations
Then Get all the text of I forgot my password. How do i reset it explanations
And Get all the text of I forget my Username. what can i do explanations
And Get all the text of How can i receive my documents electronically explanations
#Then Input Username and Password on Account Login Page
#And Click Login button

 
