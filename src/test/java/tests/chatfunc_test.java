package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.settings_page;
import pages.recent_page;
import pages.login_page;
import pages.tutorial_page;
import pages.Searchuser_page;
import pages.groupchatdetail_page;
import pages.chat_page;
import pages.groupinfo_page;
import pages.more_page;
import pages.profile_page;

public class chatfunc_test extends baseclass{
	
	login_page login_page;
	tutorial_page tutorial_page;
	recent_page recent_page;
	Searchuser_page Searchuser_page;
	groupchatdetail_page groupchatdetail_page;
	chat_page chat_page;
	groupinfo_page groupinfo_page;
	more_page more_page;
	settings_page settings_page;
	profile_page profile_page;
	
	@Test(priority = 1,enabled=true)
	public void sendmsg_createtopic_test() throws InterruptedException  {
		chat_page = new chat_page(driver);
		recent_page = new recent_page(driver);
		groupinfo_page = new groupinfo_page(driver);
		more_page = new more_page(driver);
		settings_page = new settings_page (driver);
		profile_page = new profile_page(driver);
		
		// select newly created group and send text message
		recent_page.selectgroupchat();
		chat_page.text_message();
		String message_text = driver.findElement(By.id("message")).getText();
		assertTrue(message_text.contains("test"));
		
		// send sticker message
		chat_page.sticker_message();
		Assert.assertEquals(true, driver.findElement(By.id("sticker")).isDisplayed());
		
		// send photo message
		chat_page.photo_message();
		Thread.sleep(2000);
		Assert.assertEquals(true, driver.findElement(By.id("image")).isDisplayed());
	
		//Create topic for group "Engineer"
		chat_page.create_topic();
		String topic_title = driver.findElement(By.id("toolbar_title_textview")).getText();
		Assert.assertEquals(topic_title, "Meeting");
		chat_page.goback();
	
		//leave group
		//chat_page.group_detail();
		//groupinfo_page.Leave_group();
		
		//logout
		Thread.sleep(2000);
		recent_page.moreoptions();
		more_page.profile_select();	
		profile_page.clicksettings();
		settings_page.logoutbutton();
		Thread.sleep(1000);
	}
	
}
