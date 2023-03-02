@ignore
Feature: To make Transfer

  Scenario: Transfer funds should be successful

    Given I click on sign in
    And I enter correct username
    And I enter correct password
    When I should sign in
    And I click on Transfer funds link
    Then I should transfer money successfully