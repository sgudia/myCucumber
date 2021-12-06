package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCountryPage {
    WebDriver driver;

    public SelectCountryPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]/span")
    private WebElement selectedCountryDropdown;

    @FindBy(xpath = "//ul/li[@aria-labelledby=\"icp-selected-country_11\"]")
    private WebElement netherlandsCountry;

//    @FindBy(xpath = "//*[@id=\"a-autoid-2-announce\"]")
//    private WebElement goToWebsiteBtn;

    public boolean isSelectCountryDropdownDisplayedBtn() {
        return selectedCountryDropdown.isDisplayed();
    }
    public void clickSelectedCountryDropdown() {
        selectedCountryDropdown.click();
    }
    public void clickNetherlandsCountry() {
        netherlandsCountry.click();
    }
    public void clickGoToWebsiteBtn(){
//        Thread.sleep(500);

        WebElement goToWebsiteButton  = driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"][contains(text(),'Go to website')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",goToWebsiteButton );
//        Thread.sleep(10000);


//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"a-autoid-2-announce\"]")));

    }
    public String getSelectedCountry(){
        String text = selectedCountryDropdown.getText();
        System.out.println(text);
        return text;
    }

}


