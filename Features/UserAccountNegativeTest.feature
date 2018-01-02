@CreatingAccount
Feature: Creating Account as a new user
In order to became a site member 
As a new visitor 
I want to create an account in demo.oscommerce.com


Scenario Outline:  User should be able to successfully register on website with all required fields
Given new user to the oscommerce home page
When new user click create an account
And click "<Gender>" 
And enter "<first name>", "<last name>", "<Date of Birth>", "<E-mail Address>", "<Street Address>", "<Post Code>", "<City>","<state>","<country>","<telephone number>","<password>", "<password confirmation>"
Then new user will click continue
And new user will be automatically logged in

Examples:
|  first name 	| last name	| Date of Birth	| E-mail Address	    |Street Address		 | Post Code	| City		|state          |   country	         |telephone number|  password 	| password confirmation	| 
|  01/01/1989	| Hasan		| Hasan	| 01/01/1989	| 1795 e 172nd St.   |10472	 	    | New York	|NY   		    |   United States    |9292809729	  |  123456789	    |	123456789	    |
