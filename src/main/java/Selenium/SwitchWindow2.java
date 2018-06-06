package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchWindow2 {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        driver.findElement(By.name("Alert Box")).click();
        // Switch to JavaScript Alert window
        Alert myAlert = driver.switchTo().alert();
        // Accept the Alert
        myAlert.accept();
        // Close Original window
        driver.close();
    }
}
