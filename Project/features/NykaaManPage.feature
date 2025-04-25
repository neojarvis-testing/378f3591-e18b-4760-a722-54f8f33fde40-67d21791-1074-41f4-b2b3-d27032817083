Feature: Nykaa Man Page Functionalities

  Scenario: Execute Nykaa Man Page Workflow
    Given I clicks on Nykaa Man
    When I hover on Health and Nutrition
    And I clicks on Whey Protein and switches to a new window
    And I verifies the text whey protein "Buy Whey Protein For Men Online"
    And I verifies the "3" text
    And I clicks on 2 pagination
    And clicks on the first product
    And enters the pincode "600001"
    And clicks on the check button
    And verifies the text chennai "Chennai"
    And scrolls to the Write a Review section and clicks on it
    Then verifies the "Sign in" text