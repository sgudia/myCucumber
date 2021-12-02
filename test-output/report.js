$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/AddLegoItemCartSuccessfull.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "I am background for amazon web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.acceptCookie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_Add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cart"
    }
  ]
});
formatter.step({
  "name": "I search for item:\"lego75955\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.enterSearchCriteria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify lego75955 is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iVerifyLegoIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on lego75955 product",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.iClickOnLegoProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify current page url is:\"https://www.amazon.co.uk/LEGO-75955\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iverifyUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify product title from product description page:\"LEGO 75955 Super Mario Bowser\u0027s Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDescriptionPageStep.verifyTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add to basket btn",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDescriptionPageStep.iClickOnAddToBasketBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify quantity on basket icon is:\"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopActionBlackPageStep.iVerifyQuantityOnBasketIconIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on basket icon",
  "keyword": "And "
});
formatter.match({
  "location": "TopActionBlackPageStep.iClickOnBasketIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify product title is displayed from cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartPageStep.iVerifyProductTitleFromCartPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});