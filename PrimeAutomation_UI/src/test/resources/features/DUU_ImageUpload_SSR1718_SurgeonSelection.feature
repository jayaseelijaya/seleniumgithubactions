
Feature: SSR1718 - Verifying that DUU app shall require a surgeon to be selected before beginning the data upload workflow.

Scenario Outline: TC0517 - Verify user should not be able to proceed with data upload if surgeon is not selected.

	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	Then Homepage is getting displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload File 
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has surgeon associated
	And user clicks on Next button
	Then surgeon list should be display as per the selected facility
	And user is not able to proceed with data upload if no surgeon selected
	And Data-Upload Application is closed  
	
	Examples: 
	|user|  
	| ic-test-admin@capgemini.com |
	#| ic-test-tech@capgemini.com |
	#| ic-test-surgeon@capgemini.com |
	#| ic-test-supportstaff@capgemini.com |
	#| h-test-admin@capgemini.com |
	

Scenario Outline: TC0527 - Verify that notification message is displayed to user if Surgeon is not available for selected organisation.

	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
    Then Homepage is getting displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload File 
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has no surgeon associated
	And user clicks on Next button
	Then notification message should be displayed to the user
	And Back button should be in enabled mode & clickable 
	And Next button should be in disabled mode & non-clickable
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	| ic-test-admin@capgemini.com |
	# | ic-test-tech@capgemini.com |
	#| ic-test-surgeon@capgemini.com |
	#| ic-test-supportstaff@capgemini.com |
	#| h-test-admin@capgemini.com |
	
	
Scenario Outline: TC0842 - Verify that Surgeon should be selected by user to begin with data upload workflow.

	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	Then Homepage is getting displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload File 
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has surgeon associated
	And user clicks on Next button
	Then surgeon list should be display as per the selected facility
	And user clicks on any of the surgeon listed
	And Next button should be in enabled mode after selecting surgeon
	And Data-Upload Application is closed  
	
	Examples: 
	|user|  
	| ic-test-admin@capgemini.com |
	#| ic-test-tech@capgemini.com |
	#| ic-test-surgeon@capgemini.com |
	#| ic-test-supportstaff@capgemini.com |
	#| h-test-admin@capgemini.com |	
