package appium.demo;


// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;


public class AppiumDemo {

    private static AndroidDriver driver;
    UiAutomator2Options options = new UiAutomator2Options();

    public void setUp() {

        options
                .amend("platformName", "Android")
                .amend("appium:deviceName", "emulator-5554")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:appPackage", "com.saucelabs.mydemoapp.android")
                .amend("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.MainActivity")
                .amend("appium:newCommandTimeout", 3600)
                .amend("uiautomator2ServerLaunchTimeout", 90000);

    }
        private URL getUrl() throws MalformedURLException {

            return new URL("http://127.0.0.1:4723");
        }


    public static void main(String[] args) throws MalformedURLException {
        AppiumDemo d1 = new AppiumDemo();
        d1.setUp();
        driver = new AndroidDriver(d1.getUrl(), d1.options);
    }


}
