package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class chat_page {
	
	AppiumDriver<MobileElement> driver;

	public chat_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className = "android.widget.ImageButton") List <WebElement> links;
	@AndroidFindBy(id = "messageEditText") MobileElement meaasge_box;
		
	public void chat_with_user() {
		meaasge_box.sendKeys("test");
		links.get(0).click();
		
	}


	
	
		
	}

