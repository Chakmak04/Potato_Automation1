@eating
Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much anything may not be good for you

  @eating1
  Scenario: Eating a few is no problem
    Given "Ahmet" is hungry
    When he eats some cucumbers
    Then he will be full

  @eating2
  Scenario: Eating a few is no problem
    Given "Ahmet" is hungry
    When he eats 3 cucumbers
    Then he will be full