package Selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class HeadlessBrowser {

    @Test
    public void headlessTest() {
        HtmlUnitDriver driver = new HtmlUnitDriver(true);
        driver.setJavascriptEnabled(false);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tut.by/");
        System.out.println(driver.getTitle());
    }
}

//Open a browser in memory means whenever it will try to open a browser
//the browser page must not come and can perform the operation internally.