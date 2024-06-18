
Feature: SSR1797 - Verifying Data Upload Utility web app data upload workflow shall default to no organization selected upon initial login if more than one organization is selectable.

Scenario Outline: TC0846 - Verify no organisation should be selected by default if more than one organisation is selectable.

    Given chrome browser is launched by user
    And dataUpload utility url is entered
    When email-address is entered as "<user>"
    And password is entered by user
    And login button is clicked by user
    Then the homepage of the application is displayed
    When user clicked on upload files field from left panel 
    And click on Upload File from the homescreen
    Then Facility Selection Modal is be displayed to the user 
    And no facility should be by-default selected and next button should be in disabled mode
    And application will be closed
    
  Examples: 
 | user |  
 #| h-test-admin@capgemini.com |
 | ic-test-admin@capgemini.com |
 | ic-test-tech@capgemini.com |
 #| ic-test-surgeon@capgemini.com |
 #| ic-test-supportstaff@capgemini.com |