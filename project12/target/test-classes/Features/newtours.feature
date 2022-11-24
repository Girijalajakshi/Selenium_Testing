Feature: working on newtours page

  Scenario Outline: web application
    Given user is in newtours page
    When user enters <uname>  and  <password>
    Then user clicks login button
    And user back to home page

    Examples: 
      | uname   | password |
      | mercury | merucury |
