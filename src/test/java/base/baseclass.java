
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	
	public WebDriver driver;
	
	public void setupbrowser()
	{
		
		System.out.println("=====Browser Session Started=====");
		
        driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	

}
