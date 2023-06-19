package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import page.CarDetailsPage;
import page.CarHomePage;

public class BaseTestClass {

	WebDriver driver;
	CarHomePage carHomePage;
	CarDetailsPage carDetailsPage;
	
	//this will setup the driver for each page
	@SuppressWarnings("deprecation")
	@BeforeMethod(alwaysRun=true)
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cazoo.co.uk/value-my-car/");
		carHomePage		= new CarHomePage(driver);
		carDetailsPage	= new CarDetailsPage(driver);
	}
	
	
	//this will close the driver after every car valuation
	@AfterMethod(alwaysRun=true)
	public void close()
	{
		driver.quit();
		
	}
	
}
