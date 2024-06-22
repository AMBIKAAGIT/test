
package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class newftura {
	
	
@Test
	
	public void futura() throws InterruptedException{
		 {
			// TODO Auto-generated method stub
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			WebDriver driver=new ChromeDriver();
			driver.get("https://thefuturalabs.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menu-item-35\"]/a/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();	
			driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-32\"]/a/span/span")).click();
			driver.quit();}
		// TODO Auto-generated method stub
		 }
	
	 @Test
		 public void futura2() throws InterruptedException{
		 	 {
		 		 
		 		 
		 		// TODO Auto-generated method stub
		 		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		 		WebDriver driver=new ChromeDriver();
		 		driver.get("https://thefuturalabs.com/");
		 		driver.manage().window().maximize();
		 		driver.findElement(By.xpath("//*[@id=\"menu-item-31\"]/a")).click();
		 		Thread.sleep(1000);
		 		WebElement element=driver.findElement(By.xpath("//*[@id=\"wpcf7-f5-p24-o1\"]/form/div[2]/div[1]/p/span[1]/input"));
		 		Thread.sleep(1000);
		 		element.sendKeys("abi");
		 		Thread.sleep(1000);
		 		WebElement element2=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(3) > input"));
		 		Thread.sleep(1000);
				element2.sendKeys("anu@gmail.com");
				Thread.sleep(1000);
				WebElement element3=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(1) > p > span:nth-child(5) > input"));
				Thread.sleep(1000);
				element3.sendKeys("1234567891");
				Thread.sleep(1000);
				WebElement element4=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(2) > p > span:nth-child(1) > input"));
				Thread.sleep(1000);
				element4.sendKeys("testing");
				Thread.sleep(1000);
				WebElement element5=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > div.row > div:nth-child(2) > p > span:nth-child(3) > textarea"));
				Thread.sleep(1000);
				element5.sendKeys("web testing");
				Thread.sleep(1000);
				WebElement submit=driver.findElement(By.cssSelector("#wpcf7-f5-p24-o1 > form > p > input"));
				submit.click();
		 		driver.quit();}
	}//careerpage
		 	 @Test
			 public void futura3() throws InterruptedException{
			 	 {
			 		// TODO Auto-generated method stub
			 		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			 		WebDriver driver=new ChromeDriver();
			 		driver.get("https://thefuturalabs.com/");
			 		driver.manage().window().maximize();
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-32\"]/a/span/span")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[3]/div/a")).click();
                 Thread.sleep(1000);
                    driver.quit();}


	}//cource page
		 	 @Test
			 public void futura4() throws InterruptedException{
			 	 {
			 		// TODO Auto-generated method stub
			 		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			 		WebDriver driver=new ChromeDriver();
			 		driver.get("https://thefuturalabs.com/");
			 		driver.manage().window().maximize();
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		 Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-401\"]/a/span")).click();
			 		 Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		 Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-399\"]/a/span")).click();
			 		 Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-397\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-393\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-403\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-411\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-391\"]/a/span/span[1]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-395\"]/a/span")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-389\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-385\"]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"menu-item-414\"]/a/span")).click();
			 		Thread.sleep(1000);
			 		driver.quit();}
			 	 }

		 	 //footer 
		 	 @Test
		 	 
			 public void futura5() throws InterruptedException{
			 	 {
			 		// TODO Auto-generated method stub
			 		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
			 		WebDriver driver=new ChromeDriver();
			 		driver.get("https://thefuturalabs.com/");
			 		driver.manage().window().maximize();
			 	          WebElement quickLink=driver.findElement(By.xpath("//*[@id=\"menu-item-503\"]/a"));	 	       
			 	          quickLink.click();
			 	          Thread.sleep(1000);
			 	          WebElement quickLink2=driver.findElement(By.cssSelector("#menu-item-27 > a"));
			 	          quickLink2.click();
			 	           Thread.sleep(1000);
			 	           WebElement quickLink3=driver.findElement(By.cssSelector("#menu-item-26 > a"));
			 	          quickLink3.click();
			 	           Thread.sleep(1000);
			 	           WebElement quickLink4=driver.findElement(By.cssSelector("#menu-item-541 > a"));
			 	           quickLink4.click();
			 	           Thread.sleep(1000);
			 	           WebElement quickLink5=driver.findElement(By.cssSelector("#menu-item-30 > a"));
			 	           quickLink5.click();
			 	           Thread.sleep(1000);
			 	            driver.quit();}
		 	 }

			 	
}  


