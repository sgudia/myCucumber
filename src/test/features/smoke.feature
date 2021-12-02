@Smoke
Feature:SmokeTest
  Scenario: TC_01_User launch amazon website successful
    Given I launch amazon url
    Then I verify if logo is displayed
    Then I verify text is displayed:"Hello, Sign in"

