import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Dipal Vyas on 05/07/2016.
 */
public class MyStepdefs {


    LoginPage loginpage = new LoginPage();
    Utils utils = new Utils();
    HomePage homepage = new HomePage();
    NewRegistratioT20 newregistrationT20 = new NewRegistratioT20();
    OwnerDetailsPage ownerdetailspage = new OwnerDetailsPage();
    VesselDetailsPage vesseldetailspage = new VesselDetailsPage();
    CertificationPage certificationpage = new CertificationPage();
    DeactivationPage deactivationpage = new DeactivationPage();
    BarringPage barringPage = new BarringPage();
    UnbarringPage unbarringPage = new UnbarringPage();
    AccountauthorityPage accountAuthoritypage = new AccountauthorityPage();
    TemplatePage templatepage = new TemplatePage();
    BillingdetailsPage billingdetailspage = new BillingdetailsPage();
    MestypeDetails mestypedetails = new MestypeDetails();
    ServiceDetails servicedetails = new ServiceDetails();



    @Given("^SAM is on Login Page$")
    public void samIsOnLoginPage()
    {
        loginpage.openBrowser();
        utils.maximizeWindow();
     }

    @And("^He enters Username as '(.+)' n password as '(.+)'$")
    public void heEntersUsernameandPassword(String un, String ps)
    {
     loginpage.login(loginpage.usernameTextfield,un,loginpage.passwordTextfield,ps);
        utils.waitelementAppear(loginpage.usernameTextfield);

    }

    @And("^enters the site to surf$")
    public void entersTheSiteToSurf() throws InterruptedException {
        utils.cliclElement(loginpage.loginButton);
        utils.smallWait();

    }

    @Then("^He should be go to Home Page$")
    public void heShouldBeGoToHomePage() {
    loginpage.sureLoginpage();
    }


    @Given("^Sam is on home page$")
    public void samIsOnHomePage()  {
        loginpage.sureLoginpage();
    }

    @When("^He selects New Activation$")
    public void heSelectsNewActivation() throws InterruptedException {
        utils.cliclElement(homepage.newActivation);
        utils.smallWait();
       }

    @Then("^He should see '(.+)'$")
    public void heShouldSeeNewRegistrationT(String abc) throws InterruptedException {
        newregistrationT20.makesureNewregPage(newregistrationT20.newregMsgField, abc);
        utils.smallWait();
    }

    @When("^He selects forward$")
    public void heSelectsForward()
    {
       utils.cliclElement(newregistrationT20.forwardButtonField);
    }

    @Then("^He should go to '(.+)' page$")
    public void heShouldGoToOwnerDetailsTPage(String ownrDetl)
    {
        ownerdetailspage.makesureOwnerDetailsPage(ownerdetailspage.ownerdetailsField,ownrDetl);
    }

    @When("^He selects address$")
    public void heSelectsAddress() throws InterruptedException {
        utils.cliclElement(ownerdetailspage.addressbookField);
        utils.smallWait();
        utils.smallWait();
    }

    @Then("^He should be able see '(.+)'$")
    public void heShouldBeAbleSeeAddressBook(String adrbkFld)
    {
        ownerdetailspage.makesureOwnerDetailsPage(ownerdetailspage.ownerdetailsField,adrbkFld);
    }


    @When("^He selects '(.+)'$")
    public void heSelectsINMARSATLIMITED(String addrTxt)
    {
        utils.selectfromDropdown(ownerdetailspage.addressesField,addrTxt);
        utils.cliclElement(ownerdetailspage.useAddressField);
    }

    @And("^He goes Forward$")
    public void heGoesForward() throws InterruptedException {
        utils.cliclElement(ownerdetailspage.forwrdButtonField);
        utils.smallWait();
    }

    @Then("^He selects System as '(.+)' for terminal activation$")
    public void heSelectsSystemAsInmarsatCForTerminalActivation(String sysName) {
        utils.selectfromDropdown(ownerdetailspage.systemField, sysName);
    }



    @Then("^He selects aa code as '(.+)'$")
    public void heSelectsAaCodeAsAASTRATOSGLOBALCORPORATIONPLC(String aaCode)  {
        utils.selectfromDropdown(ownerdetailspage.aacodeDropdownField, aaCode);
    }



    @And("^He Goess Forward$")
    public void heGoessForward()
    {
        utils.cliclElement(ownerdetailspage.forwrdButtonField);
    }

    @Then("^selects manufacturer as '(.+)'$")
    public void selectsManufacturerAsTAINMARSATTYPEAPPROVALTESTING(String manuFacturer)
    {
        utils.selectfromDropdown(ownerdetailspage.manufacDropdownField, manuFacturer);
    }

    @And("^he selects model as '(.+)'$")
    public void heSelectsModelAsTATAMARITMEB(String model) {

        utils.selectfromDropdown(ownerdetailspage.manuModelField, model);

         }


    @Then("^He selectss forward$")
    public void heSelectssForward(){
        utils.cliclElement(ownerdetailspage.forwrdButtonField);
    }


