package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.SignInPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomePageStep extends BaseTest {


    @Given("I launch amazon url")
    public void i_am_on_home_page() throws IOException {
        driver.get(util.readPropertyFile("URL"));
    }

    @And("I accept cookies")
    public void acceptCookie() {
        if (homePageObj.isCookie()) {
            homePageObj.clickCookieAccept();
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

    @Then("I verify lego75955 is displayed")
    public void iVerifyLegoIsDisplayed() {
        Assert.assertTrue(homePageObj.islego75955item());
    }

    @And("I click on lego75955 product")
    public void iClickOnLegoProduct() {
        homePageObj.clickLego75955();
    }

    @Then("I verify current page url contains:{string}")
    public void iVerifyUrl(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current page url is:"+currentUrl);
        Assert.assertTrue(currentUrl.contains(expectedUrl));

    }

    @And("I switch to window")
    public void iSwitchToWindow() {
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

//        driver.Close();
//        driver.SwitchTo().Window(browserTabs[0]);

    }
}
