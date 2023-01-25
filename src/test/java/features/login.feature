Feature: Application Login 

@Logintest 
Scenario Outline: Home Page default login 
	Given User is on zoho landing page 
	When User login into application with username <username> and password <password> 
	Then Home page is populated 
	Examples: 
		|username |password|
		|abhi7354@yahoo.co.in|Test1234@|
		
  