Feature:Nykaa Toner Page Operations
Scenario:Perform all actions on the Nykaa Toner Page
  Given I enter "TONER" in the search bar
  When I press the Enter key
  And I click on Sort By
  And I select New Arrivals
  And I scroll and click on the Average Customer Rating filter
  And I select a specific rating
  And I click on the first product
  And I click on Add to Bag
  And I verify the product description "Description"
  And I click on the Ingredients section
  Then I click on Read More and capture a screenshot for verification