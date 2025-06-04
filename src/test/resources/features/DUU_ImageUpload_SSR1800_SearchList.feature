
Feature: SSR1800 - Verifying searchable list with organization data to select correct organization from the list.

Scenario Outline: TC0850 - Verify DUU web App shall provide a searchable list with facility data to the user to facilitate correct organization selection.

 Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
 And Homepage is displayed to the user
 When User clicks on Upload Files from left panel 
 And Clicks on Upload Button
 Then Search facility screen is displayed to user along with back and next button
 And List of facility is displayed to user 
 And the search box shall be displayed
 When the user enters ABCH text in search box
 Then the list shall display entered ABCH text
 When the user enters A text in search box
 Then the list shall display entered A text
 When the user enters zx text in search box
 Then the list shall display entered zx text
 When the user enters Baystate Wing Hospital text in search box
 Then the list shall display entered Baystate Wing Hospital text
 And Data-Upload Application is closed
 
 Examples: 
      | user                               |
      #| h-test-admin@capgemini.com         |
      | ic-test-admin@capgemini.com        |
      #| ic-test-tech@capgemini.com         |
      #| ic-test-surgeon@capgemini.com      |
      #| ic-test-supportstaff@capgemini.com |
      
      