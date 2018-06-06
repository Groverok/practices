package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        //Handling Alert in Selenium Webdriver
        // USING ALERT INTERFACE !!!      ACTION interface using for action mouse hover ! (actions.moveToElement(driver.findElement(By.id("")).perform;
        // https://www.guru99.com/alert-popup-handling-selenium.html
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert (тот же pop - up !)
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
        driver.close();
    }
}


// EXAMPLES
// accepting javascript alert
//                Alert alert = driver.switchTo().alert(); (перключись на окно)
//                alert.accept(); (тут пишем команду что надо сделать с окном)

// There are the four methods that we would be using along with the Alert interface.
//
// - void dismiss() – The dismiss() method clicks on the “Cancel” button as soon as the pop-up window appears.
// - void accept() – The accept() method clicks on the “Ok” button as soon as the pop-up window appears.
// - String getText() – The getText() method returns the text displayed on the alert box.
// - void sendKeys(String stringToSend) – The sendKeys() method enters the specified string pattern into the alert box.