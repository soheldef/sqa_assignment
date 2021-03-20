package tests;

import org.testng.annotations.Test;

import pages.login_page;

public class login_test extends baseclass{
	
	login_page login_page;

	@Test(priority = 1,enabled=true)
	public void SearchSara() throws InterruptedException   {
		login_page = new login_page(driver);
		login_page.SignIn();
		driver.navigate().back();
		login_page.loginbutton();
		
//		Assert.assertEquals(asd, expected_text);

	}
	
}
