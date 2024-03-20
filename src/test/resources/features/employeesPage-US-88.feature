Feature: As a user, I want to access the Employees page.

Background:
  Given user is logged in as "hr" user

  @US88-TC1
  Scenario: Verify the users view following 8 modules in the Employees page.
    When user clicks employees page
    Then user sees below modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

