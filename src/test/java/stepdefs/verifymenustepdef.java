package stepdefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.verifymenu;

public class verifymenustepdef extends verifymenu
{
	

@Given("user is able to access tendable site")
public void user_is_able_to_access_tendable_site() 
{
	invokebrowser();
	
}

@When("home page is displayed")
public void home_page_is_displayed() 
{
	verifyHomepage();
	
   
}

@Then("user is able to access {string} menu")
public void user_is_able_to_access_menu(String menu) throws InterruptedException 
{
	verifymenus(menu);
			
	//String xpath= ".//a[contains(text(),"menu"+" "+")]"";
	//driver.findElement(By.xpath()).click();
	//String title= driver.getTitle();
	//System.out.println(title);
	
   
}

@When("user is click on {string} menu")
public void user_is_click_on_menu(String string) throws InterruptedException 
{
	clickOnMenu();
    
}

@When("Click on Marketing")
public void click_on_marketing() 
{
	
	clickOnMaketing();
}

@When("Fill up the form")
public void fill_up_the_form() 
{
	filltheForm(); 
}

@When("On submission error is displayed")
public void on_submission_error_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}






}
