package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SelectCountryPageStep extends BaseTest {


    @Then("I verify select country text is displayed")
    public void iVerifySelectCountryIsDisplayed(){
        Assert.assertTrue(selectCountryPageObj.isSelectCountryDropdownDisplayedBtn());
    }
//  selected country value is verified
    @Then("I verify if selected country is:{string}")
    public void iVerifyGetSelectedCountryText(String countryName){
        Assert.assertEquals(selectCountryPageObj.getSelectedCountry(),countryName);
    }
    @And("I click on country dropdown")
    public void iClickOnSelectedCountryDropdown() {
       selectCountryPageObj.clickSelectedCountryDropdown();
    }
    @When("I select country as Netherlands")
    public void iSelectNetherlandsFromDropdownList() {
        selectCountryPageObj.clickNetherlandsCountry();
    }

    @And("I click on Go to Website btn")
    public void iClickOnGoToWebsiteBtn(){
        selectCountryPageObj.clickGoToWebsiteBtn();
    }

}
