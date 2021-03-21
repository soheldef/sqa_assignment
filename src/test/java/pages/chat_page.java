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

	@AndroidFindBy(className = "android.widget.ImageButton") List <WebElement> msgsendbtn;
	@AndroidFindBy(id = "messageEditText") MobileElement meaasge_box;
	@AndroidFindBy(id = "sticker_icon") MobileElement sticker_icon;
	@AndroidFindBy(className = "android.widget.ImageView") List <WebElement> stickerlist;
	//	@AndroidFindBy(id = "permission_allow_button") MobileElement photo_access;
	//	@AndroidFindBy(id = "photo_thumbnail") MobileElement photo_thumbnail;
	@AndroidFindBy(id = "action_topic_list") MobileElement topic_icon;
	@AndroidFindBy(accessibility = "Topics") MobileElement create_topic_icon;
	@AndroidFindBy(id = "view_new_compose_view_topic_name") MobileElement topic_name_box;
	@AndroidFindBy(id = "button") MobileElement topic_create_button;
	@AndroidFindBy(accessibility = "Navigate up") MobileElement topic_close_icon;
	@AndroidFindBy(id = "toolbar_title_textview") MobileElement group_members;

	public void text_message() {
		meaasge_box.sendKeys("test");
		msgsendbtn.get(0).click();
	}

	public void sticker_message() {
		sticker_icon.click();
		stickerlist.get(16).click();
		stickerlist.get(16).click();
	}

	//	public void photo_message() {
	//		stickerlist.get(10).click();
	//		photo_access.click();
	//		driver.terminateApp("com.ekoapp.ekos");
	//		driver.activateApp("com.ekoapp.ekos");
	//		photo_thumbnail.click();
	//		//stickerlist.get(0).click();
	//	}

	public void create_topic() {
		topic_icon.click();
		create_topic_icon.click();
		topic_name_box.sendKeys("Meeting");
		topic_create_button.click();
	}
	
	public void goback() {
		topic_close_icon.click();
		topic_close_icon.click();
		//WILL BE REMOVED
		topic_close_icon.click();
	}
	

	public void group_detail() {
		group_members.click();
	}	
}

