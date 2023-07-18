package Support;

import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

public class World {


    final AppiumDriver driver = new Hook().getDriver();

    public static test1 test1obj;

   public  static Support supportobj;

    public void driverClass() {
        World.test1obj= new test1(driver);
        World.supportobj = new Support(driver);
    }

}
