package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {
	public AppiumDriver<MobileElement> driver;
	String platform;

	@BeforeTest
	public void setup() {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			this.platform = "android";
			System.out.println("this is 2");

			if (platform.equalsIgnoreCase("Android")) {
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "10");
				caps.setCapability("deviceName", "emulator-55546");
				caps.setCapability("appPackage", "com.jayway.contacts");
				caps.setCapability("appActivity", "com.jayway.contacts.MainActivity");
				caps.setCapability("app", "/Users/sohel_mlbd/Downloads/Contacts.apk");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				//caps.setCapability("fullReset", false);
				//caps.setCapability("noReset", true);
				//caps.setCapability(MobileCapabilityType.UDID, "");
				//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "");
			}

			else if (platform.equalsIgnoreCase("ios")){
				caps.setCapability("platformName", "iOS");
				caps.setCapability("platformVersion", "12.1");
				caps.setCapability("deviceName", "iPhone XR");
				caps.setCapability("app", "/Users/sohel_mlbd/Downloads/ContactsSimulator.app");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
				//caps.setCapability(MobileCapabilityType.UDID, "E5A5F1AA-F4E3-456F-BEFC-CE566AB2E270");
				//caps.setCapability("fullReset", false);
				//caps.setCapability("noReset", true);
			}


			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,caps);
			//driver.get("http://www.ally.com");
			//      driver.close();
		}

		catch(Exception exp){
			System.out.println("Cause is :" +exp.getCause());
			System.out.println("Message is :" +exp.getMessage());
			exp.printStackTrace();
		}
	}

	@AfterSuite
	public void teardown() {
		System.out.println("this is 3");
		//driver.removeApp("com.google.android.calculator");
		driver.quit();
	}


}
