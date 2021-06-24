package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public void url1()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
	}

	public void url2()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
	}
		
		
	
}
