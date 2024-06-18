
Feature: SSR1719 - Verifying that DUU web app shall require an application to be selected before beginning the data upload workflow.

Scenario Outline: TC0858 - Verify that Application Card should be selected by user to begin with data upload workflow.

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
	When user select's one application card from the list
	Then Next button should be in enabled state and clickable to begin with data upload workflow
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |
	

Scenario Outline: TC0544 - Verify that user is not able to begin with data upload workflow if no application card is selected.

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
	And user is not able to begin with data upload workflow if Application card is not selected
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |
	
	
	Scenario Outline: TC0703 - Verifying the application selection UI

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
  And no application shall be displayed as selected by default if more than one record available 
	And carousel arrow on left and right shall be displayed
	When user select's one application card from the list
	And the user clicks on Next Button
  Then the browse pc screen shall be displayed
	And the below components shall be displayed on browse pc screen
      | screen	                             |
      | select files to upload or drop below |
      | Back button                          |
      | Browse PC button                     |
      | Drag and Drop Here                   |
      | Dotted line box                      |
      | Upload Icon                          |
      | Browse PC button highlighted         |
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |
	
	
	Scenario Outline: TC1159 - Verifying that user shall not be able to select more than one application card

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
	When user selects one card from the list
	And the user selects one more card from the list
	Then the previously selected card shall be unselected	
	And Data-Upload Application is closed 
	
	Examples: 
	|user|  
	|ic-test-admin@capgemini.com |
	#|ic-test-tech@capgemini.com |
	#|ic-test-surgeon@capgemini.com|
	#|ic-test-supportstaff@capgemini.com |
	#|h-test-admin@capgemini.com |