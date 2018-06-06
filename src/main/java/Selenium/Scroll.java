package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("my-id"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        // or

//        WebElement element = driver.findElement(By.id("id_of_element"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(500);

        //JavascriptExecutor jsx = (JavascriptExecutor)driver;
        // jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down, value 4500 you can change as per your required
        // jsx.executeScript("window.scrollBy(450,0)", ""); //scroll up

    }
}
