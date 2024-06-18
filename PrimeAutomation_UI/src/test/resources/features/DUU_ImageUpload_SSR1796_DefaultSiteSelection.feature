
Feature: SSR1796 - Verifying Data Upload Utility web app data upload workflow shall default select an organization upon login if only one organization is selectable.

Scenario Outline: TC0523 - Verify that DUU shall default to no organization selection if more than one organization data available.

    Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	Then Homepage of the application is displayed in the screen
    When user clicks on Upload files button from left pane 
    And user redirects to Upload File button on the right side and clicks on it
    Then Organisation Selection Modal is be displayed to the user 
    And no organisation should be selected if more than one organisation is available
    And Next button should be in disabled mode and unclickable
   	And Data-Upload Application is closed 
    
  Examples: 
 | user |  
 #| ic-test-nurse@capgemini.com |
  | ic-test-tech@capgemini.com |
 #| ic-test-admin@capgemini.com |
 #| h-test-admin@capgemini.com |
 #| ic-test-supportstaff@capgemini.com |
 
Scenario Outline: TC0845 - Verify organisation should be selected by-default if only one organisation is selectable.

    Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
	Then Homepage of the application is displayed in the screen
    When user clicks on Upload files button from left pane 
    And user redirects to Upload File button on the right side and clicks on it
    Then Organisation Selection Modal is be displayed to the user 
    And facility should be by-default selected if only one organisation is available
    And Next button should be in enable mode and clickable 
    And Application will be closed by user
    
  Examples: 
  | user |  
 #| ic-test-nurse@capgemini.com |
 #| ic-test-tech@capgemini.com |
  | ic-test-admin@capgemini.com |
 #| h-test-admin@capgemini.com |
 #| ic-test-supportstaff@capgemini.com |
 