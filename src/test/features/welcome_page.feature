Feature: Welcome Page
  Welcome page for Emerson's Game by Team Aventador

  Scenario: Welcome Message
    Given I am in the Welcome Page
    When I try to view the Welcome Page
    Then I must see a welcome message

