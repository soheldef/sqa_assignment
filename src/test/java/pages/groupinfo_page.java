package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class groupinfo_page {
	
	AppiumDriver<MobileElement> driver;

	public groupinfo_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id = "group_detail_leave_chat_textview") MobileElement group_leave_tap;
	@AndroidFindBy(id = "button1") MobileElement ok_conf_btn;
	
	
	@AndroidFindBy(className = "android.widget.TextView") List <WebElement> userlistlink;
	
	@AndroidFindBy(id = "button_add_member") MobileElement adduser_btn;
	
	@AndroidFindBy(className = "android.widget.ImageView") List <WebElement> selectuser;
	
	@AndroidFindBy(id = "content") MobileElement addbtn;
	
	
	
	public void Leave_group() {
		group_leave_tap.click();
		ok_conf_btn.click();
	}
	
	public void addnewuser() {
		userlistlink.get(5).click();
		adduser_btn.click();
		selectuser.get(10).click();
		addbtn.click();
	}
	
		
	}

