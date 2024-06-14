#@employee
#Feature: Employee
  #In order to manage employee records 
  #As a user
  #I want to access the dashboard to add, edit, delete records
#
  #Scenario: Add Valid Employee
    #Given I have a browser with OrangeHRM application
    #When I enter username as 'Admin'
    #And I enter password as 'admin123'
    #And I click on login
    #And I click on PIM menu
    #And I click on Add Employee section
    #And I fill the employee form
      #| firstname | middlename | lastname |
      #| john      | w          | wick     |
    #And I click on save
    #Then I should able to verify the saved employee with profile name 'john wick'
#
  #Scenario: Add Valid Employee2
    #Given I have a browser with OrangeHRM application
    #When I enter username as 'Admin'
    #And I enter password as 'admin123'
    #And I click on login
    #And I click on PIM menu
    #And I click on Add Employee section
    #And I fill the employee form
      #| firstname | middlename | lastname |
      #| peter     | w          | wick     |
    #And I click on save
    #Then I should able to verify the saved employee with profile name 'peter wick'
