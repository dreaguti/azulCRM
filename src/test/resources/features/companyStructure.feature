@US87
Feature: As a user, I should be able to use functions on Company Structure under Employee menu.

  Scenario Outline: All user types should be able to display company structure.
    Given user is on the login page
    And user is logged in as "<userType>" user
    Then user clicks employees page

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario: Hr user should be able to add a department from the company structure.
    When user is logged in as "hr" user
    And user clicks employees page
    Then hr can add department

  Scenario Outline: There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.
    When user is logged in as "<userType>" user
    And user clicks employees page
    Then user can not add department
    Examples:
      | userType  |
      | helpdesk  |
      | marketing |