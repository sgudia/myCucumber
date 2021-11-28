package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ProductDescriptionPageStep extends BaseTest {



    @Then("I verify product title from product description page:{string}")
    public void verifyTitle(String title) {
        String ProductTitle = productDescriptionPageObj.getLego71391Title();
        Assert.assertEquals(ProductTitle, title);
    }

   @And("I click on add to basket btn")
    public void iClickOnAddToBasketBtn() {
        productDescriptionPageObj.clickAddToBasket();
    }

}
