package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {

    public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        System.out.println(driver.getPageSource());

    }
}
