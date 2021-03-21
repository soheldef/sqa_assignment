package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class more_page {

	AppiumDriver<MobileElement> driver;

	public more_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy (id = "createButton") MobileElement chatcreatebutton;
	@AndroidFindBy (id = "textView141") MobileElement selectchat;
	@AndroidFindBy (className = "android.widget.FrameLayout") List <WebElement> profile;

	public void profile_select() {
		profile.get(8).click();
	}	
}

