Feature:Nykaa Help Page Operations
Scenario: Perform all actions on Nykaa Help Page
  Given I have navigated to the Help page
    When I click on Order Related
    And I verify the text "Order Related"
    And I click on Order Status
    And I verify Order Status "Order Status"
    And I navigate back to Order Related page
    And I click on Returns and Refunds 
    And I verify Can I return part of my order? "Can I return part of my order?"
    And I navigate back to the Order Related page
    And I click on Cancellation and Refunds
    And I click on Cancel Policy
    And I click on the Cancellation Policy Link
    Then I verify the URL "https://www.nykaa.com/cancellation-policy/lp" and screenshot should be captured for verification