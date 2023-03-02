Feature: To Pay bills successfully

  Scenario: To Make pay bills

    Given I click sign in
    And I give right user name
    And I input right password
    When I click on log in
    And I click on Pay bills button
    Then i should pay bills successfully