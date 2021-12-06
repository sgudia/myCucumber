package base;

import helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;


public class BaseTest {
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;
    protected ProductDescriptionPage productDescriptionPageObj;
    protected ShoppingCartPage shoppingCartPageObj;
    protected TopActionBlackPage topActionBlackPageObj;
    protected SelectCountryPage selectCountryPageObj;


    public static WebDriver driver;
    protected Utility util;

    public BaseTest() {
        homePageObj = PageFactory.initElements(driver, HomePage.class);
        signInPageObj = PageFactory.initElements(driver, SignInPage.class);
        productDescriptionPageObj = PageFactory.initElements(driver, ProductDescriptionPage.class);
        shoppingCartPageObj = PageFactory.initElements(driver, ShoppingCartPage.class);
        topActionBlackPageObj = PageFactory.initElements(driver, TopActionBlackPage.class);
        selectCountryPageObj = PageFactory.initElements(driver, SelectCountryPage.class);
        util = PageFactory.initElements(driver, Utility.class);


    }
}