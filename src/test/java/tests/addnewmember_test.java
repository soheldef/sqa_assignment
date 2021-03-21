package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import pages.login_page;
import pages.recent_page;
import pages.settings_page;
import pages.tutorial_page;
import pages.chat_page;
import pages.groupinfo_page;
import pages.more_page;
import pages.profile_page;

public class addnewmember_test extends baseclass{

	creategroupchat_test creategroupchat_test;
	tutorial_page tutorial_page;
	login_page login_page;
	recent_page recent_page;
	chat_page chat_page;
	groupinfo_page groupinfo_page;
	more_page more_page;
	profile_page profile_page;
	settings_page settings_page;

	@Test(priority = 1,enabled=false)
	public void addmember() throws InterruptedException   {
		login_page = new login_page(driver);
		recent_page = new recent_page(driver);
		tutorial_page = new tutorial_page(driver);
		chat_page = new chat_page(driver);
		groupinfo_page = new groupinfo_page(driver);
		more_page = new more_page(driver);
		profile_page = new profile_page(driver);
		settings_page = new settings_page(driver);

		//Login to account
		login_page.SignIn("narongsak", "password");
		driver.navigate().back();
		login_page.loginbutton();
		Thread.sleep(4000);

		if (driver.findElement(By.id("view_onboarding_item_title")).isDisplayed()) {
			String welcome_title = driver.findElement(By.id("view_onboarding_item_title")).getText();
			Assert.assertEquals(welcome_title, "Hi Narongsak");

			//View turotial pages
			tutorial_page.tutorialscreen();
		}

		//Add new user name "Janjira Automate" to group
		recent_page.selectgroupchat2();
		chat_page.group_detail();
		groupinfo_page.addnewuser();
		List<MobileElement> users = (List<MobileElement>) driver.findElements(By.className("android.widget.TextView"));
		String name = users.get(11).getText();
		Assert.assertEquals(name, "Janjira Automate");
	}
}
