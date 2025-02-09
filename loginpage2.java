package loginpage.log12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\\\selenium
		// webdriver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		String password = getPassword(driver); // method call

		String name = "rahul";
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys(name);
		driver.findElement(By.xpath("//input[contains(@name,'inputPassword')]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("12345685");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String PasswordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(PasswordText);
		String[] PasswordArray = PasswordText.split("'");
		String Password = PasswordArray[1].split("'")[0];
		System.out.println(Password);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']:nth-child(1)")).click();
		return Password;
	}

}
