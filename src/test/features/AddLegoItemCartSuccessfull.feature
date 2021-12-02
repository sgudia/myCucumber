@Regression
Feature: Home page
  Background: I am background for amazon web application
    Given I launch amazon url
    And I accept cookies
    Then I verify if logo is displayed
    When I search for item:"lego75955"
    Then I verify lego75955 is displayed
    And I click on lego75955 product
    Then I verify current page url is:"https://www.amazon.co.uk/LEGO-75955"
    Then I verify product title from product description page:"LEGO 75955 Harry Potter Hogwarts Express Train Toy, Wizarding World Fan Gift, Building Sets for Kids"

  @Smoke
  Scenario: TC_01_Add to cart
     And I click on add to basket btn
     And I click on basket icon
    Then I verify product title is displayed from cart page

    Scenario: Tc_02_verify quantity from basket icon
      And I select quantity two
      And I click on add to basket btn
      Then I verify quantity on basket icon is:"2"