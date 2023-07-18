package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class test1 {
    private final AppiumDriver driver;

    public test1(AppiumDriver driver) {
    this.driver = driver;
       PageFactory.initElements(driver, this);
           }

    @FindBy(xpath = "//span[@class='logSprite icClose']")
    private WebElement popup;

    public void closePopup() {
        System.out.println("test objext inside");
        driver.get("https://www.goibibo.com/");
        popup.click();

    }

}