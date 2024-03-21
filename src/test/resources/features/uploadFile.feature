@wip-us90
Feature: Uploading files and pictures as message feature

  User Story:
  As a user, I should be able to upload files and pictures as messages

  Background: User is already on the login page
    Given user is on the login page




  @US-90_TC#1
  Scenario Outline: Verify "<userType>" can upload files and images
    And user is logged in as "<userType>" user
    When User clicks send message box
    And User click Upload files button
    And User click Uploads files and images box
    Then User upload files and images
    Examples:
      | userType  |
      | hr        |

  @US-90_TC#2
  Scenario Outline: Verify "<userType>" can insert files and images as text
    And user is logged in as "<userType>" user
    When User clicks send message box
    And User click Upload files button
    And User click Uploads files and images box
    And User upload files and images
    Then User insert files and images into the text
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @US-90_TC#3
  Scenario Outline: Verify "<userType>" can remove files and images before sending
    And user is logged in as "<userType>" user
    When User clicks send message box
    And User click Upload files button
    And User click Uploads files and images box
    And User upload files and images
    And User insert files and images into the text
    Then User remove files and images before sending
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |







