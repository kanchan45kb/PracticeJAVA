package loginpage.log12;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		int j =0;
		String[] names = {"Cucumber","Beetroot","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		List<WebElement>products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<=products.size();i++)
		{
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List iteamsNeededList = Arrays.asList(names);
			
			if (iteamsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(2000);
				if(j==names.length)
				{
					break;
				}
				
			}
		}
		
		

	}

}
