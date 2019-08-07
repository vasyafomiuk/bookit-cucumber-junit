Feature: As user I want to be able to see general schedule 


#Verify general schedule on the light side
@BRIT-4533 
Scenario: Cucumber: Smoke test 
	Given user is on the sign-in page 
	Then user logs in as a student with "jhelkin7u@hao123.com" and "stantonmatus" password 
	Then user navigates to general schedule and verifies subtitle 