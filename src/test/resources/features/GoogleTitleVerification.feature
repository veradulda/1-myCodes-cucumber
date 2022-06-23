Feature: Google Search Functionality Title Verification

  Scenario: Google Title Verification
    Given User is on Google search page
    When User search apple on the google
    Then User see apple in the title

  Scenario: Google Title Verification
    Given User is on Google search page
    When User search "armut" on the google
    Then User see "armut" in the title

  Scenario: Google Title Verification
    Given User is on Google search page
    When User search "elma" on the google
    Then User see "armut" in the title

