package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        Thread.sleep(4000);

        // 1. find the web element
        WebElement wb = driver.findElement(By.id("multiSel"));

        // 2. create the object of Select class
        Select sel = new Select(wb);

        // 3. select the option
        sel.selectByVisibleText("text 1");
        sel.selectByIndex(2);
        sel.selectByIndex(4);

       // Thread.sleep(4000);

        /*sel.deselectByIndex(3);
        sel.deselectByIndex(2);
        sel.deselectByIndex(0);*/

        //sel.deselectAll();
    }
}
