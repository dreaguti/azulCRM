@B32G21-89
  #Test Execution on Jira - B32G21-176
Feature: Users should be able to see all options on the Activity Stream Page

  Background: User is already on the login page
    Given user is on the login page

  @AC1
  #B32G21-173 - Verify that the user can attach a link to the specified text.
  Scenario Outline: Verify that <userType> user can attach a link to the specified text

    And user is logged in as "<userType>" user
    And user is on the Activity Stream page
    Then user clicks on message header
    When user clicks on link icon
    And user enters "<text>" in text input box
    And user enters "<linkText>" in link input box
    And user clicks save button
    And user clicks send button
    Then user should see link on Activity Stream page

    Examples:
      | userType  | text   | linkText                |
      | hr        | google | https://www.google.com/ |
      | helpdesk  | google | https://www.google.com/ |
      | marketing | google | https://www.google.com/ |

  @AC2
    #B32G21-174 - Verify that by clicking on the link the user can navigate to the correct URL.
  Scenario Outline: Verify that by clicking on the link the "<userType>" can navigate to the correct URL.
    And user is logged in as "<userType>" user
    When user clicks on the link
    Then user should be directed to correct "<URL>"

    Examples:
      | userType  | URL                     |
      | hr        | https://www.google.com/ |
      | helpdesk  | https://www.google.com/ |
      | marketing | https://www.google.com/ |

  @AC3
    #B32G21-175 - Verify that the link is opened in a new tab.
  Scenario Outline: Verify that the link is opened in a new tab.
    And user is logged in as "<userType>" user
    When user clicks on the link
    Then user should be directed to correct "<URL>"
    And user should see link opened in a new tab

    Examples:
      | userType  | URL                     |
      | hr        | https://www.google.com/ |
      | helpdesk  | https://www.google.com/ |
      | marketing | https://www.google.com/ |