import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EMICalculator {

	static AppiumDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			openCal();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.print(exp.getCause());
			System.out.print(exp.getMessage());
			exp.printStackTrace();
		}
		
		
	}
	public static void openCal() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("devicName", "Redmi Note 9 Pro Max");
		cap.setCapability("udid", "1c3696b9");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		
		
		cap.setCapability("appPackage", "com.continuum.emi.calculator");
		cap.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn - EMI Calculator");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url, cap);
		
		
	}

	

}
