package loginpage.log12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
	//	dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<2;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
		/*Exception in thread "main" java.lang.AssertionError: expected [4 Adult] but found [3 Adult]
	    at org.testng.Assert.fail(Assert.java:89)
		at org.testng.Assert.failNotEquals(Assert.java:489)
		at org.testng.Assert.assertEquals(Assert.java:118)
		at org.testng.Assert.assertEquals(Assert.java:171)
		at org.testng.Assert.assertEquals(Assert.java:181)
		at loginpage.log12.dropdown.main(dropdown.java:32)*/

       // System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
      // driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
      System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
      driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-current-day")).click();
      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
      if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
      {
    	  System.out.println("Its enable");
    	  Assert.assertTrue(true);
      }
      else 
      {
    	  System.out.println("Its Disable");
      }
      driver.findElement(By.id("Div1")).click();
      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
      driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-current-day")).click();
      }
      

        
       
	}


