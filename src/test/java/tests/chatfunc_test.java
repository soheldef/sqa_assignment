package tests;

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
	public void sendmessage_test() throws InterruptedException   {
		chat_page = new chat_page(driver);
		recent_page = new recent_page(driver);
		
		recent_page.selectgroupchat();
		chat_page.text_message();
		chat_page.sticker_message();
		//chat_page.photo_message();
		//		Assert.assertEquals(asd, expected_text);

	}
	
	@Test(priority = 2,enabled=true)
	public void createtopic_test() throws InterruptedException   {
		chat_page = new chat_page(driver);

		chat_page.create_topic();
	}
	
	@Test(priority = 3,enabled=false)
	public void leavegroup_test() throws InterruptedException   {
		chat_page = new chat_page(driver);
		groupinfo_page = new groupinfo_page(driver);

		chat_page.group_detail();
		//groupinfo_page.Leave_group();
	}
	
	@Test(priority = 4,enabled=true)
	public void logout_test() throws InterruptedException   {
		recent_page = new recent_page(driver);
		more_page = new more_page(driver);
		settings_page = new settings_page (driver);
		profile_page = new profile_page(driver);
		
		recent_page.moreoptions();
		more_page.profile_select();	
		profile_page.clicksettings();
		settings_page.logoutbutton();
		Thread.sleep(4000);

	}
	
}
