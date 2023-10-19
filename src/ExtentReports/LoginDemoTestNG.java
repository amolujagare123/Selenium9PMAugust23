package ExtentReports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginDemoTestNG {
    ExtentReports extent;
    @BeforeClass
    public void initExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression report");

        extent.setSystemInfo("Project Name","Stock Management System");
        extent.setSystemInfo("Dev Name","Shainita");
        extent.setSystemInfo("Project Deadline","31 Dec 2023");
        extent.setSystemInfo("Release date","18 Oct 2023");
        extent.setSystemInfo("Sprint","SP12.3333");


    }

    @AfterClass
    public void writeToReport()
    {

        extent.flush();
    }

    @Test
    public void validLogin()  {

        ExtentTest test = extent.createTest("validLogin");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        try {
            Assert.assertEquals(driver.getTitle(), "Dashboard", "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }

    }

    @Test
    public void invalidLogin()  {

        ExtentTest test = extent.createTest("invalidLogin");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("gfgf");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("gfgf");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

    }

    @Test
    public void blankLogin()  {

        ExtentTest test = extent.createTest("blankLogin");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

    }
}
