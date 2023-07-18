package Support;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
public class Support {

    private final AppiumDriver driver;

    public Support(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void implicitwaitfun(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void takeScreenshot() throws IOException {
        TakesScreenshot ts= (TakesScreenshot)driver;
        File Sorce = ts.getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/test/RunnerFile/screenshot.jpg");

            }
}
