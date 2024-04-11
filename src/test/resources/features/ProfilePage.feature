@B32G21-92
Feature: As a user i want to access my profile page.

  @TC1
  Scenario Outline: Verify the users view the following options on my profile page
    Given user is on the login page
    When user is logged in as "<userType>" user
    When user clicks on user block
    Then user click on my profile
    Then user should see the following options:
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @TC2
  Scenario Outline: Verify the email address under the General tab
    Given user is logged in as "<userType>" user
    Given user click on user block
    Given user click on the my profile
    And user should verify "<expected>" address under contact information
    Examples:
      | userType  | expected                  |
      | hr        | (1) hr1@cydeo.com         |
      | helpdesk  | (2) helpdesk1@cydeo.com   |
      | marketing | (11) marketing1@cydeo.com |