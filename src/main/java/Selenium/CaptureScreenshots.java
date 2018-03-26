package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

//https://www.testingexcellence.com/selenium-webdriver-tutorials/

public class CaptureScreenshots {
    public WebDriver driver;

    @Test
    public void runDummyTest() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://www.testingexcellence.com");

        try {
            driver.findElement(By.id("dummyId")).click();
        } catch (Exception e) {
            System.out.println("Element Not Found");
            takeScreenshot();
        }
        driver.close();
    }

    public void takeScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\failed-test.png"));
    }
}
