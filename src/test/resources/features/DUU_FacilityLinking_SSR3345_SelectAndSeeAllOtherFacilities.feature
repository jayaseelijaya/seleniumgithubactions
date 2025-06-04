Feature: SSR3345 - Data Upload Utility shall allow the S&N HIL Manager to select a facility and see all the other linked and unlinked facilities

	@facilityLinking_TC3493
  Scenario Outline: TC3493 - SN HIL Manager_Verify Data Upload Utility shall allow the SN HIL Manager to select a facility and see all the linked and unlinked facilities
   	##Step 1
    Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
    Then Choose Site screen is displayed
    ##Step 2
    Then Search for hospital
    When clicks on any of the faclity from the facility selection screen
    And click on select button
    Then Upload dashboad page is displayed to user
    ##Step 3
    When the user clicks on imaging links button from left menu bar
    Then the Create or Modify Links screen is displayed
    ##Step 4
    Then All Organizations and Available Imaging Facilities or Available Providers tables with a Search button are displayed
    ## Step 5
    Then list of facilities are displayed under All Organizations table
    ##Step 6
    When User clicks inactive facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And Highlighted Hospital details and the status are displayed under "Provider" details
    ##Step 7
    Then Linked facilities with link icon and Unlinked facilities with stroked link icon are displayed
    ##Step 8
    Then User clicks active facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And Highlighted Hospital details and the status are displayed under "Provider" details
    ##Step 9
   	Then Linked facilities with link icon and Unlinked facilities with stroked link icon are displayed
    ##Step 10
    And the user enters Na facility name into the search bar
    And the user clicks on search button of left table
    And Wait 5 seconds
    Then User clicks NA facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And Highlighted Hospital details and the status are displayed under "Provider" details
    ##Step 11
    And Check that both linked and unlinked facilities are displayed in the right table
    #Step 12
    When the user click on Exit Apps at the bottom of the left menu panel
    #Step 13
    When user clicks on Logout icon from left panel
    
    Examples: 
      | user                                  |
      | ic-test-snn-hil-manager@capgemini.com |
      
  @facilityLinking_TC3489
  Scenario Outline: TC3489 - S&N HIL Manager_ Verify Usability for Imaging links screen
    #Step 1
    #	Given Ensure facilities of type "Provider" and "Imaging center" with status Active, Inactive and N/A  are available.
    Given that the user is logged in to Data-Upload Utility Application through chrome "<user>"
    Then Choose Site screen is displayed
    Then Search for hospital
    When clicks on any of the faclity from the facility selection screen
    And click on select button
    Then Upload dashboad page is displayed to user
    When the user clicks on imaging links button from left menu bar
    #Step 2
    Then the imaging links shall be higlighted in left menu bar
    And the Create or Modify Links screen is displayed
    And the Create or Modify Links header text in white color
    #Step 3
    Then the left section table of Imaging Links screen is displayed
    |Items																		|
    |All organizations												|
    |Search tab																|
    |Enter keyword, Name of Facility or City	|
    |Search Button														|
    |Name of the all the facilities						|
    |Facility type 														|
    |City, State of the facilities						|
    |Active status 														|
    #|Show more|
    ##Step 4
    Then User clicks active facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And the following elements are displayed below the left table in white font
      | elements                       |
      | Imaging Facility Details text  |
      | Name                           |
      | Address                        |
      | Admin                          |
      | Email                          |
      | Contact number                 |
      | Activate Site button Disabled  |
      | Deactivate Site button Enabled |
    #Step 5
    Then the right section table of Imaging Links screen is displayed
    |Items																		|
    |Available Providers header text					|
    |Toggle button turned on 									|
    |Pin linked centers to top								|
    |Toggle button turned off 								|
    |Search tab																|
    |Enter keyword, Name of Facility or City	|
    |Search Button														|
    |Name																			|
    |Link and delink icons										|
    |City and State 													|
    |Contact number 													|
    #|Show more|
    #Step 6
    Then The user clicks the create link button under the right table
    When the user selects "provider" from the right table which is in "Linked" state
    Then the selected provider is highlighted in the teal color rectangular box
    And the following elements are displayed below the right table in white font
    | elements              				|
    | Provider Details text 				|
    | Name                  				|
    | Address               				|
    | Admin Name            				|
    | Website               				|
    | Contact number        				|
    | Create Link button Disabled  |
    | Remove Link button Enabled  	|
    When the user selects "provider" from the right table which is in "Unlinked" state
    Then the user clicks the fourth entry in the right side table
    Then the selected provider is highlighted in the teal color rectangular box
    And the following elements are displayed below the right table in white font
    | elements              			|
    | Provider Details text 			|
    | Name                  			|
    | Address               			|
    | Admin Name            			|
    | Website               			|
    | Contact number        			|
    | Create Link button Enabled  |
    | Remove Link button Disabled |
    #Step 7
    When User clicks inactive facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And the following elements are displayed below the left table in white font
    | elements               					|
    | Provider Details text  					|
    | Name                   					|
    | Address                					|
    | Admin Name             					|
    | Email                  					|
    | Contact number         					|
    | Activate Site button Enabled    |
    | Deactivate Site button Disabled |
    #Step 8
    Then the right section table of Imaging Links screen is displayed
    |Items																		|
    |Available Imaging Facilities text				|
    |Toggle button turned on 									|
    |Pin linked centers to top								|
    |Toggle button turned off 								|
    |Search tab																|
    |Enter keyword, Name of Facility or City  |
    |Search Button														|
    |Name																			|
    |Link and delink icons										|
    |City and State 													|
    |Contact number 													|
    #|Show more|
    #Step 9
    When the user selects "Imaging center" from the right table which is in "Linked" state
    Then the selected facility is highlighted in the teal color rectangular box
    And the following elements are displayed below the right table in white font
    | elements                      |
    | Imaging Facility Details text |
    | Name                          |
    | Address                       |
    | Admin Name                    |
    | Website                       |
    | Contact number                |
    | Create Link button Disabled   |
    | Remove Link button Enabled  	|
    When the user selects "Imaging center" from the right table which is in "Unlinked" state
    Then the user clicks the fourth entry in the right side table
    Then the selected provider is highlighted in the teal color rectangular box
    And the following elements are displayed below the right table in white font
    | elements              				|
    | Imaging Facility Details text |
    | Name                  				|
    | Address               				|
    | Admin Name            				|
    | Website               				|
    | Contact number        				|
    | Create Link button Enabled  	|
    | Remove Link button Disabled  	|
    #Step 10
    Then User clicks active facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And Highlighted Hospital details and the status are displayed under "Provider" details
    #Step 11
    Then Linked facility is displayed with link icon highlighted in Green color
    And Unlinked facility is displayed with stroked link icon highlighted in white color
    #Step 12
    Then the Activate Site and Deactivate site buttons are available under "provider" details
    Then "Deactivate Site" button is enabled
    #Step 13
    When the user clicks on "Deactivate site" button
    And Wait 5 seconds
    Then "Hospital" status is changed to "Inactive" within the table and highlighted in green color
    #Step 14
    Then "Activate Site" button is enabled
    #Step 15
    When the user clicks on "Activate site" button
    And Wait 5 seconds
    Then "Hospital" status is changed to "Active" within the table and highlighted in green color
    #Step 16
    Then User clicks active facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    And Highlighted Image center details and the status are displayed under Imaging Facility details
    #Step 17
    Then the Activate Site and Deactivate site buttons are available under "Imaging Facility" details
    Then "Deactivate Site" button is enabled
    #Step 18
    When the user clicks on "Deactivate site" button
    And Wait 5 seconds
    Then "Image center" status is changed to "Inactive" within the table and highlighted in green color
    #Step 19
    Then "Activate Site" button is enabled
    #Step 20
    When the user clicks on "Activate site" button
    And Wait 5 seconds
    Then "Image center" status is changed to "Active" within the table and highlighted in green color
    #Step 21
    When the user selects "Imaging center" from the left table which is in "Inactive" status
    Then the selected facility is highlighted in the teal color rectangular box
    #Step 22
    When the user selects "Provider" from the left table which is in "Inactive" status
    Then the selected facility is highlighted in the teal color rectangular box
    #Step 23
    Then User clicks NA facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    #Step 24
    Then User clicks NA facility in left table
    Then the selected facility is highlighted in the teal color rectangular box
    #Step 25
    When the user click on Exit Apps at the bottom of the left menu panel
    #Step 26
    When user clicks on Logout icon from left panel

    Examples: 
      | user                                  |
      | ic-test-snn-hil-manager@capgemini.com |
      
