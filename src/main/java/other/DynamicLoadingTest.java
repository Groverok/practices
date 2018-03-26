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

import java.util.concurrent.TimeUnit;

public class DynamicLoadingTest {

    private static final String URL = "https://the-internet.herokuapp.com/dynamic_loading";
    private static final By EXAMPLE_1 = By.cssSelector("[href=\"/dynamic_loading/1\"]");
    private static final By EXAMPLE_2 = By.cssSelector("[href=\"/dynamic_loading/2\"]");
    private static final By START_BUTTON = By.cssSelector("#start button");
    private static final By FINISH_MESSAGE = By.id("finish");

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void hiddenElementTest() {
        driver.findElement(EXAMPLE_1).click();
        driver.findElement(START_BUTTON).click();
//        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(FINISH_MESSAGE));

        Assert.assertTrue(driver.findElement(FINISH_MESSAGE).isDisplayed(), "Finish message is not displayed!");
    }

    @Test
    public void nonexistentElementTest() {
        driver.findElement(EXAMPLE_2).click();
        driver.findElement(START_BUTTON).click();
//        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(FINISH_MESSAGE));

        Assert.assertTrue(driver.findElement(FINISH_MESSAGE).isDisplayed(), "Finish message is not displayed!");
    }
}
