@newlaunches
Feature: Nykaa New Launches Page Functionalities

  Scenario: Execute All Functionalities
    Given I am on the New Launches Page
    When I scroll down to the footer of the page
    And I click on the New Launches element
    And I verify that the text "Launches" is present
    And I hover over the Natural element
    And I click on the Face Wash element "Natural"
    And I verify that the text "Wash" is present
    And I click on the price filter option of new launches
    And I select a specific price range filter "Applied"
    And I click on the first product link and switch to its page
    And I click on the pin code input field
    And I input a pin code "620001"
    And I click the check button
    And I click on the Add to Bag button
    And I click on the cart icon to view the added product
    Then I verify that the bag contains the "Bag"
