

Feature: Change Account Authority by PSA
  Background: : PSA can login with valid credentials
    Given SAM is on Login Page
    And He enters Username as 'ECSR1070' n password as 'ECSR1070'
    And enters the site to surf
    Then He should be go to Home Page



  Scenario: PSA should be able to change Account Authority - Canada
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
    Then He selects updates
    And selects 'Accounting Details'
    When he enters imn number '431601316' in the imn text field
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He completes the transaction
    Then He gets account auuthorisation transaction id



  Scenario: PSA should be able to change Account Authority - USA
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
    Then He selects updates
    And selects 'Accounting Details'
    When he enters imn number '431601316' in the imn text field
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He completes the transaction
    Then He gets account auuthorisation transaction id



  Scenario: PSA should be able to change Account Authority - AUSTRALIA
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
    Then He selects updates
    And selects 'Accounting Details'
    When he enters imn number '431601316' in the imn text field
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He completes the transaction
    Then He gets account auuthorisation transaction id



  Scenario: PSA should be able to change Account Authority - UK
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
    Then He selects updates
    And selects 'Accounting Details'
    When he enters imn number '431601316' in the imn text field
    Then He selects aa code as 'AA07 - STRATOS GLOBAL CORPORATION'
    And He completes the transaction
    Then He gets account auuthorisation transaction id


