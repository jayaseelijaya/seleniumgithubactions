Feature: SSR2292 - The system shall support a Support Staff user type.

  @summarydashboard_TC2929
  Scenario: TC2929 - Support staff _Verify the DUU web app upload dashboard is searchable by surgeon name, patient name, application name, facility name, status and date of birth.
    #Step 1
    Given that the user is logged in to Data-Upload Utility Application through chrome "ic-test-staff@capgemini.com"
    #Given Ensure at least 2 image upload records with different surgeon , site , application and file status are available on upload dashboard screen
    When click settings page button from left menu
    When the user enters "1" in successful upload expiration textbox
    And the user enters "1" in unsuccessful upload expiration textbox
    When the user clicks on save button in settings
    When the user clicks on dashbaord button from left menu bar
    #Step 2
    Then the records which is uploaded within 24 hours are displayed
    #Step 3
    Then the Searchbox shall be displayed
    And the search button shall be displayed
    #Step 4
    When Enter the "surgeon name" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "surgeon name"
    #Step 5
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 6
    When Enter the "patient name" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "patient name"
    #Step 7
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 8
    When Enter the "application name" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "application name"
    #Step 9
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 10
    When Enter the "site name" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "site name"
    #Step 11
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 12
    When Enter the "file status" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "file status"
    #Step 13
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 14
    When Enter the "DOB" in Search bar and click on Search button
    Then the image upload record details are filtered with searched "DOB"
    #Step 15
    When the user clears the search bar
    Then the records which is uploaded within 24 hours are displayed
    #Step 16
    When the user click on Exit Apps at the bottom of the left menu panel
    Then the Application access screen is displayed
    #Step 17
    When user clicks on Logout icon from left panel
    Then user is logout from the application.
    And Data-Upload Application is closed

  