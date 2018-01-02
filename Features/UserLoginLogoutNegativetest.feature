@userlogin
Feature: User Sign in and Sign Off from Oscommerce

In order to Sign in and Sign Off from account
As a register user
I want to enter E-Mail Address, password, and click sign-in to login
andClick Sign Off for Sign Out

@userLoginPositive
Scenario Outline: Positive user login and logout with valid E-Mail Address and Password

Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<password>"
And user click on sign in button
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

| E-Mail Address       | password |
| atmkhasan@ymail.com  |12345789 |
