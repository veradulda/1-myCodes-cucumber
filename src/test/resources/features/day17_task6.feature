
Feature: Data table Task - day17 task6-

  Background: User is on the page
    Given User is on the dropdowns page of practice tool

  Scenario: User should be able to see all 12 months in months
  dropdown
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
