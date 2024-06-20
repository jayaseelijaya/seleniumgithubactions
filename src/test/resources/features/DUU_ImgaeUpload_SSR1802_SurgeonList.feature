
Feature: SSR1802 - Verifying Data Upload Utility web app workflow shall provide a list of surgeons at the correct organization for the user to make a surgeon selection.

Scenario Outline: TC0852 - Verify List of Surgeon's associated with the organisation should be displayed to the user as per the facility selected.

    Given that the chrome browser is opened
    And Application url is entered
    When the Username is entered as "<user>"
    And the password is entered
    And login button is clicked
    Then the homepage shall be displayed to the user
    When user clicked on upload files button from left menu bar
    And then user click on Upload File from the homescreen
    Then Facility Selection screen modal should be displayed to the user 
    And user clicks any of the facility from the list
    And after selecting facility user clicks on Next button
    Then List of Surgeon associated with the selected facility is displayed
    And the applicaton is closed 
    
  Examples: 
 | user |  
 | h-test-admin@capgemini.com |
 | ic-test-admin@capgemini.com |
#| ic-test-tech@capgemini.com |
#| ic-test-surgeon@capgemini.com |
#| ic-test-snhilmanager@capgemini.com |
#| ic-test-nurse@capgemini.com |