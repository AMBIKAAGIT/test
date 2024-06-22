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

public class swaglabss {

	
//		WebDriver driver;
//		@Test(dataProvider="data")
//				public void class1(String uname,String pw) throws InterruptedException {	
//			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
//			 driver=new ChromeDriver();
//			driver.get("https://www.saucedemo.com/v1/");
//			driver.manage().window().maximize();xx
	
//			Thread.sleep(1000);
//			WebElement element=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
//			element.sendKeys(uname);
//			WebElement element2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
//			element2.sendKeys(pw);
//			Thread.sleep(1000);
//			WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//			login.click();
//			Thread.sleep(1000);
//			}
//				@AfterClass
//				public void class2() {
//					driver.close();
//				}
				 // Data provider method to read data from Excel
			    @DataProvider(name = "data")
			    public Object[][] loginData() {
			        try {
			            FileInputStream fis= new FileInputStream("C:\\Users\\USER\\Documents\\swaglabs.xlsx");
			            XSSFWorkbook workbook = new XSSFWorkbook(fis);
			            Sheet sheet = workbook.getSheetAt(0);

			            Object[][] data = new Object[sheet.getLastRowNum()][2];

			            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			                Row row = sheet.getRow(i);
			                String username = row.getCell(0).getStringCellValue();
			                String password = row.getCell(1).getStringCellValue();
			                data[i - 1][0] = username;
			                data[i - 1][1] = password;
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
			    public void loginTest(String username, String password) {
			        // Set the path to your ChromeDriver
			        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			        // Initialize WebDriver
			        WebDriver driver = new ChromeDriver();

			        // Open the login page
			        driver.get("https://www.saucedemo.com/v1/");

			        // Fill in the login form
			        driver.findElement(By.id("user-name")).sendKeys(username);
			        driver.findElement(By.id("password")).sendKeys(password);
			        driver.findElement(By.id("login-button")).click();

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
				  
				    
				
		
	


