import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAppAndroid_Emulator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		d.setCapability(MobileCapabilityType.APP, "C:\\Users\\ramad\\Downloads\\indiamart-13-2-0.apk");
	
		URL url = new URL("http://127.0.0.1:4723/");
		
		AndroidDriver driver = new AndroidDriver(url,d);
		
	}

}
