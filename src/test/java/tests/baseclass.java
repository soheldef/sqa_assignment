package tests;

import java.io.File;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {
	
	public AppiumDriver<MobileElement> driver;

	@BeforeClass
	public void setup() {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			    File classpathRoot = new File(System.getProperty("user.dir"));
			    File appDir = new File(classpathRoot, "/src/test/resources/apk/ekos.apk");
			    System.out.println(appDir); 

				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "10");
				caps.setCapability("deviceName", "emulator-55546");
				caps.setCapability("appPackage", "com.ekoapp.ekos");
				caps.setCapability("appActivity", "com.ekoapp.splash.SplashActivity");
				caps.setCapability("app", appDir.getAbsolutePath());
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				caps.setCapability("fullReset", false);
				caps.setCapability("noReset", true);

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

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
