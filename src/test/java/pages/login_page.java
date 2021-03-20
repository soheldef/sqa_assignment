package pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class login_page {
	
	AppiumDriver<MobileElement> driver;

	public login_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id = "login_username_edittext") MobileElement username_field;
	@AndroidFindBy (id = "login_password_edittext") MobileElement password_field;
	@AndroidFindBy (id = "button") MobileElement signin_button;
	
	public void SignIn() {
		username_field.sendKeys("chattarika");
		password_field.sendKeys("password");
		
	}
	
	public void loginbutton() {
		signin_button.click();
		
	}
	
	

	
}
	
	
