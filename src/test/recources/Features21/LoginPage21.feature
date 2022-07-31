Feature: Login Functionality


@Dellusa
Scenario: User able to login their page


Given Navigate "<URL>"
Then click on signInButton
Then click on signinLink
Then enter user name and password 
Then click signin 
Then verify user in login page
