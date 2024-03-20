@login
Feature: Users should be able to login
  Background: User is already on the login page

Scenario Outline: User login verification
    Given user is on the login page
    And user is logged in as "<userType>" user
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

#  @hr
#  Scenario: Verify login with different user types
#    Given user is logged in as "hr" user
#
#  @helpdesk
#  Scenario: Verify login with different user types
#    Given user is logged in as "helpdesk" user
#
#  @marketing
#  Scenario: Verify login with different user types
#    Given user is logged in as "marketing" user

#Given user is logged in with username as "hr1@cydeo.com" and password as "UserUser"