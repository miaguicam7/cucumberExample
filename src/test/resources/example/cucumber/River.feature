Feature: Here we test all functionalities relationated with river operations

  Scenario: A province, we return its river
    Given I want know a province river
    When I ask for a Madrid river
    Then the result should be Manzanares
    
