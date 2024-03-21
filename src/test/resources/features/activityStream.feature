@wip
Feature: Users should be able to see all options on the Activity Stream Page

  Background: User is already on the login page
    Given user is on the login page

  @AC1
#  Activity Stream Page - Options Verification
  Scenario Outline: Verify that <userType> user can view the following options on the Activity Stream page.
  Message
  Task
  Event
  Poll
  More

    And user is logged in as "<userType>" user
    And user is on the Activity Stream page
    Then user should see "<headerText>" is displayed
    Examples:
      | userType  | headerText                       |
      | hr        | Message, Text, Event, Poll, More |
      | helpdesk  | Message, Text, Event, Poll, More |
      | marketing | Message, Text, Event, Poll, More |


  @AC2
#  Activity Stream Page - More Options Verification
  Scenario Outline: Verify that <userType> user can view the following 4 options under the MORE tab.
  File
  Appreciation
  Announcement
  Workflow

    And user is logged in as "<userType>" user
    And user is on the Activity Stream page
    And clicks on More dropdown
    Then user should see "<option>" is displayed

    Examples:
      | userType  | option                                 |
      | hr        | File, Appreciation, Announcement, Poll |
      | helpdesk  | File, Appreciation, Announcement, Poll |
      | marketing | File, Appreciation, Announcement, Poll |
