package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {

    private static final String URL = "https://the-internet.herokuapp.com/iframe";
    private static final String FRAME_LOCATOR = "mce_0_ifr";
    private static final String CUSTOM_TEXT = "Hello world";
    private static final By ACTIVE_ELEMENT = By.id("tinymce");
    private static final By EDITOR_CONTAINER = By.className("example");

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
    public void frameTest() {
        driver.switchTo().frame(FRAME_LOCATOR);
        driver.findElement(ACTIVE_ELEMENT).sendKeys(CUSTOM_TEXT);
        driver.switchTo().defaultContent();// переключились а др фрэйм
        WebElement container = driver.findElement(EDITOR_CONTAINER);
        //some additional code
    }
}
