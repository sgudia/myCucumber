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
    @FindBy(xpath="//*[@id=\"title\"]")
    private WebElement lego71391Title;


    @FindBy(xpath="//*[@id=\"quantity\"]")
    private WebElement quantityDropDown;

    @FindBy(xpath="//*[@id=\"quantity\"]/option[2]")
    private WebElement quantityDropDownOption2;

    @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
    private WebElement addToBasket;

    //get title method
    public String getProductTitle(){
        return lego71391Title.getText();
    }
    public void clickQuantityDropDown(){
        quantityDropDown.click();
    }
    public void clickOption2(){
        quantityDropDownOption2.click();
    }
    public void clickAddToBasket(){
        addToBasket.click();
    }


    }

