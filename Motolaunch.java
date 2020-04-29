package week1.day2;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Motolaunch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		dc.setCapability("deviceName", "Moto G Play");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "UiAutomator1");
		// dc.setCapability("noRest", true);
		// dc.setCapability("fullReset", false);
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.findElementById("com.android.chrome:id/terms_accept").click();
		Thread.sleep(3000);
		driver.findElementById("com.android.chrome:id/negative_button").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.ImageView").click();
			}

}
