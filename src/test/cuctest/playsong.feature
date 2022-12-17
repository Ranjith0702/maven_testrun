Feature: Play

  @test
  Scenario: Playing a song
    Given I open spotify
    And I search for a "Vathi coming"
    When I play the song
    Then I should hear a song

  @sts @Test
  Scenario Outline: Playing a song2
    Given I open spotify
    And I search for a "<songname>"
    When I play the song
    Then I should hear a "<songname>"
    Examples:
      | songname            |
      | Everything I wanted |
      | Bad guy             |


