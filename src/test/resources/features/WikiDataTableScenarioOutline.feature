Feature: use Scenario Outline


  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When user type "Steve Jobs" in the searchbox
    And user click search button
    Then user see "<searchValue>" at the title
    Then user see "<expectedTitle>" at the main header
    Then user see "<expectedMainHeader>" at the image header



    @soccerPlayers
    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |