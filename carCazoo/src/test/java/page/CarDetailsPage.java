package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CarDetailsPage {

	WebDriver driver;
	public CarDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	// Car Details Locator
	@FindBy(xpath="//*[@class='sc-fLcnxK heOBKU']")
	WebElement carRegDetails_txt;
	

	//Car Details will be return
	public String getCarInfo()
	{
	
		String carMakeModel=carRegDetails_txt.getText();
		return carMakeModel ;
	}

}

