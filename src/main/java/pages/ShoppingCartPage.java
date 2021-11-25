package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath="//div[@data-asin=\"B0984RGDVH\"]//div[@class=\"sc-item-content-group\"]//span[@class=\"a-truncate-cut\"]")
    private WebElement CartProductTitle;
//
//    @FindBy(xpath="")
//    private WebElement selectQuantity;
//
//    @FindBy(xpath="")
//    private WebElement finaladdToBasket;
//
//    @FindBy(xpath ="")
//    private WebElement basketQuantity;

    public String getLego71391Title(){
        return CartProductTitle.getText();

    }

}
