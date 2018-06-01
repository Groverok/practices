package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private static By userEmailLoginInput = By.id("email");
    private static By userPasswordLoginInput = By.id("pass");
    private static By loginSubmitBtn = By.id("u_0_n");

    public WebDriver driver;

    public LoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
    }

    public LoginPage enterUserLogin(String login) {
        WebElement emailBox = driver.findElement(userEmailLoginInput);
        emailBox.click();
        emailBox.sendKeys(login);
        return this;         // return this page
    }

    public LoginPage enterUserPassword(String password) {
        WebElement passwordBox = driver.findElement(userPasswordLoginInput);
        passwordBox.click();
        passwordBox.sendKeys(password);
        return this;
    }

    public HomePage submitLoginCredentials() {
        WebElement submitBtn = driver.findElement(loginSubmitBtn);
        submitBtn.click();
        return new HomePage(driver);
    }

    public HomePage closeBrowser() {
        driver.quit();
        return new HomePage(driver);
    }
}