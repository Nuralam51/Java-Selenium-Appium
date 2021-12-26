package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseDriver {

    public static AndroidDriver<AndroidElement> androidDriver;

    public static AndroidDriver<AndroidElement> setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        File appFile = new File("apk", "flipboard.apk");

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 4.2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.UDID, "PNTIDM961202674");
        capabilities.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath());

        capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivityAlias");
        capabilities.setCapability("appPackage", "flipboard.app");

        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Application Starting...");

        return androidDriver;
    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }

}
