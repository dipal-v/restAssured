import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.Set;

/**
 * Created by dipal vyas on 12/09/2016.
 */
public class SetDriver {


    public static WebDriver driver() {
        System.setProperty("webdriver.gecko.driver", "C:/Automation/selenium/geckodriver.exe");
        WebDriver abd = new FirefoxDriver();
        return abd;

//        System.setProperty("webdriver.gecko.driver", "path of/geckodriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        WebDriver anc = new FirefoxDriver(capabilities);
//      return anc;

    }



}







