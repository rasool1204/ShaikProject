package HDC2Demo2020;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NumberOfLinks {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = MyDriver.getDriver("CRM");
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> T_Link = driver.findElements(By.tagName("a"));
		int N_Link = T_Link.size();
		for (int i = 0; i <= N_Link; i++) {
			
			String text = T_Link.get(i).getText();
			System.out.println("the number of links " + text);
			
		}
		
		driver.findElement(By.id("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Rasool");
		driver.findElement(By.id("//input[@id = 'LastName']")).sendKeys("shaik");
		driver.findElement(By.name("//input[@name= 'Email']")).sendKeys("srasoolshaik1@gmail.com");
		driver.findElement(By.name("//input[@id= 'Password']")).sendKeys("Adfr45");
		
		
		
		
	
		
		
		
	}

}
