package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {
	
		

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\software\\software\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://clouddestinations.com/");
	}

}
