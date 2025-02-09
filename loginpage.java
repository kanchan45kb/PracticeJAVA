package loginpage.log12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
	//	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Rahul"); // CSS selector created manually
		//driver.findElement(By.name("inputPassword")).sendKeys("rahul123");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahul123"); // CSS selector created manually
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();  // CSS selector created manually
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());   // p[class ='error']
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("12345685");
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		Thread.sleep(1000);  
	    // driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	     driver.findElement(By.cssSelector("button[class='go-to-login-btn']:nth-child(1)")).click();
	     Thread.sleep(1000);
	     String name = "rahul";
	     driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys(name);
	     driver.findElement(By.xpath("//input[contains(@name,'inputPassword')]")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.id("chkboxOne")).click();
	     driver.findElement(By.id("chkboxTwo")).click();
	     driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	     Thread.sleep(2000);
	  System.out.println(driver.findElement(By.tagName("p")).getText());
	  Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
	 Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+',');
	// driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	 driver.findElement(By.cssSelector("button.logout-btn")).click();
	     
	     
	    
	    		 
	}

}
