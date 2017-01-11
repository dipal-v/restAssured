import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 15/09/2016.
 */
public class AccountauthorityPage implements BasePage{

    By updatesLink = By.xpath("//ul[@id='navTree']/li[4]/span");
    By accountdetailsLink = By.xpath("//ul[@id='navTree']/li[4]/ul/li/span/a");
    By imntextField = By.id("MainContent_txtIMN");
    By completeButton = By.id("MainContent_cmdComplete");


    public String gettransactioId(By trnId)
    {


        String abc = driver.findElement(trnId).getText();
        String def = abc.substring(12,20);
        //int g = Integer.valueOf(def);
        System.out.println("Account Authority ID :- " + def);
        return def;
    }





}
