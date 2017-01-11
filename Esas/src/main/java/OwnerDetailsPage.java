import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 11/07/2016.
 */
public class OwnerDetailsPage implements BasePage
{
    By ownerdetailsField = By.xpath("//span[@id='MainContent_PageTitle']");
    By addressbookField = By.id("MainContent_cmdAddressBook");
    By addressesField = By.xpath("//select[@id='MainContent_lstAddressList']");
    By useAddressField = By.xpath("//input[@id='MainContent_cmdOK']");
    By forwrdButtonField = By.id("MainContent_cmdSave");
    By aacodeDropdownField = By.id("MainContent_ddlAA");
    By manufacDropdownField = By.xpath("//select[@id='MainContent_ddlManufacturer']");
    By manuModelField = By.xpath("//select[@id='MainContent_ddlModel']");
    By imnField = By.xpath("//table/tbody/tr[2]/td[4]/input");
    By rowforsrNo = By.xpath("//input[@id='MainContent_txtSerialNo']");
    By rowforIMN = By.xpath("//table/tbody/tr[2]/td/input");
    By addressbookButton = By.xpath("//input[@id='MainContent_cmdAddressBook']");
    By useButton = By.xpath("//input[@id='MainContent_cmdOK']");
    By systemField = By.xpath("//select[@id='MainContent_ddlStandard']");
    By templaterowforsrNo = By.xpath("//input[@id='MainContent_txtForwardID']");
    By templateforwardButton = By.xpath("//input[@id='MainContent_cmdForward']");




    public void makesureOwnerDetailsPage(By msgField, String msgTxt)
    {
        Assert.assertTrue(driver.findElement(msgField).getText().contains(msgTxt));
    }



}
