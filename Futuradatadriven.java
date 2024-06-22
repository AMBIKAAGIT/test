package mvn;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Futuradatadriven {
	public class datadriven {
		WebDriver driver;
		@Test(dataProvider="data")
		public void class1(String name ,String a ,String y,String E,String m ) throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			driver=new ChromeDriver();
			driver.get("https://thefuturalabs.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menu-item-31\"]/a/span/span")).click();
	 		Thread.sleep(1000);
			WebElement element1=driver.findElement(By.xpath("//*[@id=\"wpcf7-f5-p24-o1\"]/form/div[2]/div[1]/p/span[1]/input"));
			element1.sendKeys(name);
			Thread.sleep(1000);
			WebElement element2=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(3) > input"));;
			element2.sendKeys(a);
			Thread.sleep(1000);
			WebElement element3=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(5) > input"));
			element3.sendKeys(y);
			Thread.sleep(1000);
			WebElement element4=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(2) > p > span:nth-child(1) > input"));
			element4.sendKeys(E);
			Thread.sleep(1000);
			WebElement element5=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(2) > p > span:nth-child(3) > textarea"));
			element5.sendKeys(m);
			Thread.sleep(1000);
			WebElement submit=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > p > input"));
			submit.click();
		}
	
		@AfterClass
		public void class2() {
			driver.close();
		}
	
		@DataProvider(name="data")
		public Object[][] dataprovider(){
		return new Object[][]{
			{"abi","abik@gmail.com","1234567891","test","testpractice"},   
		};
		}
		public class datadrivenk {
			WebDriver driver;
		
		@Test(dataProvider="data")
		public void class2(String name ,String sub ,String email,String msg,String cn ) throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			driver=new ChromeDriver();
			driver.get("https://thefuturalabs.com/");
			driver.manage().window().maximize();	
			WebElement element6=driver.findElement(By.xpath("//*[@id=\"wpcf7-f5-o1\"]/form/div[2]/div[1]/p/span[1]/input"));
			element6.sendKeys(name);
			WebElement element7=driver.findElement(By.xpath("//*[@id=\"wpcf7-f5-o1\"]/form/div[2]/div[2]/p/span[1]/input"));
			Thread.sleep(1000);
			element7.sendKeys(sub);
			Thread.sleep(1000);
			WebElement element8=driver.findElement(By.cssSelector("#wpcf7-f5-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(3) > input"));
			Thread.sleep(1000);
			element8.sendKeys(email);
			Thread.sleep(1000);
			WebElement element9=driver.findElement(By.cssSelector("#wpcf7-f5-o1 > form > div.row > div:nth-child(2) > p > span:nth-child(3) > textarea"));
			Thread.sleep(1000);
			element9.sendKeys(msg);
			Thread.sleep(1000);
			WebElement element10=driver.findElement(By.cssSelector("#wpcf7-f5-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(5) > input"));
			element10.sendKeys(cn);
			Thread.sleep(1000);
			WebElement submit=driver.findElement(By.cssSelector("#wpcf7-f5-o1 > form > p > input"));
			submit.click();
				
}
		@AfterClass
		public void class2() {
			driver.close();
		}
	
		@DataProvider(name="data")
		public Object[][] dataprovider1(){
		return new Object[][]{
			{"abi","testing","aghgh@gmail.com","test demo","1234567891"},   
		};
				
		}
		
		}
}}
