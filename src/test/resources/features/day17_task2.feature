@wip
Feature: Order place scenario

  Background: user is already logged in to web table app
    And user is on the page of web table page
    Given user is on the ORDER page

  Scenario Outline: User should select these information
    When user select product "<product>"
    And user select quantity "<quantity>"
    And user select customerName "<customerName>"
    And user select street "<street>"
    And user select city "<city>"
    And user select state "<state>"
    And user select zip "<zip>"
    And user select cardType "<cardType>"
    And user select cardNo "<cardNo>"
    And user select cardExpireDate "<cardExpireDate>"
    And user click process order button
    Then user can see "<expectedName>" in the all orders

    Examples: search values we are going to be using in this scenario is as below
      | product    | quantity | customerName       | street    | city   | state   | zip   | cardType | cardNo           | cardExpireDate | expectedName       |
      | MoneyCog   | 2        | Marie Curie        | London st | London | England | 50505 | Visa     | 1111222233334444 | 12/24          | Marie Curie        |
      | Familybea  | 3        | Rosalind Franklin  | London st | London | England | 50505 | Visa     | 1111222233334444 | 12/24          | Rosalind Franklin  |
      | Screenable | 4        | List Meitner       | London st | London | England | 50505 | Visa     | 1111222233334444 | 12/24          | List Meitner       |
      | MoneyCog   | 5        | Chien-Shiung Wu    | London st | London | England | 50505 | Visa     | 1111222233334444 | 12/24          | Chien-Shiung Wu    |
      | MoneyCog   | 6        | Barbara McClintock | London st | London | England | 50505 | Visa     | 1111222233334444 | 12/24          | Barbara McClintock |