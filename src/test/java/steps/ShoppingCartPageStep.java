package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ShoppingCartPageStep extends BaseTest {

    @Then("I verify product title from cart page:{string}")
    public void iVerifyProductTitleFromCartPage(String title) {
        String getCartTitle = shoppingCartPageObj.getLego71391Title();
        Assert.assertEquals(getCartTitle, title);
}

}