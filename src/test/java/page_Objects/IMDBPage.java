package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBPage {
public WebDriver ldriver;
public IMDBPage(WebDriver rdriver)
{
	this.ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(xpath="//input[@class='imdb-header-search__input searchTypeahead__input react-autosuggest__input']")
@CacheLookup
WebElement searchbar;

@FindBy(xpath="//button[@type=\"submit\"]//*[local-name()='svg' and @class=\"ipc-icon ipc-icon--magnify\"]")
@CacheLookup
WebElement suggestbar;


@FindBy(xpath="//li[@class=\"ipc-metadata-list-summary-item ipc-metadata-list-summary-item--click find-result-item find-title-result\"]//a[text()='Pushpa: The Rise - Part 1']")
@CacheLookup
WebElement details;

@FindBy(xpath ="//a[normalize-space()='December 17, 2021 (United States)'")
@CacheLookup
WebElement releasedate;

@FindBy(xpath="//a[text()='India']")
@CacheLookup
WebElement country;


public void searchName(String srcname){
	searchbar.sendKeys(srcname);
	
}

public void clickSgtbar() {
    suggestbar.click();
}

public void dtails() {
	details.click();
}

public String rlsDate() {
	releasedate.click();
	String rls=releasedate.getText();
	return rls;
}
public String cntry() {
	String cty=country.getText();
	return cty;
}
	
	
	
	
}


