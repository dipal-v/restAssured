



Feature: Deactivation of Terminal by PSA
  Background: : SAM can login with valid credentials
    Given SAM is on Login Page
    And He enters Username as 'ECSR1070' n password as 'ECSR1070'
    And enters the site to surf
    Then He should be go to Home Page




  Scenario: Sam should be able to de-activate a terminal - Canada
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects 'STRATOS TESTING'
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
    Then He selects deactivation link
    And He selects new deactivation
    And He selects 'IMN' from record type dropdown menu
    And Enters IMN value as '331600260'
    And He completes the transaction
    And Gets deactivation id



  Scenario: Sam should be able to de-activate a terminal - USA
    Given Sam is on home page
    When He selects New Activation
    Then He should see 'New Registration (T20)'
    When He selects forward
    Then He should go to 'Owner Details (T20)' page
    When He selects address
    Then He should be able see 'Address Book'
    When He selects '149TH COMBAT COMMUNICATION SQUADRON'
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
    Then He selects deactivation link
    And He selects new deactivation
    And He selects 'IMN' from record type dropdown menu
    And Enters IMN value as '331600260'
    And He completes the transaction
    And Gets deactivation id







  Scenario: Sam should be able to de-activate a terminal - UK
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
    Then He selects deactivation link
    And He selects new deactivation
    And He selects 'IMN' from record type dropdown menu
    And Enters IMN value as '331600260'
    And He completes the transaction
    And Gets deactivation id







  Scenario: Sam should be able to de-activate a terminal - Australia
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
    Then He selects deactivation link
    And He selects new deactivation
    And He selects 'IMN' from record type dropdown menu
    And Enters IMN value as '331600260'
    And He completes the transaction
    And Gets deactivation id