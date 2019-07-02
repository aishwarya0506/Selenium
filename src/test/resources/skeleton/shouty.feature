Feature: Shout
  
  Scenario: Two shouts
    When Sean shouts "Free bagels!"
    And Sean shouts "Free toast!"
    Then Lucy hears the following messages:
      | Free bagels! |
      | Free toast!  |