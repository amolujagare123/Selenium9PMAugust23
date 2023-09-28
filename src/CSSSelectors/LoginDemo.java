package CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector(".blue"));
        btnLogin.click();

       // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.cssSelector("[href*=add_customer]")).click();

        driver.findElement(By.cssSelector("#name")).sendKeys("Jagdhish");
        driver.findElement(By.cssSelector("[name=address]")).sendKeys("xyz");
        driver.findElement(By.cssSelector("#buyingrate")).sendKeys("35454545");
        driver.findElement(By.cssSelector("#sellingrate")).sendKeys("54545454");
        driver.findElement(By.cssSelector(".blue")).click();

    }
}
