@wip
Feature: Users should be able to see all options on the Activity Stream Page

  Background: User is already on the login page
    Given user is on the login page

#  AC1 - Activity Stream Page - Options Verification
  Scenario Outline: Verify that <userType> user can view the following options on the Activity Stream page.
  Message
  Task
  Event
  Poll
  More

    And user is logged in as "<userType>" user
    And user clicks "Activity Stream"
    Then user should see the following options on the Activity Stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

# AC2 -  Activity Stream Page - More Options Verification
  Scenario Outline: Verify that <userType> user can view the following 4 options under the MORE tab.
  File
  Appreciation
  Announcement
  Workflow

    And user is logged in as "<userType>" user
    And user clicks "Activity Stream"
    And user clicks "More" in Activity Stream
    Then user should see the following options on the Activity Stream page
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
