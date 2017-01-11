import org.openqa.selenium.By;

/**
 * Created by dipal vyas on 26/08/2016.
 */
public class BarringPage implements BasePage{

    By barringLink = By.xpath("//ul[@id='navTree']/li[3]");
    By imnbarTxtbox = By.xpath("//input[@id='MainContent_txtIMN']");
    By completebarringButton = By.xpath("//input[@id='MainContent_cmdComplete']");
    By newbarringLink = By.linkText("New Barring");


    public String gettransactioId(By trnId)
    {


        String abc = driver.findElement(trnId).getText();
        String def = abc.substring(12,20);
        //int g = Integer.valueOf(def);
        System.out.println("Barring ID :- " + def);
        return def;
    }


}
