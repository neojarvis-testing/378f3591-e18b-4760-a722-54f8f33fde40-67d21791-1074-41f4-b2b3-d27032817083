Feature: Nykaa Get App Page Operations

  Scenario: Perform all actions on Nykaa Get App Page
      Given I click on Get App and switch to the corresponding tab
      When I verify the Beauty to go "Beauty to go" heading
      And I enter a valid mobile number in the input field "9123456789"
      And I click on Terms & Conditions 
      And I verify the Terms & Conditions "Terms & Conditions"
      And I click on Shipping Policy 
      And I verify Delivery process question "How does the delivery process work?"
      And I click on Privacy Policy
      And I verify its Privacy Policy "Privacy Policy"
      And I scroll to the Offer Zone and switch to its tab
      Then I verify the URL of the Offer Zone page "https://www.nykaa.com/sp/offers-native/offers?utm_source=Desktop_web_footer" and screenshots should be captured for verification