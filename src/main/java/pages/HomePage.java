package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//img[@class='bc-logo logo-us'])[2]")
	WebElement logo;
	
	
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}

}
