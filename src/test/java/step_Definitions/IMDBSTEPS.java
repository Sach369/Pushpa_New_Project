package step_Definitions;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import page_Objects.IMDBPage;

public class IMDBSTEPS {
	public WebDriver driver;
	public IMDBPage lpp;

	
@Given("User is on home page")
public void user_is_on_home_page() {
	
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
    
  driver=(WebDriver) new ChromeDriver();
    lpp=new IMDBPage(driver); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.imdb.com/");
    driver.manage().window().maximize();
  }

@And("User type pushpa on search {string}")
public void user_type_pushpa_on_search(String string) {
   lpp.searchName("Pushpa");
}

@When("user click PUSHPA in suggestion bar")
public void user_click_PUSHPA_in_suggestion_bar() {
  lpp.clickSgtbar();  
}

@Then("the page title should be {string}")
public void the_page_title_should_be(String string) {
  
  
}

@And("user can see the Details")
public void user_can_see_the_Details() {
	
    lpp.dtails();
    
   
}

@And("user can get the {string} and {string}")
public void user_can_get_the_and(String string, String string2) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,6300)", "");
	System.out.println("The release dateis:" +lpp.rlsDate());
	System.out.println("And the country is :"+lpp.cntry());
	driver.quit(); 
   
}



}
