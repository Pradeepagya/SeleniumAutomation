Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|pradeepinit@gmail.com|locked786|

@accounts
Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

@accounts
Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6

Scenario: T-shirts Section
Given user is on Accounts page
When user clicks on T-SHIRTS tab
And user gets the title of the Tshirt page
Then page title should contain "T-shirts - My Store"

