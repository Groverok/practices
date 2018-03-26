package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest {

    private static final String URL = "https://the-internet.herokuapp.com/dropdown";
    private static final String EXPECTED_SELECTED_OPTION = "Option 1";
    private static final String VALUE = "1";
    private static final By DROPDOWN = By.id("dropdown");

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
    public void dropdownTest() {
        WebElement dropdownElement = driver.findElement(DROPDOWN);
        Select dropdown = new Select(dropdownElement);

        dropdown.selectByValue(VALUE);
        String actualSelectedOption = dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelectedOption, EXPECTED_SELECTED_OPTION);
    }
}
