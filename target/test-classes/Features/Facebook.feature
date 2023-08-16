Feature: Validation of Facebook application
Scenario: Validation of Facebook with invalid credentials
Given User navigates to the facebook url
When User enters the usersname and password
And User clicks on the login button
Then User validates the login message