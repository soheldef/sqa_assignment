package tests;

import static org.testng.Assert.assertTrue;

import java.awt.Dimension;
import java.time.Duration;
import java.util.List;

import javax.swing.text.TableView;
import javax.swing.text.View;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.LongPressOptions;
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
		WebDriverWait wait = new WebDriverWait(driver,30);
		
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("image")));
		Assert.assertEquals(true, driver.findElement(By.id("image")).isDisplayed());
	
		//Create topic for group "Engineer"
		chat_page.create_topic();
		String topic_title = driver.findElement(By.id("toolbar_title_textview")).getText();
		Assert.assertEquals(topic_title, "Meeting");
		chat_page.goback();
		
		//leave group
//		chat_page.group_detail();
//		TouchActions action = new TouchActions(driver);
//
//		Thread.sleep(3000);
//		action.move(625, -2900);
//		Thread.sleep(3000);
//		
//		groupinfo_page.Leave_group();
		
		//logout
		Thread.sleep(2000);
		recent_page.moreoptions();
		more_page.profile_select();	
		profile_page.clicksettings();
		settings_page.logoutbutton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_username_edittext")));
	}

	@Test(priority = 2,enabled=true)
	public void addmember() throws InterruptedException   {
		login_page = new login_page(driver);
		recent_page = new recent_page(driver);
		tutorial_page = new tutorial_page(driver);
		chat_page = new chat_page(driver);
		groupinfo_page = new groupinfo_page(driver);
		more_page = new more_page(driver);
		profile_page = new profile_page(driver);
		settings_page = new settings_page(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);

		//Login to account
		login_page.SignIn("narongsak", "password");
		driver.navigate().back();
		login_page.loginbutton();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("view_onboarding_item_title")));
		
		String welcome_title = driver.findElement(By.id("view_onboarding_item_title")).getText();
		Assert.assertEquals(welcome_title, "Hi Narongsak");

		//View turotial pages
		tutorial_page.tutorialscreen();

		//Add new user name "Janjira Automate" to group
		recent_page.selectgroupchat2();
		chat_page.group_detail();
		groupinfo_page.addnewuser();
		List<MobileElement> users = (List<MobileElement>) driver.findElements(By.className("android.widget.TextView"));
		String name = users.get(11).getText();
		Assert.assertEquals(name, "Janjira Automate");
	}
	
}
