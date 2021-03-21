package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import pages.login_page;
import pages.recent_page;
import pages.tutorial_page;
import pages.chat_page;
import pages.groupinfo_page;

public class addnewmember_test extends baseclass{
	
	creategroupchat_test creategroupchat_test;
	
	tutorial_page tutorial_page;
	login_page login_page;
	recent_page recent_page;
	chat_page chat_page;
	groupinfo_page groupinfo_page;
	
	@Test(priority = 1,enabled=true)
	public void addmember() throws InterruptedException   {
		login_page = new login_page(driver);
		recent_page = new recent_page(driver);
		tutorial_page = new tutorial_page(driver);
		chat_page = new chat_page(driver);
		groupinfo_page = new groupinfo_page(driver);
		
		login_page.SignIn("narongsak", "password");
		driver.navigate().back();
		login_page.loginbutton();
		
		Thread.sleep(6000);
		String welcome_title = driver.findElement(By.id("view_onboarding_item_title")).getText();
		Assert.assertEquals(welcome_title, "Hi Narongsak");
		
		tutorial_page.tutorialscreen();
		recent_page.selectgroupchat2();
		chat_page.group_detail();
		groupinfo_page.addnewuser();
		
		List<MobileElement> users = (List<MobileElement>) driver.findElements(By.className("android.widget.TextView"));
		String name = users.get(11).getText();
		Assert.assertEquals(name, "Janjira Automate");
		Thread.sleep(3000);

	}
	
}
