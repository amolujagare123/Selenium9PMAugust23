package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddCustomer {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test(dataProvider = "getData")
    public void addCustomerTest(String name,String address,String contact1,String contact2)
    {
        driver.findElement(By.partialLinkText("Add C")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);
        driver.findElement(By.name("Submit")).click();
    }

    @DataProvider
    Object[][] getData() throws IOException {

        FileInputStream fis = new FileInputStream("Data/myData.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("customer data");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0; i<rowCount-1 ; i++)
        {
            HSSFRow row = sheet.getRow(i+1);

            HSSFCell name = row.getCell(0);
            if (name==null)
                data[i][0] ="";
            else {
                name.setCellType(CellType.STRING);
                data[i][0] = name.toString().trim();
            }

            HSSFCell address = row.getCell(1);
            if (address==null)
                data[i][1] ="";
            else {
                address.setCellType(CellType.STRING);
                data[i][1] = address.toString().trim();
            }

            HSSFCell contact1 = row.getCell(2);
            if (contact1==null)
                data[i][2] ="";
            else {
                contact1.setCellType(CellType.STRING);
                data[i][2] = contact1.toString().trim();
            }

            HSSFCell contact2 = row.getCell(3);
            if (contact2==null)
                data[i][3] ="";
            else {
                contact2.setCellType(CellType.STRING);
                data[i][3] = contact1.toString().trim();
            }
        }
        return data;
    }
}
