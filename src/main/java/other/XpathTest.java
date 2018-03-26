package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathTest {

    private static final String URL = "https://rmsys.issoft.by/";
    private static final By USERNAME_CONTAINER = By.id("user-box");
    private static final By INPUT = By.xpath("//input");
    private static final By INPUT_FROM_CURRENT_NODE = By.xpath(".//input");
    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setAcceptInsecureCerts(true);
        driver = new FirefoxDriver(caps);
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void simpleTest() {
        WebElement userContainer = driver.findElement(USERNAME_CONTAINER);
        System.out.println(userContainer.findElements(INPUT).size());
        System.out.println(userContainer.findElements(INPUT_FROM_CURRENT_NODE).size());
    }
}