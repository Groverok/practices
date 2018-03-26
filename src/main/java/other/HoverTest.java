//package other;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class HoverTest {
//
//    private static final String URL = "https://the-internet.herokuapp.com/hovers";
//    private static final By AVATAR_CONTAINER = By.cssSelector("div.figure");
//
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void openBrowser() {
//        driver = new FirefoxDriver();
//        driver.get(URL);
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        driver.close();
//    }
//
//    @Test
//    public void hoverTest() {
//        List<WebElement> avatars = driver.findElements(AVATAR_CONTAINER);
//        Actions actions = new Actions(driver);
//        avatars.forEach(
//                (element) -> {
//                    actions.moveToElement(element).perform();
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
//        //some additional code
//    }
//}
