package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class tutorial_page {
	
	AppiumDriver<MobileElement> driver;

	public tutorial_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id = "view_onboarding_forward") MobileElement arrowsign;
	@AndroidFindBy (id = "view_onboarding_dialog_button") MobileElement onboard_button;
	
	public void tutorialscreen() {
		for (int i = 0; i<3 ; i++) {
			arrowsign.click();
		}
		onboard_button.click();
	}
		
	}

