package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void frameTest() {
        driver.switchTo().frame(FRAME_LOCATOR);                   //<textarea id="mce_0" - text area our frame
        driver.findElement(ACTIVE_ELEMENT).sendKeys(CUSTOM_TEXT); // поле для ввода текста - body id="tinymce"
        driver.switchTo().defaultContent();// переключились а др фрэйм
        WebElement container = driver.findElement(EDITOR_CONTAINER);
        //some additional code


        // How to handle frame in WebDriver?


        // -- Select iframe by id - как у нас в примере !!!
        //driver.switchTo().frame(“ID of the frame“);

        // -- Locating iframe using tagName
        //driver.switchTo().frame(driver.findElements(By.tagName(“iframe”).get(0));
        //
        // -- Locating iframe using index

        //frame(index)
        //driver.switchTo().frame(0);

        //frame(Name of Frame)
        //driver.switchTo().frame(“name of the frame”);

        // -- Select Parent Window
        //frame(WebElement element)
        //driver.switchTo().defaultContent();
    }
}