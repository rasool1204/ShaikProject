package HDC2Demo2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyDriver {

	public static WebDriver getDriver(String brw) {
		
		if (brw.equals("CRM")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (brw.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
			return new InternetExplorerDriver();	
		}
		
		else if (brw.equals("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
			return new FirefoxDriver();	
			
		}
		else if (brw.equals("Safari")) {
			
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
			return new SafariDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_h2a.06.17\\Desktop\\workspaceRasool\\Selenium Stuff\\chromedriver.exe");
			return new FirefoxDriver();	
		}
		

	}

}
