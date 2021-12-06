Feature: UnanonymousUserChangeCountry
  Background: I am background for amazon web application
    Given I launch amazon url
      And I accept cookies
     Then I verify if logo is displayed

  Scenario: TC_01_UnanonymousUser_ChangeCountry
    Then I verify current page url contains:"https://www.amazon.co.uk"
    When I move mouse to flag icon
    Then I verify change Country link is displayed
     And I click on Change Country link
# select country page
    Then I verify select country text is displayed
    Then I verify if selected country is:"United Kingdom"
     And I click on country dropdown
    When I select country as Netherlands
    Then I verify if selected country is:"Netherlands (Nederland)"
     And I click on Go to Website btn
    And I switch to window
    Then I verify current page url contains:"https://www.amazon.nl"

