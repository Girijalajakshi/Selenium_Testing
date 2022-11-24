Feature: working on chromebrowser

  Scenario: opening amazon page
    Given user capture all the links and use navigate back method
    When user get the title and url of the page
    Then user needs to store them in excel and capture screenshot
    And close the browser
