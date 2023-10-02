package TestNGDemo;


import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginDemoTestNG2 {

    WebDriver driver;
    @BeforeMethod // method below this annotation will run before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod // method below this annotation will run after every test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    @Test
    public void myTest1()  {


        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void myTest2()  {


        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("sdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void myTest3()  {


        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
}
