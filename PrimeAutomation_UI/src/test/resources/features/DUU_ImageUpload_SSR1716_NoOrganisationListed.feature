@Site
Feature: SSR1716 - Verifying that DUU web app shall allow selection of application that have been added as linked data target organisation.

Scenario Outline: TC0828 - Verify that DUU shall allow only selection of organisation that have been added as linked data target organisation.
	
	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	And Homepage is displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload Button
	Then Search facility screen is displayed to user along with back and next button
	And List of facility is displayed to user 
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |
	
Scenario Outline: TC0410 - Verify that DUU shall give notification message if organisation is not linked to data on target organisation.
	
	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	And Homepage is displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload Button
	Then Search facility screen is displayed to user along with back and next button
	And Notification message should be displayed if organisation is not linked to user
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	