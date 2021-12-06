package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopActionBlackPageStep extends BaseTest {

    @And("I click on basket icon")
    public void iClickOnBasketIcon() {
        topActionBlackPageObj.clickBasketIcon();
    }

    @Then("I verify quantity on basket icon is:{string}")
    public void iVerifyQuantityOnBasketIconIs(String quantityNumber)throws Exception {
        String x = topActionBlackPageObj.getQuantityNumber();
        Assert.assertEquals(x, quantityNumber);
    }
    @When("I move mouse to flag icon")
    public void iMoveMouseToFlagIcon() {
        topActionBlackPageObj.moveToFlagIcon();

    }
    @Then("I verify change Country link is displayed")
    public void iVerifyChangeCountryLinkIsDisplayed()throws Exception {
        Assert.assertTrue(topActionBlackPageObj.isChangeCountryLinkDisplayed());
    }

    @And("I click on Change Country link")
    public void iClickOnChangeCountryLink() {
        topActionBlackPageObj.clickChangeCountryLink();
    }
}
