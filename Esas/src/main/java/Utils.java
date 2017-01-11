import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by dipal vyas on 11/07/2016.
 */
public class Utils implements BasePage {

    public void maximizeWindow() {

        driver.manage().window().maximize();
    }


    public void waitelementAppear(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


    public void cliclElement(By element) {
        driver.findElement(element).click();
    }



    public void verifyElementPresent(By avail) {

        Assert.assertTrue(driver.findElement(avail).isDisplayed());
    }

    public void makesureonsamePage(By msgField, String msgTxt)
    {
        Assert.assertTrue(driver.findElement(msgField).getText().contains(msgTxt));
    }


    public void smallWait() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // Thread.sleep(5000);
    }
    public void selectfromDropdown(By dropdownField, String companyName)
    {
        Select dropdown = new Select(driver.findElement(dropdownField));
        dropdown.selectByVisibleText(companyName);
    }

    public void writeintextField(By textField, String text)
    {
        driver.findElement(textField).clear();
        driver.findElement(textField).sendKeys(text);
    }

    public void makesurelementText(By fieldtogetText, String texttoCompare)
    {
        Assert.assertTrue(driver.findElement(fieldtogetText).getText().contains(texttoCompare));

    }
}
