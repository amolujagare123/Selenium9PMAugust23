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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDemoEx2 {
    @Test (dataProvider = "getData")
    public void myTest1(String username,String password)  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }


    @DataProvider
    Object[][] getData() throws IOException {

        // 1 . read the file
        FileInputStream fis = new FileInputStream("Data/myData.xls");

        // 2. convert this file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        // 3. select the sheet
        HSSFSheet sheet = workbook.getSheet("Sheet2");

        // 4. count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount-1][2];

        for (int i=0; i<rowCount-1 ; i++)
        {
            HSSFRow row = sheet.getRow(i+1);

            HSSFCell username = row.getCell(0);

            if (username==null)
                data[i][0] ="";
            else {
                username.setCellType(CellType.STRING);
                data[i][0] = username.toString().trim();
            }

            HSSFCell password = row.getCell(1);
            if (password==null)
                data[i][1] ="";
            else {
                password.setCellType(CellType.STRING);
                data[i][1] = password.toString().trim();
            }

        }


        /*data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";*/

        return data;
    }
}
