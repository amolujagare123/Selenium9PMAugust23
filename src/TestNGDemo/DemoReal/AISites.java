package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

    WebDriver driver;
    @BeforeClass // method below this annotation will run before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // method below this annotation will run after every test method of the class
    public void closeBrowser() throws InterruptedException {
        driver.close();
    }

    @Test //(enabled = false)
    public void chatGtp()
    {
        driver.get("http://chat.openai.com");
    }
    @Test
    public void midjourney()
    {
        driver.get("http://midjourney.com");
    }
    @Test
    public void synthesia()
    {
        driver.get("https://www.synthesia.io/");
    }

}
