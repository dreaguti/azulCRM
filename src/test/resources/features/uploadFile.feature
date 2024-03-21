Feature: Uploading files and pictures as message feature

  User Story:
  As a user, I should be able to upload files and pictures as messages

  @US-90_TC#1
  Scenario: Upload files and pictures verification
    Given User is already logged in to the portal Web page
    When User clicks the more button
    And Selects the File option
    Then User upload files and images

  @US-90_TC#2
  Scenario:  Upload files and pictures verification
    Given User is already logged in to the portal Web page
    When User clicks the more button
    And Selects the File option
    And User upload files and images
    Then User can insert files and images into the text

  @US-90_TC#3
  Scenario:  Upload files and pictures verification
    Given User is already logged in to the portal Web page
    When User clicks the more button
    And Selects the File option
    And User upload files and images
    And User can insert files and images into the text
    Then User removes any file or images before sending





