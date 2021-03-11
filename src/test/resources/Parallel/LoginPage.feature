@Login
Feature: Login page feature

@Smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

@Smoke
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

#@Regression @Skip - Use this when you want to run tags from runner file and add tags in runner file. 
@Regression @skip_scenario
Scenario: Login with correct credentials
Given user is on login page
When user enters username "pradeepinit@gmail.com"
And user enters password "locked786"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"