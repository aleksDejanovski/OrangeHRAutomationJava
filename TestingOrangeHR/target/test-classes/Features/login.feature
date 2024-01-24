Feature: Login to orange hr

  @loginTestCases
  Scenario: Login to orange hr using valid credentials
    Given I am navigated to the orange hr page
    When I enter valid credentials
    And I click to login button
    Then I am navigated to the orange hr homepage

  Scenario: Login to orange hr using invalid credentials
    Given I am navigated to the orange hr page
    When I enter invalid credentials
    And I click to login button
    Then I can not login and error message appears

  Scenario Outline: Check login with invalid credentials
    Given I am navigated to the orange hr page
    When I enter <username> and <pass>
    And I click to login button
    Then I can not login and error message appears

    Examples: 
      | username | pass   |
      | alek     | pass12 |
      | user2    | pass2  |
      | user3    | ssf@   |

  Scenario: Login to orange hr using valid username but invalid password
    Given I am navigated to the orange hr page
    When I enter 'Admin' and 'Pass' 
    And I click to login button
    Then I can not login and error message appears
