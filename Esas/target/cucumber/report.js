$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("activateTerminalPSA.feature");
formatter.feature({
  "line": 4,
  "name": "Activation of Terminal by PSA",
  "description": "",
  "id": "activation-of-terminal-by-psa",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": ": PSA can login with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "SAM is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "He enters Username as \u0027ECSR1070\u0027 n password as \u0027ECSR1070\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters the site to surf",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "He should be go to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.samIsOnLoginPage()"
});
formatter.result({
  "duration": 16191238180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ECSR1070",
      "offset": 23
    },
    {
      "val": "ECSR1070",
      "offset": 48
    }
  ],
  "location": "MyStepdefs.heEntersUsernameandPassword(String,String)"
});
formatter.result({
  "duration": 755945390,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.entersTheSiteToSurf()"
});
formatter.result({
  "duration": 1302467042,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heShouldBeGoToHomePage()"
});
formatter.result({
  "duration": 359175820,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "PSA should be able to activate a terminal with different AA Code - Canada",
  "description": "",
  "id": "activation-of-terminal-by-psa;psa-should-be-able-to-activate-a-terminal-with-different-aa-code---canada",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@dipal"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Sam is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "He selects New Activation",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "He should see \u0027Account Verification (T20)\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "He selects forward",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "He should go to the \u0027New Registration (T20)\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "He selects forward",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "He should go to \u0027Owner Details (T20)\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "He selects address",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "He should be able see \u0027Address Book\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "He selects \u0027STRATOS TESTING\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "He goes Forward",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "He selects aa code as \u0027AA07 - STRATOS GLOBAL CORPORATION\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "He Goess Forward",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "He selects System as \u0027Inmarsat-C\u0027 for terminal activation",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "selects manufacturer as \u00274EB - ABB NERA A.S.\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "he selects model as \u00274EB010 - SATURN C MARINE\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "He selectss forward",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "He selects the row to enter serial number",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "He enters serial number as \u00271111111\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "He selects the row to enter IMN number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "enters IMN number as \u0027431601316\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "He goes Forward from service details page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "he selects address button in emergency contact page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "He uses that address",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "He goes Forward confirming that address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "He confirms he is at vessel details page by confirming \u0027Vessel Name\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enters vessel name as \u0027Automation Test Vessel\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "goes forward from vessel details page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "make sure he is on certification page \u0027Certification (T20)\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Enters his name \u0027Automation Contractor\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "agrees to licence",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "completes activation",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "He gets the transaction id",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.samIsOnHomePage()"
});
formatter.result({
  "duration": 286268040,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsNewActivation()"
});
formatter.result({
  "duration": 804534364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Verification (T20)",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.heShouldSeeNewRegistrationT(String)"
});
formatter.result({
  "duration": 298579157,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsForward()"
});
formatter.result({
  "duration": 940970896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Registration (T20)",
      "offset": 21
    }
  ],
  "location": "MyStepdefs.heShouldGoToTheNewRegistrationTPage(String)"
});
formatter.result({
  "duration": 68037772,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsForward()"
});
formatter.result({
  "duration": 3906499324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Owner Details (T20)",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.heShouldGoToOwnerDetailsTPage(String)"
});
formatter.result({
  "duration": 76405226,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsAddress()"
});
formatter.result({
  "duration": 1339252695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address Book",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.heShouldBeAbleSeeAddressBook(String)"
});
formatter.result({
  "duration": 92882220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "STRATOS TESTING",
      "offset": 12
    }
  ],
  "location": "MyStepdefs.heSelectsINMARSATLIMITED(String)"
});
formatter.result({
  "duration": 2137614544,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heGoesForward()"
});
formatter.result({
  "duration": 1647191691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AA07 - STRATOS GLOBAL CORPORATION",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.heSelectsAaCodeAsAASTRATOSGLOBALCORPORATIONPLC(String)"
});
formatter.result({
  "duration": 484738053,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heGoessForward()"
});
formatter.result({
  "duration": 1392763883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inmarsat-C",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.heSelectsSystemAsInmarsatCForTerminalActivation(String)"
});
formatter.result({
  "duration": 375739827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4EB - ABB NERA A.S.",
      "offset": 25
    }
  ],
  "location": "MyStepdefs.selectsManufacturerAsTAINMARSATTYPEAPPROVALTESTING(String)"
});
formatter.result({
  "duration": 1037343868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4EB010 - SATURN C MARINE",
      "offset": 21
    }
  ],
  "location": "MyStepdefs.heSelectsModelAsTATAMARITMEB(String)"
});
formatter.result({
  "duration": 967957185,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectssForward()"
});
formatter.result({
  "duration": 973073950,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsTheRowToEnterSerialNumber()"
});
formatter.result({
  "duration": 130540225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111111",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.heEntersSerialNumberAs(String)"
});
formatter.result({
  "duration": 144163665,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsTheRowToEnterIMNNumber()"
});
formatter.result({
  "duration": 135691796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "431601316",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.entersIMNNumberAs(String)"
});
formatter.result({
  "duration": 172127615,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heGoesForwardFromServiceDetailsPage()"
});
formatter.result({
  "duration": 1810430224,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heSelectsAddressButtonInEmergencyContactPage()"
});
formatter.result({
  "duration": 949768056,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heUsesThatAddress()"
});
formatter.result({
  "duration": 939031193,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heGoesForwardConfirmingThatAddress()"
});
formatter.result({
  "duration": 1180993938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vessel Name",
      "offset": 56
    }
  ],
  "location": "MyStepdefs.heConfirmsHeIsAtVesselDetailsPageByConfirmingVesselName(String)"
});
formatter.result({
  "duration": 60735883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation Test Vessel",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.entersVesselNameAsAutomationTestVessel(String)"
});
formatter.result({
  "duration": 220283758,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.goesForwardFromVesselDetailsPage()"
});
formatter.result({
  "duration": 1011790828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Certification (T20)",
      "offset": 39
    }
  ],
  "location": "MyStepdefs.makeSureHeIsOnCertificationPageCertificationT(String)"
});
formatter.result({
  "duration": 49688005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation Contractor",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.entersHisNameAutomationContractor(String)"
});
formatter.result({
  "duration": 179619591,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.agreesToLicence()"
});
formatter.result({
  "duration": 116793184,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.completesActivation()"
});
formatter.result({
  "duration": 1337072033,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heGetsTheTransactionId()"
});
formatter.result({
  "duration": 58755127,
  "status": "passed"
});
});