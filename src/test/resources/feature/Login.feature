@login
Feature: Login
  In order to manage employee records 
  As a user
  I want to access the dashboard

  Background: 
    Given I have a browser with OrangeHRM application

	@smoke @valid
  Scenario: Valid Login
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to portal with header as 'Quick Launch'

	@invalid
  Scenario Outline: Invalid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access with error as '<expected_error>'

    Examples: 
      | username | password | expected_error      |
      | john     | john123  | Invalid credentials |
      | peter    | peter123 | Invalid credentials |

      