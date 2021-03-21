package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.recent_page;
import pages.login_page;
import pages.tutorial_page;
import pages.Searchuser_page;
import pages.groupchatdetail_page;
import pages.chat_page;
import pages.groupinfo_page;
import pages.more_page;

public class creategroupchat_test extends baseclass{

	login_page login_page;
	tutorial_page tutorial_page;
	recent_page recent_page;
	Searchuser_page Searchuser_page;
	groupchatdetail_page groupchatdetail_page;
	chat_page chat_page;
	groupinfo_page groupinfo_page;
	more_page more_page;

	@Test(priority = 1,enabled=true)
	public void Login_test() throws InterruptedException   {
		login_page = new login_page(driver);
		tutorial_page = new tutorial_page(driver);
		tutorial_page = new tutorial_page(driver);
		
		login_page.SignIn("chattarika", "password");
		driver.navigate().back();
		login_page.loginbutton();
    	Thread.sleep(6000);
		String welcome_title = driver.findElement(By.id("view_onboarding_item_title")).getText();
		Assert.assertEquals(welcome_title, "Hi Chattarika");
		
		tutorial_page.tutorialscreen();
	}

	@Test(priority = 2,enabled=true)
	public void groupchatCreate_test() throws InterruptedException   {
		recent_page = new recent_page(driver);
		Searchuser_page = new Searchuser_page(driver);
		groupchatdetail_page = new groupchatdetail_page(driver);

		recent_page.chatcreate();
		Searchuser_page.search_select_user();
		groupchatdetail_page.createchat_finalize();
		Thread.sleep(2000);
		String group_title = driver.findElement(By.id("toolbar_title_textview")).getText();
		Assert.assertEquals(group_title, "Engineer");
	}

}
