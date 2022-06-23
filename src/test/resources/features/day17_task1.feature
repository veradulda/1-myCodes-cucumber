
Feature: user should be login with valid data

  Background: user in on the login page
    Given user is on the login page of web table page

  Scenario: Login with valid data
    When user enter UsNa "Test"
    And user enter Ps "Tester"
    And user click login bttn
    Then user should orders in the URL

