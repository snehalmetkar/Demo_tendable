Feature: Verify Tendable Website Homepage

  #Scenario: verify Top level menu's
    #Given user is able to access tendable site
    #When home page is displayed
    #Then user is able to access "Our Story " menu
    #And  user is able to access "Our Solution " menu
    #And  user is able to access "Why Tendable? " menu
    
   Scenario: verify contact us
    Given user is able to access tendable site
    When user is click on "contact us" menu
    And  Click on Marketing 
    And  Fill up the form
    And  On submission error is displayed