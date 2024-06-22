package mvn;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class cart {
@Test
public void cartt() throws InterruptedException{
	 {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
		driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
		driver.findElement(By.xpath("//*[@id=\"login2\"]"));
		driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
		driver.quit();}
}

//contact
@Test
public void contact() throws InterruptedException{
	 {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
		element.sendKeys("anu@gmail.com");
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"recipient-name\"]"));
		element2.sendKeys("65675765");
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"message-text\"]"));
		element3.sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		driver.quit();}
	 }
//aboutus page
@Test
public void Aboutus() throws InterruptedException{
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
		driver.quit();}
}
//CARTPAGE
@Test
public void cart() throws InterruptedException{
	{
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	Thread.sleep(1000);
	driver.quit();}
}
//login page
@Test
public void login() throws InterruptedException{
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	Thread.sleep(1000);
	WebElement element4=driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
	element4.sendKeys("anuk");
	WebElement element5=driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
	element5.sendKeys("anuk");
	driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	driver.quit();}

//signup
@Test
public void signup() throws InterruptedException{
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	driver.findElement(By.xpath(""));
}
}		
		
	


	 	

