package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ShoppingCartPageStep extends BaseTest {

    @When("I select quantity")
    public void iSelectQuantity() {
    }

    @And("I click on add to basket")
    public void iClickOnAddToBasket() {
    }

    @Then("I verify product title from cart page:{string}")
    public void iVerifyProductTitleFromCartPage(String title_1) {
        System.out.println(title_1);
        String title_2 = shoppingCartPageObj.getLego71391Title();
        System.out.println(title_2);
        Assert.assertEquals(title_2, title_1);
}
}