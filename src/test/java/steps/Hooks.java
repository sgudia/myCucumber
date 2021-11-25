package steps;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BaseTest {
    @Before
    public void openBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver",util.readPropertyFile("CHROME_PATH"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @After
    public void TearDown(){
        driver.quit();
    }
}


