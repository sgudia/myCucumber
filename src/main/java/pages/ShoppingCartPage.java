package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@data-asin='B07BLG43H2']")
    WebElement titleLego75955;

    public boolean isTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-asin='B07BLG43H2']")));
        return titleLego75955.isDisplayed();
    }

}
