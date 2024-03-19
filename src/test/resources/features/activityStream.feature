@wip
Feature: Users should be able to see all options on the Activity Stream Page

  Background: User is already logged in
    Given user is logged in as "hr" user
#   Given user is logged in as "helpdesk" user
#   Given user is logged in as "marketing" user
    And user is on the Activity Stream page
#      | userType  | username             | password |
#      | hr        | hr1@cydeo.com        | UserUser |
#      | helpdesk  | helpdesk1@cydeo.com  | UserUser |
#      | marketing | marketing1@cydeo.com | UserUser |

  @AC1
  Scenario: Activity Stream Page - Options Verification
    Then user should see "Message" is displayed
    And user should see "Task" is displayed
    And user should see "Event" is displayed
    And user should see "Poll" is displayed
    And user should see "More" is displayed

  @AC2
  Scenario: Activity Stream Page - More Options Verification
    And clicks on More dropdown
    Then user should see "File" option is displayed
    And user should see "Appreciation" option is displayed
    And user should see "Announcement" option is displayed
    And user should see "Poll" option is displayed


#  @AC2-Dynamic
#  Scenario Outline: Activity Stream Page - Dropdown Options Verification
#    Given user is logged in as "hr" user
#    When user is on the Activity Stream page
#    And clicks on More dropdown
#    Then user should see "<headerText>" is displayed
#    And user should see "<headerText>" is displayed
#    And user should see "<headerText>" is displayed
#    And user should see "<headerText>" is displayed
#    Examples:
#      | headerText   |
#      | File         |
#      | Appreciation |
#      | Announcement |
#      | Poll         |
