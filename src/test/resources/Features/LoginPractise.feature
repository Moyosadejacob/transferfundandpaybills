Feature: Login functionality of a Zero banking Application

  Scenario: Successful Login

    Given I am on the homepage
    And I click on sign in button
    When I Input correct username
    And I enter valid password
    When I click on sign button
    And I click on Transfer Funds button
    Then I should be in Transfer Funds page




