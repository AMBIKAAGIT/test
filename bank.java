package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class bank {
	
	WebDriver driver;
	@Test(dataProvider="data")
	public void class1(String fn,String ln,String add,String c,String st,String zc,String cn,String ssn,String un,String pw,String pw1) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		 driver=new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/register.htm"); 
Thread.sleep(4000);
driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")); 
element.sendKeys(fn); 
WebElement element1=driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")); 
element1.sendKeys(ln);
WebElement element2=driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
element2.sendKeys(add); 
WebElement element3=driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")); 
element3.sendKeys(c);
WebElement element4=driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")); 
element4.sendKeys(st);
WebElement element5=driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")); 
element4.sendKeys(zc);
WebElement element6=driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")); 
element6.sendKeys(cn);
WebElement element7=driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")); 
element7.sendKeys(ssn);
WebElement element8=driver.findElement(By.xpath("//*[@id=\"customer.username\"]")); 
element8.sendKeys(un);
WebElement element9=driver.findElement(By.xpath("//*[@id=\"customer.password\"]")); 
element9.sendKeys(pw);
WebElement element10=driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")); 
element10.sendKeys(pw);
driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
Thread.sleep(1000);
	}
	@AfterClass
	public void class2() {
		driver.close();
	}
	@DataProvider(name="data")
	public Object[][] dataprovider(){
	return new Object[][]{
		
		{"abi","k","calicut","kgm","kerala","673571","1234567891","123","uname","password","password"},
		};
		   }
	
}
