package steps;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.baseclass;

public class verifymenu extends baseclass 
{
	public void invokebrowser()
	{
		setupbrowser();
		driver.get("https://www.tendable.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public void verifyHomepage()
	{
		String actualtitle= driver.getTitle();
		//System.out.println(actualtitle);
		String Exectedtitle= "Quality Improvement App | Health and Social Care | Tendable";
		Assert.assertEquals(actualtitle,Exectedtitle);
		
	}
	public void verifymenus(String menu) throws InterruptedException
	{
		String str= "'"+menu+"'";
		//System.out.println(str);
		String xpath= ".//a[contains(text(),"+str+")]";
		//System.out.println(xpath);
	    driver.findElement(By.xpath(xpath)).click();
	    Thread.sleep(5);
	    WebElement ele=driver.findElement(By.xpath(".//a[contains(text(),'Request A Demo')]"));
	    boolean flag= ele.isDisplayed();
	    Assert.assertEquals(flag, true);

	}
	
	public void clickOnMenu() throws InterruptedException
	{
		Thread.sleep(10);
		WebElement ele=driver.findElement(By.xpath(".//a[contains(text(),'Contact Us')]"));
		ele.click();
	}

	public void clickOnMaketing()
	{
		driver.findElement(By.xpath("(.//button[contains(text(),'Contact')])[1]")).click();
	}
	
	public void filltheForm()
	{
		driver.findElement(By.id("form-input-fullName")).sendKeys("Snehal Metkar");
		driver.findElement(By.id("form-input-organisationName")).sendKeys("TCS");
		driver.findElement(By.id("form-input-cellPhone")).sendKeys("992179887");
		driver.findElement(By.id("form-input-email")).sendKeys("abc@tcs.com");
		Select sel= new Select(driver.findElement(By.name("jobRole")));
		sel.selectByVisibleText("Management");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		driver.findElement(By.id("form-input-consentAgreed-0")).click();
		driver.findElement(By.name("form_page_submit")).click();
		
		
		
	}
}
