package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot2 {
    WebDriver driver;

    @BeforeMethod
    private void setUp() {

        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void screenShot() throws IOException {
        // Code to capture the screenshot
        File scrFile;
        scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Code to copy the screenshot in the desired location
        FileUtils.copyFile(scrFile, new File("E:\\google.jpg"));  // буква диска может быть другая
    }
}