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

    @FindBy(xpath="//*[@id='sp-cc-accept']")
    WebElement cookieAccept;

    @FindBy(xpath= "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchInputBox;

    @FindBy(xpath="//div[@data-asin=\"B08WWZC13K\"]//h2//span")
    WebElement lego71391item;

    ///// Methods //////
    public boolean isHomePageLogo() {
        return homepageLogo.isDisplayed();
    }

    public boolean isCookie(){
        return cookieAccept.isDisplayed();
    }

    public void clickCookieAccept() {
        cookieAccept.click();
    }

     public void clickLego71319(){
        lego71391item.click();
     }

    public void enterSearch(String searchText) {
        searchInputBox.click();
        searchInputBox.sendKeys(searchText);
        searchInputBox.sendKeys(Keys.ENTER);
    }
    public String getLegoText(){
        String text = lego71391item.getText();
        System.out.println(text);
        return text;
    }
    public boolean islego71391item(){
        return lego71391item.isDisplayed();
    }


}



