package Mainutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWait  {
	  

public static void AddWaitOnElement(int time, String path,WebDriver driver) {
	
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		
	    
	
	
}
}
