package loginpage.log12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the browser
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Jons");
		driver.findElement(By.id("exampleCheck1")).getAttribute("type");
		if(driver.findElement(By.id("exampleCheck1")).getAttribute("type").contains("checkbox"))
		{
			driver.findElement(By.id("exampleCheck1")).click();
		}
		else
		{
			
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		WebElement staticdrop = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select dropdown = new Select(staticdrop);
	    dropdown.selectByVisibleText("Female");
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("4-05-1985");
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
