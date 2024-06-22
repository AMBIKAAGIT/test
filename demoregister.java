package mvn;
import java.io.FileInputStream;


import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class demoregister {
	WebDriver driver;
	@Test(dataProvider="data")
	public void class1(String fn,String ln,String add,String em,String pw,String pw1) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		 driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html"); 
Thread.sleep(4000);
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement element=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")); 
Thread.sleep(1000);
element.sendKeys(fn); 
Thread.sleep(1000);
WebElement element1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")); 
Thread.sleep(1000);
element1.sendKeys(ln);
Thread.sleep(1000);
WebElement element2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")); 
Thread.sleep(1000);
element2.sendKeys(add);
Thread.sleep(1000);
WebElement element3=driver.findElement(By.xpath("//*[@id=\"eid\"]/input")); 
Thread.sleep(1000);
element3.sendKeys(em);
Thread.sleep(1000);
WebElement element4=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
Thread.sleep(1000);
element4.sendKeys();
Thread.sleep(1000);
WebElement radioButton=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")); // Change "radioButton" to the actual ID of your radio button element
Thread.sleep(1000);
// Check if the radio button is not already selected
if (!radioButton.isSelected()) {
    // Click on the radio button to select it
    radioButton.click();
}
Thread.sleep(1000);
// Alternatively, you can use the click() method directly without checking isSelected() first:
// radioButton.click();
WebElement dropdownElement = driver.findElement(By.id("Skills"));

// Create a Select object to interact with the dropdown
Select dropdown = new Select(dropdownElement);
dropdown.selectByVisibleText("c");
Thread.sleep(1000);
WebElement element5=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")); 
Select dropdown2 = new Select(dropdownElement);
dropdown2.selectByVisibleText("India");
//date of birth
//year
Thread.sleep(1000);
WebElement element6=driver.findElement(By.xpath("//*[@id=\"yearbox\"]")); 
Select dropdown3 = new Select(dropdownElement);
dropdown3.selectByVisibleText("1916");
//month
Thread.sleep(1000);
WebElement element7=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")); 
Select dropdown4 = new Select(dropdownElement);
dropdown4.selectByVisibleText("march");
//date
Thread.sleep(1000);
WebElement element8=driver.findElement(By.xpath("//*[@id=\"daybox\"]")); 
Select dropdown5 = new Select(dropdownElement);
dropdown5.selectByVisibleText("4");
Thread.sleep(1000);
WebElement element9=driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
element9.sendKeys(pw);
Thread.sleep(1000);
WebElement element10=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
element9.sendKeys(pw);
Thread.sleep(1000);

}
	@AfterClass
	public void class2() {
		driver.close();
	}
	@DataProvider(name="data")
	public Object[][] dataprovider(){
	return new Object[][]{
		
		{"anu","k","calicut","anu@gmail.com","123","123"}
		};
		   }
	

		

}
