package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class settings_page {

	AppiumDriver<MobileElement> driver;

	public settings_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy (id = "logout_view") MobileElement logout;
	@AndroidFindBy (id = "button1") MobileElement logout_confirm;

	public void logoutbutton() {
		logout.click();
		logout_confirm.click();
	}	
}

