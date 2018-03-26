package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressTest {

    private static final String URL = "https://the-internet.herokuapp.com/key_presses";
    private static final String CUSTOM_MESSAGE = "C";
    private static final By RESULT_CONTAINER = By.id("result");

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void keyPressTest() {
        Actions actions = new Actions(driver);
        actions.sendKeys(CUSTOM_MESSAGE).perform();

        String actualText = driver.findElement(RESULT_CONTAINER).getText();
        Assert.assertEquals(actualText, "You entered: " + CUSTOM_MESSAGE);
    }
}
