package step_Definitions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import page_Objects.WIKIPage;

public class wikiSteps {
public WebDriver driver;
public WIKIPage lp;
	
	@Given("User is on wikipedia home page")
	public void user_is_on_wikipedia_home_page() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	    
		    driver=new ChromeDriver();
		    lp=new WIKIPage(driver); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://en.wikipedia.org/");
		    driver.manage().window().maximize();
	}

	@And("user type {string} on search Wikipedia")
	public void user_type_on_search_wikipedia(String string) {
		lp.searchWord(string);
	   
	}

	@When("user click search button")
	public void user_click_search_button() {
		lp.searchButton();
	    
	}
	
	@Then("the page title should be the {string}")
    public void the_page_title_should_be_the(String string) {
		
    }

	@And("user starts scrolldown can see the name Theatrical release poster")
	public void user_starts_scrolldown_can_see_the_name_Theatrical_release_poster() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		
	    
	}

	@Then("user get the release date and release time")
	public void user_get_the_release_date_and_release_time() {
	System.out.println("The release date is: "+lp.rlsdate());
	System.out.println("And the country is: "+lp.cntry());	
	
	driver.quit();

	   
	}

}
