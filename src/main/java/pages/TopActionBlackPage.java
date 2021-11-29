package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopActionBlackPage {

    @FindBy(xpath = "//*[@id=\"nav-cart-count\"]")
    private WebElement quantity;

    @FindBy(xpath = "//*[@id='nav-cart']")
    private WebElement basketIcon;

    public String getQuantityNumber(){
        String text = quantity.getText();
        System.out.println(text);
        return text;
    }
    public void clickBasketIcon(){
        basketIcon.click();
    }

}
