package steps;

import base.BaseTest;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ShoppingCartPageStep extends BaseTest {

    @Then("I verify product title is displayed from cart page")
    public void iVerifyProductTitleFromCartPage() {
        Assert.assertTrue(shoppingCartPageObj.isTitleDisplayed());
}

}