
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Dipal Vyas on 05/07/2016.
 */
public class LoginPage implements BasePage {

    //Locators
    By usernameTextfield = By.id("txtUsername");
    By passwordTextfield = By.id("txtPassword");
    By loginButton = By.id("cmdOK");
    By activationlinkField = By.xpath("//ul[@id='navTree']/li[2]");
    String welcomeText = "Activation";


    public void openBrowser()
    {
       // System.setProperty("webdriver.gecko.driver", "C:/Automation/selenium/Gecko/geckodriver.exe");
        //driver.get("http://10.130.231.25/Login.aspx");
       driver.get("http://esas3001test-int.inmarsat.com/Login.aspx");
    }

    public void login(By usernmField, String userName, By passwordField, String passWord ) {
        driver.findElement(usernmField).clear();
        driver.findElement(usernmField).sendKeys(userName);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(passWord);
    }
    public void sureLoginpage()
    {
        Assert.assertTrue(driver.findElement(activationlinkField).getText().contains(welcomeText));
    }
}
