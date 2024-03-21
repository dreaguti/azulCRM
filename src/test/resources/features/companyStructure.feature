@B32G21-163
Feature: Company Structure under Employee menu

  @B32G21-160
  Scenario Outline: All user types should be able to display company structure.
    Given user is on the login page
    And user is logged in as "<userType>" user
    Then user clicks employees page

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
  @B32G21-161
  Scenario: Hr user should be able to add a department from the company structure.
    When user is logged in as "hr" user
    And user clicks employees page
    Then hr can add department
  @B32G21-162
  Scenario Outline: There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.
    When user is logged in as "<userType>" user
    And user clicks employees page
    Then user can not add department
    Examples:
      | userType  |
      | helpdesk  |
      | marketing |