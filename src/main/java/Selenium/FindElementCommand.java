package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCommand {

    public static void main(String[] args) {
        // Create a new instance of the FireFox driver
        WebDriver driver = new ChromeDriver();

        // Launch the ToolsQA WebSite
        driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");

        // Type Name in the FirstName text box
        driver.findElement(By.name("firstname")).sendKeys("Lakshay");

        //Type LastName in the LastName text box
        driver.findElement(By.name("lastname")).sendKeys("Sharma");

        // Click on the Submit button
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }
}