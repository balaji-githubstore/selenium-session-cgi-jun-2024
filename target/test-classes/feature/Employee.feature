@employee
Feature: Employee
  In order to manage employee records 
  As a user
  I want to access the dashboard to add, edit, delete records

  Scenario Outline: Add Valid Employee
    Given I have a browser with OrangeHRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM menu
    And I click on Add Employee section
    And I fill the employee form
      | firstname | middlename | lastname   |
      | <fname>   | <mname>    | <lastname> |
    And I click on save
    Then I should able to verify the saved employee with profile name '<expected_name>'

    Examples: 
      | username | password | fname | mname | lastname | expected_name |
      | Admin    | admin123 | john  | w     | wick     | john wick     |
      | Admin    | admin123 | peter | w     | ken      | john wick     |
