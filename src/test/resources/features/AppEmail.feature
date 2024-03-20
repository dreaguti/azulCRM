@AppEmail
Feature: Appreciation email functionality
  Background:
    Given user is on the login page
@crm21
  Scenario: user sees the warning messages for Adding at least one Person

    When user navigate to more module
    And user select Appreciation from the  more button
    And user click on the All employees to remove the Default
    And  user writ something in the email body
    And user click the send button
    Then user sees the Please specify at least one person. message

@crm22
  Scenario: user sees the warning messages for title specify

    When user navigate to more module
    And user select Appreciation from the  more button
    And user add at least one more email receiver
    And user click the send button
    Then user sees the The message title is not specified


  @crm23
  Scenario: user sees the All employees in default

    When user navigate to more module
    And user select Appreciation from the  more button
    Then user sees All employees is displayed in default


    @crmOutline
    Scenario: Verify email looks cancelable before sending
    When user navigate to more module
    And user select Appreciation from the  more button
    And  user writ something in the email body
    And user add any email receiver
    Then user can cancel email before click on sending button