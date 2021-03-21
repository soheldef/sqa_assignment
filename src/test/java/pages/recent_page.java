package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
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
	@AndroidFindBy (className = "android.widget.RelativeLayout") List <WebElement> bottommenulist;
	@AndroidFindBy (className = "android.widget.TextView") List <WebElement> chatroomlist;

	public void chatcreate() {
		chatcreatebutton.click();
		selectchat.click();
	}

	public void selectgroupchat() {
		chatroomlist.get(1).click();
	}

	public void selectgroupchat2() {
		chatroomlist.get(2).click();
	}

	public void moreoptions() {
		bottommenulist.get(45).click();
	}	
}

