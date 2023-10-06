package AssertsDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo {
    @Test
    public void myTest1()  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       /* String expected = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Log out";
        String actual ="";
        try {
             actual = driver.findElement(By.xpath("//a[contains(@class,'logoff ')]")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");

    }

    @Test
    public void myTest2()  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       /* String expected = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Wrong Username or Password";
        String actual ="";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void myTest3()  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");

       /* ArrayList<String> expected = new ArrayList<>() {{
            add("PLEASE ENTER A USERNAME");
            add("PLEASE PROVIDE A PASSWORD");
        }};*/

        ArrayList<String> actual = new ArrayList<>();
        try
        {
            String actual1 = driver.findElement(By.xpath("//label[@for='login-username'][@class='error']")).getText();
            String actual2 = driver.findElement(By.xpath("//label[@for='login-password'][@class='error']")).getText();

            actual.add(actual1);
            actual.add(actual2);

        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }
    @Test
    public void myTest4()  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");

       /* ArrayList<String> expected = new ArrayList<>() {{
            add("PLEASE ENTER A USERNAME");
            add("PLEASE PROVIDE A PASSWORD");
        }};*/

        ArrayList<String> actual = new ArrayList<>();
        try
        {
            List<WebElement> errorList = driver.findElements(By.xpath("//label[@class='error']"));

            actual.add(errorList.get(0).getText());
            actual.add(errorList.get(1).getText());
        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }
}
