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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\u0027sp-cc-accept\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027swathigudiasMBP\u0027, ip: \u00272a02:c7f:bb2d:f300:7033:9df7:c86f:8f52%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002711.6.1\u0027, java.version: \u002717.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.isDisplayed(Unknown Source)\n\tat pages.HomePage.isCookie(HomePage.java:38)\n\tat steps.HomePageStep.acceptCookie(HomePageStep.java:27)\n\tat ✽.I accept cookies(file:src/test/features/AddLegoItemCartSuccessfull.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "skipped"
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
  "name": "I search for item:\"lego71391\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.enterSearchCriteria(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify lego71391 is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iVerifyLegoIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on lego71391 product",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.iClickOnLegoProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify current page url is:\"https://www.amazon.co.uk/LEGO-71391\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iverifyUrl(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify product title from product description page:\"LEGO 71391 Super Mario Bowser\u0027s Airship Expansion Set, Collectible Buildable Game Toy for Kids with 3 Figures\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDescriptionPageStep.verifyTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on add to basket btn",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDescriptionPageStep.iClickOnAddToBasketBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify quantity on basket icon is:\"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopActionBlackPageStep.iVerifyQuantityOnBasketIconIs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on basket icon",
  "keyword": "And "
});
formatter.match({
  "location": "TopActionBlackPageStep.iClickOnBasketIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify product title is displayed from cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartPageStep.iVerifyProductTitleFromCartPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});