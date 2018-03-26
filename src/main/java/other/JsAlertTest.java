package other;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsAlertTest {

    private static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";
    private static final String MESSAGE = "HELLO WORLD!";
    private static final String EXPECTED_MESSAGE = "You entered: HELLO WORLD!";
    private static final By PROMPT_BUTTON = By.xpath("//button[text()='Click for JS Prompt']");
    private static final By RESULT_MESSAGE = By.id("result");

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
    public void alertTest() {
        driver.findElement(PROMPT_BUTTON).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(MESSAGE);
        alert.accept();

        String actualText = driver.findElement(RESULT_MESSAGE).getText();
        Assert.assertEquals(actualText, EXPECTED_MESSAGE);
    }
}
