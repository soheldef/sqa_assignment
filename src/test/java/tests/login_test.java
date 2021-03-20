package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.recent_page;
import pages.login_page;
import pages.tutorial_page;
import pages.Searchuser_page;
import pages.groupchatdetail_page;
import pages.chat_page;

public class login_test extends baseclass{
	
	login_page login_page;
	tutorial_page tutorial_page;
	recent_page recent_page;
	Searchuser_page Searchuser_page;
	groupchatdetail_page groupchatdetail_page;
	chat_page chat_page;

	@Test(priority = 1,enabled=true)
	public void Login_test() throws InterruptedException   {
		login_page = new login_page(driver);
		tutorial_page = new tutorial_page(driver);
		login_page.SignIn();
		driver.navigate().back();
		login_page.loginbutton();
//		Assert.assertEquals(asd, expected_text);
	}
	
	@Test(priority = 2,enabled=true)
	public void Tutorial() throws InterruptedException   {
		tutorial_page = new tutorial_page(driver);
		
		tutorial_page.tutorialscreen();
//		Assert.assertEquals(asd, expected_text);
	}
	
	@Test(priority = 3,enabled=true)
	public void groupchatCreate_test() throws InterruptedException   {
		recent_page = new recent_page(driver);
		Searchuser_page = new Searchuser_page(driver);
		groupchatdetail_page = new groupchatdetail_page(driver);
		
		recent_page.chatcreate();
		Searchuser_page.search_select_user();
		groupchatdetail_page.createchat_finalize();
//		Assert.assertEquals(asd, expected_text);

	}
	
	@Test(priority = 4,enabled=true)
	public void chatfunc_test() throws InterruptedException   {
		chat_page = new chat_page(driver);
		
		chat_page.chat_with_user();
//		Assert.assertEquals(asd, expected_text);

	}
	
	
	
	
}
