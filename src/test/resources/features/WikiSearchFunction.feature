Feature: Wikipedia Search Functionality

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When user type "Steve Jobs" in the searchbox
    And user click search button
    Then user see "Steve Jobs is in the wiki" at the title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When user type "Steve Jobs" in the searchbox
    And user click search button
    Then user see "Steve Jobs" at the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When user type "Steve Jobs" in the searchbox
    And user click search button
    Then user see "Steve Jobs" at the image header