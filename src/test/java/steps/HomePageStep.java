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

    @And("I accept cookies")
    public void acceptCookie() {
        if (homePageObj.isCookie()) {
            homePageObj.clickCookieAccept();
            Assert.assertTrue(!homePageObj.isCookie());
        }
    }

    @Then("I verify if logo is displayed")
    public void isLogoDisplayed() {
        Assert.assertTrue(homePageObj.isHomePageLogo());
    }

    @When("I search for item:{string}")
    public void enterSearchCriteria(String txt) {
        homePageObj.enterSearch(txt);
    }
    @And("I click on lego71391 product")
    public void clickFirstItem() {
        homePageObj.clickLego71391();
    }
    @Then("I verify lego{int} is displayed")
    public void iVerifyLegoIsDisplayed(int arg0) {
        Assert.assertTrue(homePageObj.isLego71391product());
    }
}
