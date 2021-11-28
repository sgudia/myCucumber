package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath="//span[@class='a-truncate-full a-offscreen'][contains(text(),'LEGO')]")
    private WebElement cartTitlelego71391;

    public String getLego71391Title(){
        return cartTitlelego71391.getText();

    }

}
