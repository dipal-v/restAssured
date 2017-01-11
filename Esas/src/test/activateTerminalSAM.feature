

Feature: Activation of Terminal by SAM
  Background: : PSA can login with valid credentials
    Given SAM is on Login Page
    And He enters Username as 'ECSRIN13' n password as 'ECSRIN13'
    And enters the site to surf
    Then He should be go to Home Page





  Scenario: SAM should be able to activate a terminal with different AA Code - Canada
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects 'INMARSAT'
    And He goes Forward
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He Goess Forward
    Then He selects System as 'Inmarsat-C' for terminal activation
    Then selects manufacturer as '4EB - ABB NERA A.S.'
    And he selects model as '4EB010 - SATURN C MARINE'
    Then He selectss forward
    Then He selects the row to enter serial number
    And He enters serial number as '1111111'
    And He selects the row to enter IMN number
    And enters IMN number as '431601316'
    And He goes Forward from service details page
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    Then He confirms he is at vessel details page by confirming 'Vessel Name'
    And Enters vessel name as 'Automation Test Vessel'
    And goes forward from vessel details page
    Then make sure he is on certification page 'Certification (T20)'
    And Enters his name 'Automation Contractor'
    And agrees to licence
    And completes activation
    Then He gets the transaction id





  Scenario: SAM should be able to activate a terminal - Canada
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects 'INMARSAT'
    And He goes Forward
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He Goess Forward
    Then He selects System as 'Inmarsat-C' for terminal activation
    Then selects manufacturer as '4EB - ABB NERA A.S.'
    And he selects model as '4EB010 - SATURN C MARINE'
    Then He selectss forward
    Then He selects the row to enter serial number
    And He enters serial number as '1111111'
    And He selects the row to enter IMN number
    And enters IMN number as '431601316'
    And He goes Forward from service details page
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    Then He confirms he is at vessel details page by confirming 'Vessel Name'
    And Enters vessel name as 'Automation Test Vessel'
    And goes forward from vessel details page
    Then make sure he is on certification page 'Certification (T20)'
    And Enters his name 'Automation Contractor'
    And agrees to licence
    And completes activation
    Then He gets the transaction id




  Scenario: SAM should be able to activate a terminal  - USA
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects '267TH COMBAT COMMUNICATION SQUADRON'
    And He goes Forward
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He Goess Forward
    Then He selects System as 'Inmarsat-C' for terminal activation
    Then selects manufacturer as '4EB - ABB NERA A.S.'
    And he selects model as '4EB010 - SATURN C MARINE'
    Then He selectss forward
    Then He selects the row to enter serial number
    And He enters serial number as '1111111'
    And He selects the row to enter IMN number
    And enters IMN number as '431601316'
    And He goes Forward from service details page
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    Then He confirms he is at vessel details page by confirming 'Vessel Name'
    And Enters vessel name as 'Automation Test Vessel'
    And goes forward from vessel details page
    Then make sure he is on certification page 'Certification (T20)'
    And Enters his name 'Automation Contractor'
    And agrees to licence
    And completes activation
    Then He gets the transaction id



  Scenario: SAM should be able to activate a terminal with different AA Code - AUSTRALIA
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects 'AUSTRAL FISHERIES PTY LTD'
    And He goes Forward
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He Goess Forward
    Then He selects System as 'Inmarsat-C' for terminal activation
    Then selects manufacturer as '4EB - ABB NERA A.S.'
    And he selects model as '4EB010 - SATURN C MARINE'
    Then He selectss forward
    Then He selects the row to enter serial number
    And He enters serial number as '1111111'
    And He selects the row to enter IMN number
    And enters IMN number as '431601316'
    And He goes Forward from service details page
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    Then He confirms he is at vessel details page by confirming 'Vessel Name'
    And Enters vessel name as 'Automation Test Vessel'
    And goes forward from vessel details page
    Then make sure he is on certification page 'Certification (T20)'
    And Enters his name 'Automation Contractor'
    And agrees to licence
    And completes activation
    Then He gets the transaction id



  Scenario: SAM should be able to activate terminal for UK based customer.
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects 'BRITISH BROADCASTING CORPORATION'
    And He goes Forward
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He Goess Forward
    Then He selects System as 'Inmarsat-C' for terminal activation
    Then selects manufacturer as '4EB - ABB NERA A.S.'
    And he selects model as '4EB010 - SATURN C MARINE'
    Then He selectss forward
    Then He selects the row to enter serial number
    And He enters serial number as '1111111'
    And He selects the row to enter IMN number
    And enters IMN number as '431601316'
    And He goes Forward from service details page
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    Then He confirms he is at vessel details page by confirming 'Vessel Name'
    And Enters vessel name as 'Automation Test Vessel'
    And goes forward from vessel details page
    Then make sure he is on certification page 'Certification (T20)'
    And Enters his name 'Automation Contractor'
    And agrees to licence
    And completes activation
    Then He gets the transaction id



  Scenario: SAM should be able to activate terminal from template - UK based customer.

    Given Sam is on home page
    When He selects New Template
    Then He selects first Template
    Then He selects create Template
    Then He selects the row to enter serial number from template
    And He enters serial number for template as '1111111'
    And He goes Forward from template serial entry
    And he selects address button in emergency contact page
    And He uses that address
    And He goes Forward confirming that address
    And He goes forward selecting aa as 'NL01 - XANTIC BV'
    And He goes forward from MES page
    And He enters inm number for template activation as '431601316'
    And Then he goes forward from template inm page
    And Then he again goes forward from next page
    And he goes forward from installation details page
    And he saves details on certification page
    Then He gets the transaction id


