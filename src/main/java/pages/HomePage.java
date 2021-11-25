package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
/////////Elements ////////
    @FindBy(xpath = "//a[@href=\"/ref=nav_logo\"]")
    WebElement homepageLogo;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement SignInText;

    @FindBy(xpath="//*[@id='a-autoid-0']")
    WebElement cookieAccept;

    @FindBy(xpath= "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchInputBox;

    @FindBy(xpath="//div[@data-asin=\"B08WWZC13K\"]//h2//span")
    WebElement lego71391product;

    ///// Methods //////
    public boolean isHomePageLogo() {
        return homepageLogo.isDisplayed();
    }

    public String getText() {
        String text = SignInText.getText();
        System.out.println(text);
        return text;
    }

    public boolean isCookie(){
        return cookieAccept.isDisplayed();
    }

    public void clickCookieAccept() {
        cookieAccept.click();

    }
    public void enterSearch(String searchText) {
        searchInputBox.click();
        searchInputBox.sendKeys(searchText);
        searchInputBox.sendKeys(Keys.ENTER);
    }
    public boolean isLego71391product()
    {
        return lego71391product.isDisplayed();
    }

    public void clickLego71391() {
       lego71391product.click();

    }

    }



