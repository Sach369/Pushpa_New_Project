package page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class WIKIPage {
	public WebDriver ldriver;
	public WIKIPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@name='search']")
	@CacheLookup
	WebElement searchbar;

	@FindBy(xpath="//button[@class=\"cdx-button cdx-button--action-default cdx-button--type-normal cdx-button--framed cdx-search-input__end-button\"]")
	@CacheLookup
	WebElement searchbutton;


	@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement releasedate;

	@FindBy(xpath="//td[text()='India']")
	@CacheLookup
	WebElement country;

	
	public void searchWord(String pushpa) {
		searchbar.sendKeys(pushpa);
	}
	public void searchButton() {
		searchbutton.click();
	}
	public String rlsdate() {
		String si=releasedate.getText();
		return si;
	}
	
	public String cntry() {
		String ci=country.getText();
		return ci;
		
	}
	
	
	
	
	
	
	
	
}
	
	
	
