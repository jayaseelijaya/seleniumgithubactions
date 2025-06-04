
Feature: SSR1720 - Verifying that DUU web app shall allow selection of application that have been associated with selected facility/surgeon.

Scenario Outline: TC0859 - Verify that List of Application Card associated with selected surgeon should be displayed to user.
	
	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	And Homepage is displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload Button
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has surgeon associated
	And user clicks on Next button
	Then surgeon list should be display as per the selected facility
	And user clicks on surgeon which has application card associated
	When user clicks on Next button after surgeon selection
	Then Application Selection Modal screen is displayed to user along with back and next button
	And List of Application Card associated with selected facility/surgeon is displayed
	When user clicks on Back button
	And user clicks on another surgeon from the surgeon selection screen
	And user clicks on Next button after surgeon selection
	Then List of Application Card associated with selected facility/surgeon is displayed
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |
	
	
Scenario Outline: TC0546 - Verify that notification message is displayed to user if no Application Card associated with selected surgeon.
	
	Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	And Homepage is displayed to the user
	When User clicks on Upload Files from left panel
	And Clicks on Upload Button
	Then Search facility screen is displayed to user along with back and next button
	When User clicks on facility which has surgeon associated
	And user clicks on Next button
	Then surgeon list should be display as per the selected facility
	When user clicks on surgeon which deosn't have application card associated
	And user clicks on Next button after surgeon selection
	Then Notification message should be displayed to user if no application card is present
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |