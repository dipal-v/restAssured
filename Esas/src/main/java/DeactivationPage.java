import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 24/08/2016.
 */
public class DeactivationPage implements BasePage {

    By deactivationLink = By.xpath("//ul[@id='navTree']/li[2]");
    By newdeactivationLink = By.linkText("New Deactivation");
    By recordtypeDropdown = By.xpath("//select[@id='MainContent_ddlRecordType']");
    By imnTextbox = By.xpath("//input[@id='MainContent_txtIMN']");
    By completeButton = By.xpath("//input[@id='MainContent_cmdComplete']");



    public String gettransactioId(By trnId)
    {


        String abc = driver.findElement(trnId).getText();
        String def = abc.substring(12,20);
        //int g = Integer.valueOf(def);
        System.out.println("Deactivation ID :- " + def);
        return def;
    }



}
