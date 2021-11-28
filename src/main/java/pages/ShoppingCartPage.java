package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath="//*[@id=\"huc-v2-order-row-item-B08WWZC13K\"]")
    private WebElement cartTitlelego71391;

    public String getLego71391Title(){
        return cartTitlelego71391.getText();

    }

}
