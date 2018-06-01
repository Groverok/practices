package PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPageObject  {

    public WebDriver driver;

    @Test
    public void shouldNotLoginWithIncorrectCreds() {
        LoginPage loginPage = new LoginPage(); // create an instance
        loginPage.enterUserLogin("wrong@login.com");
        loginPage.enterUserPassword("wrongPassword");
        HomePage homePage = loginPage.submitLoginCredentials();
        assert (!homePage.checkIfLoginSucceed());
        loginPage.closeBrowser();
    }
}