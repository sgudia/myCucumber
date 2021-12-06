package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class TopActionBlackPage {
    WebDriver driver;
    Utility util;


    public TopActionBlackPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='nav-cart']")
    private WebElement basketIcon;

    @FindBy(xpath = "//*[@id=\"nav-cart-count\"]")
    private WebElement quantity;

    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]")
    WebElement flagIcon;

    @FindBy(xpath = "//div[@class=\"icp-mkt-change-lnk\"]")
    private WebElement changeCountryLink;


    public void clickBasketIcon(){
        basketIcon.click();
    }

    public String getQuantityNumber()throws Exception {
        Thread.sleep(1000);
        System.out.println(quantity.getText());
        return quantity.getText().toString();
    }
    public void moveToFlagIcon() {
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(flagIcon).build().perform();
    }
    public boolean isChangeCountryLinkDisplayed()throws Exception{
        Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"icp-mkt-change-lnk\"]")));
      return changeCountryLink.isDisplayed();
    }
    public void clickChangeCountryLink(){
        changeCountryLink.click();
    }

}
