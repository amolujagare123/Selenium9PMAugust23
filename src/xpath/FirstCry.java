package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCry {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.firstcry.com/");
        driver.findElement(By.xpath("//input[@id='search_box']")).clear();
        driver.findElement(By.xpath("//input[@id='search_box']")).sendKeys("baby soap");
        driver.findElement(By.xpath("//span[@class='search-button']")).click();

        driver.findElement(By.xpath("//div [ div[normalize-space()='Cetaphil Baby Mild Bar - 75 g Pack of 2'] ]//div[contains(text(),'ADD TO CART')]")).click();
    }
}
