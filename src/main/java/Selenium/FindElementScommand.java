package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class FindElementScommand {
    public static void main(String[] args) throws Exception {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.techbeamers.com");
        Thread.sleep(5000);

        // Here, the code below will select all rows matching the given XPath.
        List<WebElement> rows = driver.findElements(By.xpath("//table/tr"));
        // print the total number of elements
        System.out.println("Total selected rows are " + rows.size());
        // Now using Iterator we will iterate all elements
        Iterator<WebElement> iter = rows.iterator();
        // this will check whether list has some element or not

        while (iter.hasNext()) {
            // Iterate one by one
            WebElement item = iter.next();
            // get the text
            String label = item.getText();
            // print the text
            System.out.println("Row label is " + label);
            driver.quit();
        }
    }
}

// other example

//  Storing the list
//  List <WebElement> elementList = driver.findElements(By.xpath("//div[@id='example']//ul//li"));
//  Fetching the size of the list
//  int listSize = elementList.size();
//  for (int i=0; i<listSize; i++)
//  {
//  Clicking on each service provider link
//  serviceProviderLinks.get(i).click();
//  Navigating back to the previous page that stores link to service providers
//  driver.navigate().back();
//}