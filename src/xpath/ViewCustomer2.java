package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ViewCustomer2 {

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


        driver.findElement(By.xpath("//a[text()= 'Add Customer' ]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).click();

        String name = "Shainitha";


        //driver.findElement(By.xpath("//tr[td [normalize-space()='priti']]//a[contains( @class , 'edit')]")).click();

        driver.findElement(By.xpath("//tr[td [normalize-space()='" + name + "']]//input")).click();



    }
}
