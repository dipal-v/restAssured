import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 11/07/2016.
 */
public class NewRegistratioT20 implements BasePage {

    By newregMsgField = By.id("MainContent_PageTitle");
    By forwardButtonField = By.id("MainContent_cmdForward");


    public void makesureNewregPage(By msgField, String msgTxt)
    {
       // System.setProperty("webdriver.gecko.driver", "C:/Automation/selenium/Gecko/geckodriver.exe");
       Assert.assertTrue(driver.findElement(msgField).getText().contains(msgTxt));
    }
}
