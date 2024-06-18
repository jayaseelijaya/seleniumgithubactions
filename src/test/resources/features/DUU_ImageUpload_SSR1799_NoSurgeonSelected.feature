
Feature: SSR1799 - Verifying that no surgeon should display as selected by default if more than one surgeon data available for selected organization.

Scenario Outline: TC0854 - Verify no Surgeon should be selected by default if more than one Surgeon available for selected organization.

	Given Chrome Browser is loaded
	And Data-Upload utility app url is entered 
	When UserName Value entered as "<user>" 
	And Password Value is entered by user
	And than Click on Login Button
	Then Homepage is getting displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload File 
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has more than one surgeon associated
	And user clicks on Next button
	Then No surgeon should be display as seleted by default
	And Next button should be in disabled mode
	And Data-Upload Application is closed 
	
	Examples: 
		 |user|  
		 |ic-test-admin@capgemini.com |
		 |ic-test-tech@capgemini.com  |
		#|h-test-admin@capgemini.com  |
		#|ic-test-surgeon@capgemini.com |
		#|ic-test-supportstaff@capgemini.com |