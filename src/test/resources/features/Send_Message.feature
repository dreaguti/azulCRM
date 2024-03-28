@B32G21-156
Feature:MESSAGE functionality


  @B
 Scenario: Verify that the user can send a message by filling in the mandatory fields.
    #Given user is logged in login page
    When User clicks message option on the page .

    And user write something inside the body of the text box
    Then user click on the send button




Scenario: The message delivery should be to 'All employees' by default.
  When User clicks message option on the page .
  Then user sees the "All empoyees"option by default
  And user undefault All employees option
  Then user click on the send button
  Then user sees the error message

  Scenario: User should be able to cancel sending message at any time before sending.
    When User clicks message option on the page .
  Then user can cancel send message at any time before sending it
