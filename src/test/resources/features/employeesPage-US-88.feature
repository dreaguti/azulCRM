@US8846
Feature: As a user, I want to access the Employees page.


  Scenario Outline: Verify the users view following 8 modules in the Employees page.
    Given user is logged in as "<userType>" user
    When user clicks employees pages
    Then user able to see following module
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |
      | More                |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify that user see the Company Structure by default
    Given user is logged in as "<userType>" user
    When user clicks employees pages
    Then user sees "(1) Company Structure" page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
