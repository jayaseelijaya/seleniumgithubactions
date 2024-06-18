
Feature: SSR1717 - Verifying user should select organization to begin with data upload.

Scenario Outline: TC0811 - Verify user should be able to select an organization to begin with the data upload workflow

	Given chrome browser is launched
	And dataupload url is entered 
	When username value entered as "<user>" 
	And Password value is entered 
	And user clicks on Login Button
	Then Homepage is displayed 
	When User clicks on Upload files button from left menu bar 
	And than user clicks on Upload File 
	Then Search facility screen is displayed with back and next button
	And List of facility is displayed to user 
	When user clicks on any facility 
	Then Next button is in enabled state
	And App is closed 
	
	Examples: 
		|user|  
		|ic-test-admin@capgemini.com |
		#|ic-test-tech@capgemini.com |
		#|ic-test-nurse@capgemini.com |
		#|ic-test-surgeon@capgemini.com |
		
Scenario Outline: TC0410 - Verify user should get notification message if no organization is listed facility selection modal screen.

	Given chrome browser is launched
	And dataupload url is entered 
	When username value entered as "<user>" 
	And Password value is entered 
	And user clicks on Login Button
	Then Homepage is displayed 
	When User clicks on Upload files button from left menu bar 
	And than user clicks on Upload File 
	Then Search facility screen is displayed with back and next button
	And If no organization is listed on selection modal screen
	When user clicks on I don't see my site listed
	Then notification message is displayed to the user
	And App is closed 
	
	Examples: 
		|user|  
		|ic-test-admin@capgemini.com |
		#|ic-test-tech@capgemini.com |
		#|ic-test-nurse@capgemini.com |
		#|ic-test-surgeon@capgemini.com |