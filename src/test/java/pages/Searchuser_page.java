package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Searchuser_page {
	
	AppiumDriver<MobileElement> driver;

	public Searchuser_page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id = "create_group_view") MobileElement create_group;
	@AndroidFindBy (id = "searchBar") MobileElement usersearchbox;
	@AndroidFindBy (id = "contact_name_text_view") MobileElement selectuser;
	@AndroidFindBy (id = "group_chat_next_button") MobileElement group_chat_next_btn;
	
	public void search_select_user() {
		create_group.click();
		usersearchbox.sendKeys("narongsak");
		selectuser.click();
		usersearchbox.click();
		usersearchbox.sendKeys("sakulchaikeaw");
		selectuser.click();
		group_chat_next_btn.click();
	}
	
	
		
	}

