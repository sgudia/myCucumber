package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.SignInPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageStep extends BaseTest {


    @Given("I am on home page")
    public void i_am_on_home_page() throws IOException {
        driver.get(util.readPropertyFile("URL"));
    }

    @Then("I verify if logo is displayed")
    public void isLogoDisplayed() {
        Assert.assertTrue(homePageObj.isHomePageLogo());
    }

    @When("I search for item:{string}")
    public void enterSearchCriteria(String txt) {
        homePageObj.enterSearch(txt);
    }
    @Then("I verify current page url is:{string}")
    public void iverifyUrl(String url){
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

    @Then("I verify lego71391 is displayed")
    public void iVerifyLegoIsDisplayed() {
        Assert.assertTrue(homePageObj.islego71391item());
    }
    @And("I click on lego71391 product")
    public void iClickOnLegoProduct() {
        homePageObj.clickLego71319();

    }
}
