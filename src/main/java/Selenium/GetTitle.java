package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GetTitle {

    @Test
    public void checkTitle() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.softwaretestinghelp.com/");
        //verify the title of the web page
        assertTrue(driver.getTitle().equals("Software Testing Complete Guide — Software Testing Help"),
                "The title of the window is incorrect.");
        driver.close();
    }
}