    @Then("^He selects the row to enter serial number$")
    public void heSelectsTheRowToEnterSerialNumber(){
        utils.cliclElement(ownerdetailspage.rowforsrNo);
    }

    @And("^He enters serial number as '(.+)'$")
    public void heEntersSerialNumberAs(String serialNo) {
        utils.writeintextField(ownerdetailspage.rowforsrNo, serialNo);
    }

    @And("^He selects the row to enter IMN number$")
    public void heSelectsTheRowToEnterIMNNumber(){

        utils.cliclElement(ownerdetailspage.rowforIMN);

    }

    @And("^enters IMN number as '(.+)'$")
    public void entersIMNNumberAs(String imnNo) {

        utils.writeintextField(ownerdetailspage.imnField, imnNo);
    }

    @And("^He goes Forward from service details page$")
    public void heGoesForwardFromServiceDetailsPage() throws InterruptedException {

        utils.smallWait();
        utils.smallWait();
        utils.cliclElement(ownerdetailspage.forwrdButtonField);

          }


    @And("^he selects address button in emergency contact page$")
    public void heSelectsAddressButtonInEmergencyContactPage(){
       utils.cliclElement(ownerdetailspage.addressbookButton);
    }

    @And("^He uses that address$")
    public void heUsesThatAddress(){
        utils.cliclElement(ownerdetailspage.useButton);
    }

    @And("^He goes Forward confirming that address$")
    public void heGoesForwardConfirmingThatAddress() {
       utils.cliclElement(ownerdetailspage.forwrdButtonField);
    }

       @Then("^He confirms he is at vessel details page by confirming '(.+)'$")
    public void heConfirmsHeIsAtVesselDetailsPageByConfirmingVesselName(String vesName) {
        utils.makesureonsamePage(vesseldetailspage.vessnameField,vesName);
    }

    @And("^Enters vessel name as '(.+)'$")
    public void entersVesselNameAsAutomationTestVessel(String vesselName) {
       utils.writeintextField(vesseldetailspage.vessnametextField,vesselName);
    }

    @And("^goes forward from vessel details page$")
    public void goesForwardFromVesselDetailsPage() {
        utils.cliclElement(ownerdetailspage.forwrdButtonField);
    }


    @Then("^make sure he is on certification page '(.+)'")
    public void makeSureHeIsOnCertificationPageCertificationT(String cerText) {
        utils.makesureonsamePage(certificationpage.certificationtextField,cerText);
    }


    @And("^Enters his name '(.+)'$")
    public void entersHisNameAutomationContractor(String certName) {
        utils.writeintextField(certificationpage.certificatenameField, certName);
    }

    @And("^agrees to licence$")
    public void agreesToLicence() {
        utils.cliclElement(certificationpage.licenceagreeField);
    }

    @And("^completes activation$")
    public void completesActivation() {
       utils.cliclElement(certificationpage.completeField);
    }


    @Then("^He gets the transaction id$")
    public void heGetsTheTransactionId() throws InterruptedException {
      //  utils.smallWait();
      //  utils.smallWait();
        certificationpage.gettransactioId(certificationpage.transactionidStringField);
    }

    @Then("^He selects deactivation link$")
    public void heSelectsDeactivationLink() {
       utils.cliclElement(deactivationpage.deactivationLink);
    }

    @And("^He selects new deactivation$")
    public void heSelectsNewDeactivation() {
        utils.cliclElement(deactivationpage.newdeactivationLink);
    }

    @And("^He selects '(.+)' from record type dropdown menu$")
    public void heSelectsIMNFromRecordTypeDropdownMenu(String rectype) {

        utils.selectfromDropdown(deactivationpage.recordtypeDropdown,rectype);
    }

    @And("^Enters IMN value as '(.+)'$")
    public void entersIMNValueAs (String imnVal){
        utils.writeintextField(deactivationpage.imnTextbox, imnVal);
    }

    @And("^He completes the transaction$")
    public void heCompletesTheTransaction() {
      utils.cliclElement(deactivationpage.completeButton);
    }

    @Then("^He selects barring a terminal$")
    public void heSelectsBarringATerminal() {
        utils.cliclElement(barringPage.barringLink);
    }

    @And("^Opens new barring transaction$")
    public void opensNewBarringTransaction() {
        utils.cliclElement(barringPage.newbarringLink);
    }

    @And("^enters IMN number to bar as '(.+)'$")
    public void entersIMNNumberToBarAs(String imnNo) {
        utils.writeintextField(barringPage.imnbarTxtbox,imnNo);
    }

    @And("^He completes the transaction of barring the terminal$")
    public void heCompletesTheTransactionOfBarringTheTerminal() {
        utils.cliclElement(barringPage.completebarringButton);
    }

    @And("^Gets Barring id$")
    public void getsBarringId() {
        barringPage.gettransactioId(certificationpage.transactionidStringField);
    }

