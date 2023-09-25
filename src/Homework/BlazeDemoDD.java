package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");
        WebElement wb1=driver.findElement(By.tagName("select"));
        Select sel1=new Select(wb1);
        sel1.selectByVisibleText("Mexico City");

        WebElement wb2=driver.findElement(By.name("toPort"));
        Select sel2=new Select(wb2);
        sel2.selectByValue("London");
        Thread.sleep(4000);
        WebElement wb3=driver.findElement(By.tagName("input"));
        wb3.click();
    }
}
