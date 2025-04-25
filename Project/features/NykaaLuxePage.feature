Feature: Nykaa Luxe Home Page Functionalities

  Scenario: Execute Nykaa Luxe Page Workflow
    Given I scroll to Nykaa Luxe Footer Section
    When I click on Luxe 
    And I verify the text Luxe "Luxe"
    And I click on Sort by Popularity
    And I click on Customer Top Rated
    And I click on Gender
    And I click on Unisex 
    And I verifies the text "Unisex"
    And I click on Occasion
    And I click on Day Wear
    And I scroll to the footer again
    And I click on Nykaa Man
    And I click on Grooming Advice
    Then I verifies elements text Shaving "SHAVING & BEARD CARE"