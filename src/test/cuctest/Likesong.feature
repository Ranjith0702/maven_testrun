Feature: Like
@first @second @third
  Scenario Outline: Liking a song
    Given : I open spotify
    And : I play a song
    When I click on like button on "<song>"
    Then Song should be in liked playlist
    Examples:
      | song     |
      | Neela vaanam |
      | Thuli thuli  |