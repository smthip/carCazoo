package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarHomePage {

	WebDriver driver;
	
	public CarHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Car Registration Locators
	
		@FindBy(id="vrm")
		WebElement carRegistration_txt;
		
		@FindBy(xpath="//*[@class='cui__sc-mqi3p7-0 khfnzn']")
		WebElement startValuation_Btn;
		
		@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div/button")
		WebElement cookies_Btn;
		
		@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/p")
		WebElement 	cokies_lbl;	


	public void verifyCookies()
	{
		String cookiesText= cokies_lbl.getText();
		if(cookiesText.equals("We use cookies on our site"))
			cookies_Btn.click();
	}
	
	public void setCarReg(String carReg)
	{
		carRegistration_txt.sendKeys(carReg);
	}
	
	public void startValuation()
	{
		startValuation_Btn.click();
		
	}
}
