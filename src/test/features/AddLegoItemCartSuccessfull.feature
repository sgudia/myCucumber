Feature: Home page

  Background: I am background for amazon web application
    Given I am on home page
    Then I verify if logo is displayed

  Scenario: TC_01_Add to cart
    When I search for item:"toys"
    Then I verify lego71391 is displayed
     And I click on lego71391 product
    Then I verify product title from product description page:"LEGO 71391 Super Mario Bowser's Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures"
     And I click on add to cart btn
    Then I verify product title from cart page:"LEGO 71391 Super Mario Bowser's Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures"
#
#  Scenario: TC_02_Verify product Quantity added
#    When I select quantity
#     And I click on add to basket
#    Then I verify the product quantity added from basket icon


