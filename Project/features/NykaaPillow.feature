
Feature: Nykaa Pillow Page Functionalities

  Scenario: Execute All Functionalities
    Given I am on the Pillow Page
    When I click on the search bar fo pillow page
    And I input "Pillow" in the search bar
    And I hit Enter of pillow page 
    And I verify that the search results contain "Pillow"
    And I click on the price filter option
    And I select a specific price range filter
    And I click on the discount filter option
    And I select a specific discount range filter
    And I click on the average customer rating filter option
    And I select a four-star rating filter option
    And I verify that the applied filters are displayed correctly "Applied"
    And I click first product of pillow Page
    And I add the product to add to bag
    And I click on cart of the particular product
    Then I verify the "Bag"
