package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class groupchatdetail_page {
	
	AppiumDriver<MobileElement> driver;

	public groupchatdetail_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id = "workspace_name_edittext") MobileElement workspace_name_edittext;
	@AndroidFindBy (id = "add_group_detail_next_textview") MobileElement CreateChat_button;
	

	public void createchat_finalize() {
		workspace_name_edittext.sendKeys("Engineer");
		CreateChat_button.click();
		
	}

	
	
		
	}

