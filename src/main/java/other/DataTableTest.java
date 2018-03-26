//package other;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class DataTableTest {
//
//    private static final String URL = "https://the-internet.herokuapp.com/tables";
//    private static final By LAST_NAMES = By.cssSelector("#table1 tbody tr td:nth-child(1)");
//    private static final By LAST_NAME_HEADER = By.xpath("//*[text()='Last Name']");
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
//    public void sortTest() {
//        final List<String> lastNames = new ArrayList<>();
//        final List<String> sortedLastNames = new ArrayList<>();
//
//        driver.findElements(LAST_NAMES).forEach(
//                (element) -> lastNames.add(element.getText())
//        );
//        Collections.sort(lastNames);
//
//        driver.findElement(LAST_NAME_HEADER).click();
//        driver.findElements(LAST_NAMES).forEach(
//                (element) -> sortedLastNames.add(element.getText())
//        );
//
//        Assert.assertEquals(lastNames, sortedLastNames);
//    }
//}
