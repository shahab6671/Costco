package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePagesTest extends BaseClass {
	@Test(enabled = true)
	public void clickLogoTest() throws InterruptedException  {
		homePage.clickLogo();
	}
}