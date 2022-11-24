Feature: Working on web appliction

  Scenario Outline: dezlearn application
    Given user is in dezlearn application
    When user get the url and title of the page
    Then user works on alert message
    And user captured screenshot and close window
