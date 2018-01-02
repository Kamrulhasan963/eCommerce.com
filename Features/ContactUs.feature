Feature:  User wants to see contact Us
In order to User wants to see contact Us
As a site visitor
I want to see contact Us

Scenario Outline: Positive- User wants to see contact Us

Given user Open Browser at Oscommerce
And user click on Top
When user click contact Us
And User Fillup "<Full Name>"and "<E-Mail Address>" and "<Enquiry>"
Then user Click Continue
And User will get Your enquiry has been successfully sent to the Store Owner. 

Examples:

|Full Name   | E-Mail Address       | Enquiry      |
|Kamrul Hasan| atmkhasan@gmail.com  |Hello Testing |

