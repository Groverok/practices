package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {

    private static final String URL = "https://the-internet.herokuapp.com/checkboxes";

    private enum Checkbox {
        FIRST(1),
        SECOND(2);

        private int index;

        Checkbox(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void checkboxTest() {
        selectCheckbox(Checkbox.FIRST);
        selectCheckbox(Checkbox.SECOND);

        Assert.assertTrue(getCheckbox(Checkbox.FIRST).isSelected(),"Checkbox #1 is not selected!");
        Assert.assertTrue(getCheckbox(Checkbox.SECOND).isSelected(),"Checkbox #2 is not selected!");
    }

    private void selectCheckbox(Checkbox checkbox) {
        WebElement checkboxElement = getCheckbox(checkbox);

        if (!checkboxElement.isSelected()) {
            checkboxElement.click();
        }
    }

    private WebElement getCheckbox(Checkbox checkbox) {
        By checkboxLocator = By.xpath(String.format("//form[@id='checkboxes']/input[%s]", checkbox.getIndex()));
        return driver.findElement(checkboxLocator);
    }
}