    @When("^He selects Queries$")
    public void heSelectsQueries() throws InterruptedException {

        utils.smallWait();
        utils.smallWait();
        utils.cliclElement(unbarringPage.queriesLink);
    }


    @Then("^He selects unbarring$")
    public void heSelectsUnbarring() {
        utils.cliclElement(unbarringPage.unbarringLink);
    }


    @And("^makes sure he is on unbarring page by confirming '(.+)'$")
    public void makesSureHeIsOnUnbarringPageByConfirmingQueryUnBarring(String unbarText) throws InterruptedException {

       // utils.smallWait();
       // utils.smallWait();
      //  utils.smallWait();
        utils.smallWait();
        utils.makesureonsamePage(unbarringPage.confirmUnbarringpage,unbarText);

    }

    @And("^He enters imn number to unbar as '(.+)'$")
    public void heEntersImnNumberToUnbarAs(String imnNo) {

        utils.writeintextField(unbarringPage.imnTextfield,imnNo);
    }


    @And("^Queries that number$")
    public void queriesThatNumber() {
       utils.cliclElement(unbarringPage.queryButton);
    }


    @And("^Gets deactivation id$")
    public void getsDeactivationId() {
       deactivationpage.gettransactioId(certificationpage.transactionidStringField);
    }

    @And("^Gets UnBarring id$")
    public void getsUnBarringId() {
       unbarringPage.gettransactioId(certificationpage.transactionidStringField);
    }

    @Then("^He selects updates$")
    public void heSelectsUpdates() {
        utils.cliclElement(accountAuthoritypage.updatesLink);
    }


    @And("^selects 'Accounting Details'$")
    public void selectsAccountingDetails() {
        utils.cliclElement(accountAuthoritypage.accountdetailsLink);
    }

    @When("^he enters imn number '(.+)' in the imn text field$")
    public void heEntersImnNumberInTheImnTextField(String imnNo) {
        utils.writeintextField(accountAuthoritypage.imntextField, imnNo);
    }

    @Then("^He gets account auuthorisation transaction id$")
    public void heGetsAccountAuuthorisationTransactionId() {
        accountAuthoritypage.gettransactioId(certificationpage.transactionidStringField);
    }

    @When("^He selects New Template$")
    public void heSelectsNewTemplate() {
      utils.cliclElement(homepage.templateActivation);
    }



    @Then("^He selects first Template$")
    public void heSelectsFirstTemplate()  {
       utils.cliclElement(templatepage.t20Transaction);
    }

    @Then("^He selects create Template$")
    public void heSelectsCreateTemplate() {
       utils.cliclElement(templatepage.createfromTemplate);
    }

    @Then("^He selects the row to enter serial number from template$")
    public void heSelectsTheRowToEnterSerialNumberFromTemplate()  {

        utils.cliclElement(ownerdetailspage.templaterowforsrNo);

    }

    @And("^He enters serial number for template as '(.+)'$")
    public void heEntersSerialNumberForTemplateAs (String isno)
    {

        utils.writeintextField(ownerdetailspage.templaterowforsrNo, isno);
    }

    @And("^He goes Forward from template serial entry$")
    public void heGoesForwardFromTemplateSerialEntry()  {
        utils.cliclElement(ownerdetailspage.templateforwardButton);
    }

    @And("^He goes forward selecting aa as '(.+)'$")
    public void heGoesForwardSelectingAaAsNLXANTICBV(String aaName) {
       utils.selectfromDropdown(billingdetailspage.aacodeField, aaName);
        utils.cliclElement(billingdetailspage.aaforwardButton);
    }

    @And("^He goes forward from MES page$")
    public void heGoesForwardFromMESPage() {
      utils.cliclElement(mestypedetails.mesforwardButton);
    }


    @And("^He enters inm number for template activation as '(.+)'$")
    public void heEntersInmNumberForTemplateActivationAs(String imnNo) {
      utils.writeintextField(servicedetails.inmnoField, imnNo);
    }

    @And("^Then he goes forward from template inm page$")
    public void thenHeGoesForwardFromTemplateInmPage() {
      utils.cliclElement(mestypedetails.mesforwardButton);
    }

    @And("^Then he again goes forward from next page$")
    public void thenHeAgainGoesForwardFromNextPage()  {

        utils.cliclElement(mestypedetails.mesforwardButton);

    }

    @And("^he goes forward from installation details page$")
    public void heGoesForwardFromInstallationDetailsPage() {

        utils.cliclElement(mestypedetails.mesforwardButton);
    }

    @And("^he saves details on certification page$")
    public void heSavesDetailsOnCertificationPage() {

        utils.cliclElement(mestypedetails.mesforwardButton);
    }


    @Then("^He should go to the '(.+)' page$")
    public void heShouldGoToTheNewRegistrationTPage(String abc) {
        // Write code here that turns the phrase above into concrete actions
        newregistrationT20.makesureNewregPage(newregistrationT20.newregMsgField, abc);
    }
}
