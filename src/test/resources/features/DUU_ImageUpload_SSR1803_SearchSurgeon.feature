
Feature: SSR1803 - Verifying searchable list with surgeon data to select correct surgeon from the list.


Scenario Outline: TC0857 - Verify DUU web App shall provide a searchable list with surgeon data to the user to select correct surgeon.
    
    Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
    And Homepage is displayed to the user
    When User clicks on Upload Files from left panel
    And Clicks on Upload Button
    Then Search facility screen is displayed to user along with back and next button
    When User clicks on facility which has surgeon associated
    And user clicks on Next button
    And the surgeon search box shall be displayed
    When the user enters B text in search box
    Then the list shall display entered B text
    When the user enters D text in search box
    Then the list shall display entered D text
    When the user enters ac text in search box
    Then the list shall display entered ac text
    When the user enters ElizabethAnnDailey text in search box
    Then the list shall display entered ElizabethAnnDailey text
    And Data-Upload Application is closed

    Examples: 
      | user                        |
      #| h-test-admin@capgemini.com |
      | ic-test-admin@capgemini.com |
