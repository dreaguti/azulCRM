@US88
Feature: As a user, I want to access the Employees page.

  @US88-TC1
  Scenario Outline: Verify the users view following 8 modules in the Employees page.
    Given user is logged in as "<userType>" user
    When user clicks employees page
    Then user able to see following modules
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

  @US88-TC2
  Scenario: Verify that user see the Company Structure by default
    Then user see "Company Structure" page title