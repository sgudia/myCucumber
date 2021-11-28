Feature: Home page

  Background: I am background for amazon web application
    Given I am on home page
    Then I verify if logo is displayed
@cart
  Scenario: TC_01_Add to cart
    When I search for item:"lego71391"
    Then I verify lego71391 is displayed
    And I click on lego71391 product

    Then I verify current page url is:"https://www.amazon.co.uk/LEGO-71391"
    Then I verify product title from product description page:"LEGO 71391 Super Mario Bowser's Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures"
     And I click on add to basket btn

    Then I verify quantity on basket icon is:"1"
    And I click on basket icon
    Then I verify product title from cart page:"LEGO 71391 Super Mario Bowser's Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures"

