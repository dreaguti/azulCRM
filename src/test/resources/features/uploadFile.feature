@wip-us90
Feature: Uploading files and pictures as message feature

  User Story:
  As a user, I should be able to upload files and pictures as messages

  Background: User is already on the login page
    Given User is already logged in to the portal Web page
    When User clicks send message box


  @US-90_TC#1
  Scenario: Upload files and pictures verification
    And User click Upload files button
    And User click Uploads files and images box
    Then User upload files and images

  @US-90_TC#
  Scenario: Upload files and pictures verification
    And User click Upload files button
    And User click Uploads files and images box
    And User upload files and images
    Then User insert files and images into the text

  @US-90_TC#
  Scenario: Upload files and pictures verification
    And User click Upload files button
    And User click Uploads files and images box
    And User upload files and images
    And User insert files and images into the text
    Then User remove files and images before sending







