@B32G21-85
Feature: User should be able to create a poll by clicking on Poll tab under Activity Stream


  Background:
  Scenario Outline: User login verification
    Given user is logged in as "<userType>" user
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    @AC1
  Scenario Outline: Verify that the delivery is 'All employees' by default.
    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    Then user sees "All employees" is displayed

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @AC2
  Scenario Outline: : Adding questions and multiple answers And select to “Allow multiple choice” checkbox
    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    And user types  "<Question 1>"in Question box
    And user types "<Answer 1>" in first Answer box
    And user types "<Answer 2>" in second Answer box
    And user click "< Allow multiple choice>" first checkBox
    And user click on "Add question" under Allow multiple choice
    And user types  "<Question2>" in Question2 box
    And user types "<Answer 3>" in third Answer box
    And user types "<Answer 4>" in fourth Answer box
    And user click "< Allow multiple choice>" second checkBox
    And user types "<testBox>" in the textBox
    Then user click on "SEND" in sendButton

    Examples:
      | Question 1       | userType  | Answer 1 | Answer 2    | testBox           | Question2          | Answer 3 | Answer 4 |
      | How is your day? | hr        | Great    | pretty good | texting friend    | how is your family | Great    | good     |
      | How is your day? | helpdesk  | Great    | pretty good | texting co-worker | how is your family | Great    | good     |
      | How is your day? | marketing | Great    | pretty good | texting family    | how is your family | Great    | good     |


  @AC3
  Scenario Outline: verify "The message title is not specified" is error message
    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    And user click on "SEND" in sendButton
    Then user sees "The message title is not specified" first error message is displayed

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @AC4
  Scenario Outline: verify "Please specify at least one person." is error message
    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    And user click on "All employees" to delete All employees
    And user types  "<Question 1>"in Question box
    And user types "<Answer 1>" in first Answer box
    And user click on "SEND" in sendButton
    Then user sees "Please specify at least one person." second error message is displayed

    Examples:
      | userType  | Question 1 | Answer 1 |
      | hr        | aa         | a        |
      | helpdesk  | aa         | a        |
      | marketing | aa         | a        |


  @AC5
  Scenario Outline: Verify "The question "Question1?" has no answers" is error message

    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    And user types  "<Question 1>"in Question box
    And user types "<testBox>" in the textBox
    And user click on "SEND" in sendButton
    Then user sees Third error message is displayed


    Examples:
      | userType  | Question 1 | testBox          |
      | hr        | Question1? | here is the poll |
      | helpdesk  | Question1? | here is the poll |
      | marketing | Question1? | here is the poll |



  @AC6
  Scenario Outline: Verify "Please specify at least one person." is error message

    Given user is logged in as "<userType>" user
    When  user sees  "POLL" is displayed under  Active Stream
    And user click on "POLL" under  Active Stream
    And user types "<Answer 1>" in first Answer box
    And user types "<testBox>" in the textBox
    And user click on "SEND" in sendButton
    Then  user sees "The question text is not specified." fourth error message is displayed

    Examples:
      | userType  | Answer 1 | testBox          |
      | hr        | Hi       | here is the poll |
      | helpdesk  | Hi       | here is the poll |
      | marketing | Hi       | here is the poll |



