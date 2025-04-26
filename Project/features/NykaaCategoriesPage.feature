Feature: Nykaa Categories Page Functionalities

  Scenario Outline: Execute All Functionalities
    Given I verify that I'm in "Categories" Page
    When I clicks on search bar, sends data "Kajal"
    And I verify the text containing "Kajal"
    And I click on Formulation and clicks on the Pencil
    And I hovers over the Fragrance
    And I click New Launches and switch the tab
    And I click on first product and switches the tab
    And I clicks on the Add to Bag button
    And I clicks on the How to Use section
    Then I verify that the text containing "Customers also Viewed" is present