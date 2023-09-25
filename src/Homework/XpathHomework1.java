package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathHomework1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        WebElement txtUsername =driver.findElement(By.xpath("//*[@name='username']"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword =driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin =driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();


    }
}


