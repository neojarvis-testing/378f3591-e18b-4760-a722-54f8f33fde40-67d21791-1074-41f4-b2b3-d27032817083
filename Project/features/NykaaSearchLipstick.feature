Feature: Nykaa Search Lipstick Page Operations

  Scenario: Perform all actions on the Nykaa Search Lipstick Page
    Given I enter liquid lipstick in the search bar "Liquid Lipstick"
    When I press the Enter key to search for liquid lipstick
      And I hover over the first product
      And I click on Preview Shades 
      And I verify  Select a Shade "Select A Shade"
      And I click on View Details to switch to the product details page
      And I click on the down arrow in the dropdown menu
      And I select the third option from the dropdown menu
      And I scroll to the footer of the page
      And I click on Contact Us
      And I verify Browse Topics "Browse Topics"
      And I click on the Nykaa account section
      And I click on My Wishlist and take a screenshot
      And I click on Add Items
      Then I verify Was this helpful "Was this helpful" and screenshots should be captured for verification