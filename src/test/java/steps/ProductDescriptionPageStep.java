package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ProductDescriptionPageStep extends BaseTest {

    @Then("I verify product title from product description page:{string}")
    public void verifyTitle(String title_1){
        System.out.println(title_1);
        String title_2 = productDescriptionPageObj.getProductTitle();
        System.out.println(title_2);
        Assert.assertEquals(title_2, title_1);
    }

    @And("I click on add to cart btn")
    public void iClickOnAddToCartBtn() {
    }


}