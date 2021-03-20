package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.tutorial_page;

public class tutorial_test extends baseclass{
	
	tutorial_page tutorial_page;
	
	@Test(priority = 1,enabled=true)
	public void Tutorial() throws InterruptedException   {
		tutorial_page = new tutorial_page(driver);
		tutorial_page.tutorialscreen();		
//		Assert.assertEquals(asd, expected_text);

	}
	
}
