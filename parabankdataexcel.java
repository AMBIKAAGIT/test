package mvn;
import java.io.FileInputStream;


import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class parabankdataexcel {
	@DataProvider(name = "data")
    public Object[][] loginData() {
        try {
            FileInputStream fis= new FileInputStream("C:\\Users\\USER\\Documents\\parabank.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            Object[][] data = new Object[sheet.getLastRowNum()][11];

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                String firstname = row.getCell(0).getStringCellValue();
                String lastname = row.getCell(1).getStringCellValue();
                String address = row.getCell(2).getStringCellValue();
                String city = row.getCell(3).getStringCellValue();
                String state = row.getCell(4).getStringCellValue();
                String zipcode = row.getCell(5).getStringCellValue();
                String phone = row.getCell(6).getStringCellValue();
                String ssn = row.getCell(7).getStringCellValue();
                String username = row.getCell(8).getStringCellValue();
                String password = row.getCell(9).getStringCellValue();
                String confirm = row.getCell(10).getStringCellValue();
                data[i - 1][0] = firstname;
                data[i - 1][1] = lastname;
                data[i - 1][2] = address;
                data[i - 1][3] = city;
                data[i - 1][4] = state;
                data[i - 1][5] = zipcode;
                data[i - 1][6] = phone;
                data[i - 1][7] = ssn;
                data[i - 1][8] = username;
                data[i - 1][9] = password;
                data[i - 1][10] = confirm;
            }
            workbook.close();
            fis.close();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return new Object[0][0];
        }
    }

    // Test method that uses data provider
    @Test(dataProvider = "data")
    public void loginTest(String sreya, String k,String kgm,String calicut,String kerala,String ss,String ffg,String ee,String sreyaa,String sss,String ssss) {
        // Set the path to your ChromeDriver
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        // Fill in the login form
        driver.findElement(By.id("customer.firstName")).sendKeys(sreya);
        driver.findElement(By.id("customer.lastName")).sendKeys(k);
        driver.findElement(By.id("customer.address.street")).sendKeys(kgm);
        driver.findElement(By.id("customer.address.city")).sendKeys(calicut);
        driver.findElement(By.id("customer.address.state")).sendKeys(kerala);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(ss);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(ffg);
        driver.findElement(By.id("customer.ssn")).sendKeys(ee);
        driver.findElement(By.id("customer.username")).sendKeys(sreyaa);
        driver.findElement(By.id("customer.password")).sendKeys(sss);
        driver.findElement(By.id("repeatedPassword")).sendKeys(sss);
        driver.findElement(By.id("customerForm")).click();
        // Add verification logic here based on your application's behavior

        // Optionally, you can add assertions or validation steps here

        // Sleep for a moment to see the result
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}


