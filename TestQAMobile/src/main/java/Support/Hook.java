package Support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Support.World.supportobj;


public class Hook {
    public static AppiumDriver driver;
    public static Scenario scenario;

    @Before("@Runtest")
    public void tearUp(Scenario scenario) throws MalformedURLException {
        System.out.println("beforetag running");
       // driver = new ChromeDriver();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("udid","R3CT305M22W");
        cap.setCapability("deviceName","Samsung s22");
        cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability("platformVersion","12");
        cap.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability("appium:automationName","UiAutomator2");
        try {

           driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        } catch (MalformedURLException e) {

            System.out.println(e.getMessage());

        }
        //driver.get("https://www.google.com/");
        new World().driverClass();
    }
    @After
        public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            supportobj.takeScreenshot();
        }
        driver.close();
}
    public AppiumDriver getDriver(){
        return driver;
    }
}
