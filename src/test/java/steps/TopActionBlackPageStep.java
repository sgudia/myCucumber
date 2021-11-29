package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TopActionBlackPageStep extends BaseTest {

 @Then("I verify quantity on basket icon is:{string}")
 public void iVerifyQuantityOnBasketIconIs(String quantitynumber) {
  Assert.assertEquals(topActionBlackPageObj.getQuantityNumber(), quantitynumber);
 }

 @And("I click on basket icon")
 public void iClickOnBasketIcon() {
  topActionBlackPageObj.clickBasketIcon();

 }

}