Feature: Create Race

  Scenario: Create new race
    When  I try to create a new race
    Then  I must see the new race

  Scenario: Normal Speed
    Given: I choose <speed> speed
    And: Damage is <damage>
    When: Dice roll is <roll>
    Then: I take <steps> steps
    But: Damage is now <damage>

    Examples:
      | speed   | damage  | roll  | steps | newDamaga |
      | Normal  | 0       | 1     | 1     | 0         |
      | Normal  | 0       | 2     | 2     | 0         |
      | Normal  | 0       | 3     | 1     | 0         |
      | Normal  | 0       | 4     | 2     | 0         |
      | Normal  | 1       | 3     | 0     | 1         |
      | Normal  | 2       | 4     | 0     | 2         |
      | Normal  | 3       | 6     | 0     | 3         |
      | Super   | 0       | 6     | 6     | 1         |
      | Super   | 1       | 6     | 5     | 2         |
      | Super   | 3       | 3     | 0     | 4         |
      | Super   | 3       | 2     | 0     | 4         |