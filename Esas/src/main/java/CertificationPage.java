import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 11/08/2016.
 */
public class CertificationPage implements BasePage {

    By certificationtextField = By.xpath("//span[@id='MainContent_PageTitle']");
    By certificatenameField = By.xpath("//input[@id='MainContent_txtApplicant']");
    By licenceagreeField = By.xpath("//input[@id='MainContent_chkPSALegal']");
    By completeField = By.xpath("//input[@id='MainContent_cmdComplete']");
    By transactionidStringField = By.xpath("//span[@id='MainContent_MessageLabel']");
    By page = By.tagName("page");




    public String gettransactioId(By trnId)
    {


        String abc = driver.findElement(trnId).getText();
        String def = abc.substring(12,20);
        //int g = Integer.valueOf(def);
        System.out.println("Activation ID :- " + def);
        return def;
    }



}
