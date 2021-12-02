package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TopActionBlackPage {
    WebDriver driver;
    public TopActionBlackPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='nav-cart']")
    private WebElement basketIcon;

    @FindBy(xpath = "//*[@id=\"nav-cart-count\"]")
    private WebElement quantity;


    public void clickBasketIcon(){
        basketIcon.click();
    }

    public String getQuantityNumber()throws Exception{
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"nav-cart-count\"]",T));
//

        Thread.sleep(1000);
        System.out.println(quantity.getText());
        return quantity.getText().toString();
    }

}
