package helper;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class Utility {
    public WebDriver driver;
    static Properties prop = new Properties();
    public static Logger logger;
    public final int timeOut = 45;

    public Utility(WebDriver driver){

    }

    public String readPropertyFile(String propertyName)throws IOException {
        String propertyValue = null;
        try {
            InputStream input = new FileInputStream("data.properties");
            prop.load(input);
            propertyValue= prop.getProperty(propertyName);
        } catch (Exception e) {
            e.printStackTrace();
        }return propertyValue;

    }
    public void waitForVisibility(By targetElement) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOfElementLocated(targetElement));
        }
        catch(TimeoutException e ){
            System.out.println("Element is not visible: " + targetElement );
            System.out.println();
            System.out.println(e.getMessage());
            throw new TimeoutException();

        }
    }





}
