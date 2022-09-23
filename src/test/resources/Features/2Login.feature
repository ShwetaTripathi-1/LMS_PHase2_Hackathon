Feature: Login Page

@driversetup
Scenario: Open LMS website
Given user is  on browser
When user opens LMS Website
Then user is on Login Page

Scenario: Empty username and valid password
Given user is on Login page with 7 button on top 
When user enter empty username 
And user enter valid password
Then Message display -Enter username

Scenario: valid username and empty password 
Given user is on login page2 
When user enter valid username 
And user enter empty password
Then Message display -Enter password

Scenario: empty username and empty password 
Given user is on login page3
When user enter empty username 
And user enter empty password
Then Message dispaly -Enter username and password

Scenario: Valid username and valid password
Given user is on login page4 
When user enter valid username and valid password
Then user click on Login Button
And user is at HomePage  