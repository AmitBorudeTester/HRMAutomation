package PomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mainutility.ElementWait;


public class AdminPage {
	//WebDriverWait wait;
	WebDriver driver; // wait sathi ha driver
	@FindBy(xpath="//input[@id='search']")
	private WebElement search; 
	
	
	
//-----------------------------------constructor-----------------------------------------//
	
	public AdminPage(WebDriver driver ) {//  
		this.driver=driver;
		PageFactory.initElements(driver, this); // to avoid steal exception
			
	}
	

//------------------------------------------------------------------------------------------------

public void searchyoutube(String dataa) {
	//ElementWait.AddWaitOnElement(10,"//input[@id='search']", driver);
	search.sendKeys(dataa);
	
	
}
}