@AgentLogin
Feature: Agent Login Page Forget your password Feature 
Scenario: Agent Login Page Forget your password test scenario

Given Click Agent Login button
When Get text of Secure Customer Login
Then Get text of Please enter your User Name 
And Input User Name, Pass Word
Then Click Login Button
  