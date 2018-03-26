package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowTest {

    private static final String URL = "https://the-internet.herokuapp.com/windows";
    private static final String NEW_WINDOW_EXPECTED_TEXT = "New Window";
    private static final By OPEN_WINDOW_BUTTON = By.cssSelector(".example a");
    private static final By TEXT_CONTAINER = By.cssSelector(".example h3");

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();  // quit close 2 tabs !
    }

    @Test
    public void multipleWindowsTest() {
        driver.findElement(OPEN_WINDOW_BUTTON).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> windowHandles = driver.getWindowHandles(); //коллекция с уникальными значениями
        driver.switchTo().window((String) windowHandles.toArray()[1]);
        String actualText = driver.findElement(TEXT_CONTAINER).getText();

        Assert.assertEquals(actualText, NEW_WINDOW_EXPECTED_TEXT);
    }
}
