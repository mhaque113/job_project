Feature: Home Page Verification


@BootCamp
Scenario: Verify Search Functionality

Given Navigate "<URL>"
Then Enter Laptop in searchfield
Then Click on searchlink
Then verify search Result Displays
Then Enter Samsung in searchfield
Then Click on searchlink
Then verify search Result Displays



@BootCamp2
Scenario: Verify Order Support home Page
Given Navigate "<URL>"
Then  Users able to Mouse over on Support link
Then  User are able to click on Order Support link
Then  Users are able to verify Order Support home page

