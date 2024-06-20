
Feature: SSR1798 - Verifying Data Upload Utility web app workflow shall default select a surgeon upon login if only one surgeon is selectable.

Scenario Outline: TC0854 - Verify Surgeon should be selected by default if only one Surgeon available for selected organization.

	Given Chrome Browser is launched
	And dataupload utility app url is entered 
	When UserName value entered as "<user>" 
	And Password value is entered by user
	And than user clicks on Login Button
	Then Homepage is getting displayed 
	When User clicks on Upload Files button from left panel
	And than User clicks on Upload File 
	Then Search facility screen is displayed along with back and next button
	When user clicks on facility which has only one surgeon associated
	And user clicks on Next button which is in enabled state
	Then Surgeon should be selected by-default
	And Application is closed 
	
	Examples: 
		 |user|  
		 |ic-test-admin@capgemini.com |
		#|ic-test-tech@capgemini.com |
		#|ic-test-nurse@capgemini.com |
		#|ic-test-surgeon@capgemini.com |
		
Scenario Outline: TC0536 - Verify Surgeon should not be selected by default if more than one Surgeon available for selected organization.

	Given Chrome Browser is launched
	And dataupload utility app url is entered 
	When UserName value entered as "<user>" 
	And Password value is entered by user
	And than user clicks on Login Button
	Then Homepage is getting displayed 
	When User clicks on Upload Files button from left panel
	And than User clicks on Upload File 
	Then Search facility screen is displayed along with back and next button
	When user clicks on facility which has more than one surgeon associated
	And user clicks on Next button which is in enabled state
	Then No surgeon should be selected by default
	And Next button is in disabled state
	And Application is closed 
	
	Examples: 
		 |user|  
		 |ic-test-admin@capgemini.com |
		#|ic-test-tech@capgemini.com |
		#|ic-test-nurse@capgemini.com |
		#|ic-test-surgeon@capgemini.com |