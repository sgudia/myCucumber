package pages;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDescriptionPage {
    WebDriver driver;

    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"productTitle\"]")
    private WebElement lego75955Title;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    private WebElement addToBasket;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    private WebElement quantityDropDown;

    @FindBy(xpath = "//*[@id=\"quantity\"]/option[2]")
    private WebElement quantityNumber;

    //get title method

    public boolean isLego75955Title() {
        return lego75955Title.isDisplayed();
    }

    public String getLego75955Title() {
        return lego75955Title.getText();
    }

    public void clickAddToBasket() {
        addToBasket.click();
    }

    public void clickQuantityDropdown() {
        quantityDropDown.click();
    }

    public void clickQuantityNumber() {
        quantityNumber.click();
    }
}








