package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

       // driver.findElement(By.linkText("Add Customer")).click();
       // driver.findElement(By.partialLinkText("Add C")).click();

       // driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();
        driver.findElement(By.xpath("//a[text()= 'Add Customer' ]")).click();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jagdhish");
        driver.findElement(By.xpath("//*[@name='address']")).sendKeys("xyz");
        driver.findElement(By.xpath("//*[@name='contact1']")).sendKeys("35454545");
        driver.findElement(By.xpath("//*[@name='contact2']")).sendKeys("54545454");
        driver.findElement(By.xpath("//*[@type='submit']")).click();

    }
}
