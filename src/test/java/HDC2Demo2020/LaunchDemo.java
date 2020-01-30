package HDC2Demo2020;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Dimension d = new Dimension(300, 600);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		
		Point p = new Point(300,200);
		driver.manage().window().setPosition(p);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
