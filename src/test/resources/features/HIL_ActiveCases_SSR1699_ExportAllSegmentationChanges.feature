Feature: SSR1699 - Verifying the S+N HIL Manager View shall allow to export all segmentation changes by case. 

#create one folder under reports folder as "HILAuditLogs" before executing test case
	@activeCases_TC2867
	Scenario Outline: TC2867 - SN HIL Manager_Verify the user is allowed to export all segmentation changes by case. 
		Given that the user is logged in to HIL Application through chrome "<user>"
		And the active cases screen shall be displayed
		Then the case records shall be displayed in tabular column of active cases
    When the user selects a claimed case record from the active case list
    When the user clicks on audit log icon for the selected case file
    Then the active cases audit log file of selected case record shall be downloaded in .csv file
    When the user clicks on "Case History" tab at the header
    Then the case records shall be displayed in the list of case history
    When the user selects a case record from the case history list
    Then the case record shall be selected and higlighted in green color
    When the user clicks on audit log icon for the selected case history file
    Then the case history audit log file of selected case record shall be downloaded in .csv file
		When the user clicks on Logout button at top right section
    Then the user is logged out successfully and navigated to CLP login screen
		
		Examples:
    | user                                  |
    | ic-test-snn-hil-manager@capgemini.com  |
    
#create one folder under reports folder as "HILAuditLogs" before executing test case
    @activeCases_TC2868
	Scenario Outline: TC2868 - SN HIL Manager_Verify usability of S&N HIL Manager export option for segmentation changes by case.  
		Given that the user is logged in to HIL Application through chrome "<user>"
		And the active cases screen shall be displayed
		Then the case records shall be displayed in tabular column of active cases
    When the user selects a claimed case record from the active case list
    When the user clicks on audit log icon for the selected case file
    Then the active cases audit log file of selected case record shall be downloaded in .csv file
    And the following headers shall be displayed in downloaded audit log file
    | header |
    | Date	 |
    | Case Id |
    | User Id |
    | Action	|
    Then the downloaded audit log file data should match with on screen active cases data 
    When the user clicks on "Case History" tab at the header
    Then the case records shall be displayed in the list of case history
    When the user selects a case record from the case history list
    Then the case record shall be selected and higlighted in green color
    When the user clicks on audit log icon for the selected case history file
    Then the case history audit log file of selected case record shall be downloaded in .csv file
    And the following headers shall be displayed in downloaded case history audit log file
    | header |
    | Date	 |
    | Case Id |
    | User Id |
    | Action	|
    Then the downloaded audit log file data should match with on screen case history data
		When the user clicks on Logout button at top right section
    #Then the user is logged out successfully and navigated to CLP login screen
		
		Examples:
    | user                                  |
    | ic-test-snn-hil-manager@capgemini.com  |
    
   