Feature: Game Play

  Scenario: Roll 3 Super speed, zero damage, move 3, result damage 1
    Given: I am in game page
    And:  I am the current player
    And: My initial damage is 0
    When: I roll the die
    And: Roll 3 as result
    Then: I must move 3 steps
    And: Take one damage
