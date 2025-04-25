
Feature: Nykaa Kurtas Page Functionalities

  Scenario: Execute All Functionalities
    Given I am on the Kurtas Page
    When I click on the search bar
    And I input  in the search bar "Kurtas"
    And I hit Enter
    And I verify that the search results "Kurta"
    And I hover on the sort option
    And I click on the Best Seller option "Sort"
    And I click on the second product "Bestseller"
    And I click on the Size Guide option
    And I verify that the Size Guide "SIZE"
    And I click the cross mark 
    And I click on the Read All Reviews 
    And I verify that the all reviews "ALL"
    And I click on the Helpful "Helpful"
    And I click on the mobile number input field
    And I input a mobile number "9876543210"
    And I click the submit button
    Then I verify that the submit action 
