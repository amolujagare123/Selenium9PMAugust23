import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        Thread.sleep(4000);

        // 1. find the web element
        WebElement wb1 = driver.findElement(By.id("source_118"));

        // 2. create the object of Select class
        Select sel1 = new Select(wb1);

        // 3. select the option
        sel1.selectByVisibleText("Bangalore");
        sel1.selectByIndex(2);
        sel1.selectByIndex(3);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement wb2 = driver.findElement(By.id("fld_118"));
        Select sel2 = new Select(wb2);
        sel2.selectByVisibleText("Bangalore");
        sel2.selectByVisibleText("Mumbai");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();



    }
}
