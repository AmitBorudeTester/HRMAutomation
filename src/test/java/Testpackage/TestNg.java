package Testpackage;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Mainutility.ElementWait;
import PomPackage.AdminPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import testutility.ReadFile;
import testutility.staticbrowser;


public class TestNg  {
 WebDriver driver;
	
@Parameters({"browser"})//launch multiple browser

@BeforeTest
public void beforeTest(String browser) throws InterruptedException, IOException {
		
	driver=	staticbrowser.launchbroser(browser);// this is use for repetative time so we use static 
	staticbrowser.launchURL("https://www.youtube.com");
		
	AdminPage youtube =new AdminPage(driver);
	
	ElementWait.AddWaitOnElement(10,"//input[@id='search']", driver);
	youtube.searchyoutube(ReadFile.senddata(1,1));
	
		

 
	
	}
	
@BeforeClass        
public void beforeclass() {
	System.out.println("Before class class1 ");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("Before Method class1 ");
}

@Test
public void LoginFunction() throws InterruptedException  {

}

@AfterMethod
public void aftermethod() {
	System.out.println("After method class1 ");
}

@AfterClass          
public void afterclass() {
	System.out.println("After Class class1 ");
}

@AfterTest           
public void aftertest() {
	driver.quit();
}
}



/*	if(browser.equalsIgnoreCase("chrome")) {
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver(options);
}
else if(browser.equalsIgnoreCase("edge")) {
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
}
driver.get("https://www.youtube.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

*/