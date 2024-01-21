Feature: home page of facebook

  Scenario: Opening browser and entering url

    Given I open the browser and enter the url
    When i will enter the un and pwd click on login btn
    Then check for homepage
    Then close the browser