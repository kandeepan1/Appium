package week1.day3;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Samlaunch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.samsung.android.messaging");
		dc.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");

		dc.setCapability("deviceName", "Galaxy S8");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "UiAutomator1");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.findElementByAccessibilityId("Navigate up").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/search_src_text").sendKeys("abcd");
		driver.findElementById("com.samsung.android.messaging:id/from").click();
		driver.findElementById("android:id/button1").click();
		driver.findElementById("com.samsung.android.messaging:id/editor_body").sendKeys("Hi");
		driver.findElementByAccessibilityId("Send").click();


	}

}
