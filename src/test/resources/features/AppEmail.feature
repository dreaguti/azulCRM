@B32G21-172
Feature: Appreciation email functionality


@B32G21-167
  Scenario: user sees the warning messages for Adding at least one Person
    Given user is on the login page
    When user navigate to "MORE" module
    And user select "Appreciation" from the  more button
    And user click on the All employees to remove the Default
    And  user write "Well Friend! You are now UI automation tester" in the email body
    And user click the "sendButton"
    Then user sees the "Please specify at least one person." message

@B32G21-168
  Scenario: user sees the warning messages for title specify

    When user navigate to "more" module
    And user select "Appreciation" from the  more button
    And user add at least one more email receiver
    And user click the "sendButton"
    Then user see the "The message title is not specified" message


  @B32G21-169
  Scenario: user sees the All employees in default

    When user navigate to "more" module
    And user select "Appreciation" from the  more button
    Then user sees "All employees" is displayed in default


    @B32G21-171
    Scenario: Verify email looks cancelable before sending
    When user navigate to "more" module
    And user select "Appreciation" from the  more button
    And  user writes "Friends! i know you passed though time, now you will enjoy." in the email body
    And user add email "hr4@cydeo.com" receiver
    Then user can cancel email before click on sending button