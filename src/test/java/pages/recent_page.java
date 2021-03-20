package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class recent_page {
	
	AppiumDriver<MobileElement> driver;

	public recent_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id = "createButton") MobileElement chatcreatebutton;
	@AndroidFindBy (id = "textView141") MobileElement selectchat;
	
	public void chatcreate() {
		chatcreatebutton.click();
		selectchat.click();
	}
		
	}

