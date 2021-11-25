
Feature:Unregistered User shopping
  Background: I am background for amazon web application
    Given I am on home page
    Then I verify if logo is displayed


    Scenario: TC_01_Unregistered user application
      Then I verify text is displayed:"hello SignIn"

