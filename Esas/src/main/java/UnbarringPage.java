import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 30/08/2016.
 */
public class UnbarringPage implements BasePage {

    By queriesLink = By.xpath("//ul[@id='navTree']/li[5]");
    By unbarringLink = By.linkText("(Un)Barring");
    By confirmUnbarringpage = By.id("MainContent_PageTitle");
    By imnTextfield = By.id("MainContent_txtIMN");
    By queryButton = By.id("MainContent_cmdQuery");


    public String gettransactioId(By trnId)
    {


        String abc = driver.findElement(trnId).getText();
        String def = abc.substring(12,20);
        //int g = Integer.valueOf(def);
        System.out.println("Unbarring ID :- " + def);
        return def;
    }





}
