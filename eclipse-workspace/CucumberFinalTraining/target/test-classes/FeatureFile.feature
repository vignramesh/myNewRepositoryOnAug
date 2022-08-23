@tag
Feature: To check login in to facebook page

  @tag1
  Scenario: Login validation with invalid username & password
    Given Browser to be launched
    And User landed in Facebook login page
    When User Enters invalid username and password
    And User Clicks Login button
    Then Error page is displayed
    And User closes the browser
 @tag2
  Scenario Outline: Login validation with valid username & password
    Given Browser to be launched
    And User landed in Facebook login page
    When User Enters valid "<username>" and "<password>"
    And User Clicks Login button
    Then Error page is displayed
    And User closes the browser

    Examples:
    |username|password|
    |bvignesh633@gmail.com|V!cky009|