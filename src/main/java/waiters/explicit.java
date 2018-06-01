package waiters;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
    public WebDriver driver;

    @Test
    public void explicitExample() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // будет ждать конкретного элемента.
        wait.until(ExpectedConditions.titleContains("selenium"));
        // the page is loaded but we are still waiting for a call to complete and an element to appear.
        // The ExpectedCondition class provides a set of predefined conditions to wait before proceeding further in the code.
    }
}
