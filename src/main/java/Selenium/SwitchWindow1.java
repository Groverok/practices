package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow1 {
    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        // Store and Print the name of the First window on the console
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        driver.findElement(By.name("New Message Window")).click();
        // Store and Print the name of all the windows open
        Set handles = driver.getWindowHandles();
        System.out.println(handles);
        // Pass a window handle to the other window
        for (String handle1 : driver.getWindowHandles()) {
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }
        // Closing Pop Up window
        driver.close();
        // Close Original window
        driver.quit();
    }
}
