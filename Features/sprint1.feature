#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: HRM Login Test Case@tag
@selenium
Scenario: Verify user is able to login with valid user id and password
	Given browser is open and application is in login page
	When user enters user name and password
	Then home page is displayed
	
	
	

#Scenario: Verify user is able to logout
#	Given browser is open and application is in home page
#	When user enters user name and password
#	Then home page is displayed
#	Then user logs out
    