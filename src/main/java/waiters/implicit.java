package waiters;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class implicit {

    public WebDriver driver;

    @Test
    public void implicitExample() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // опрашивает всю страницу
        //  if WebDriver cannot find an element in the Document Object Model (DOM),
        //  it will wait for a defined amount of time for the element to appear in the DOM.
    }
}