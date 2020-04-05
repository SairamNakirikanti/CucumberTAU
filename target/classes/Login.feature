Feature: Login Functionality

in order to internet banking
As a valid para bank customer
i want login successfully

Scenario Outline: Login Successful

Given I am in the login page of the para bank application
When I enter valid <username> and <password>
Then I ahould be taken to the overview page

Examples:
|username|password|
|"tester"|"Deepu12#"|
|"tester123"|"password123"|



