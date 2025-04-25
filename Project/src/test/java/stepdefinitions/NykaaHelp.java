package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaHelpPage;

public class NykaaHelp {
    static ExtentTest test=Hooks.reports.createTest("Nykaa Help Page Test Case");
    NykaaHelpPage helpPage=new NykaaHelpPage(test);
    @Given("I have navigated to the Help page")
public void i_have_navigated_to_the_help_page() {
     helpPage.clickOnHelp();
     
}
@When("I click on Order Related")
public void i_click_on_order_related() {
     helpPage.clickOnOrderRelated();
     
}
@When("I verify the text {string}")
public void i_verify_the_text(String string) {
     helpPage.verifyOrderRelatedText(string);
     
}
@When("I click on Order Status")
public void i_click_on_order_status() {
     helpPage.clickOnOrderStatus();
     
}

@When("I verify Order Status {string}")
public void i_verify_order_status(String string) {
    helpPage.verifyOrderStatustext(string);
}
@When("I navigate back to Order Related page")
public void i_navigate_back_to_order_related_page() {
     helpPage.navigateBackToOrderRelated();
     
}
@When("I click on Returns and Refunds")
public void i_click_on_returns_and_refunds() {
     helpPage.clickOnRefund();
     
}
@When("I verify Can I return part of my order? {string}")
public void i_verify_can_i_return_part_of_my_order(String string) {
   helpPage.verifyCanIReturn(string);
}
@When("I navigate back to the Order Related page")
public void i_navigate_back_to_the_order_related_page() {
     helpPage.navigateBackToOrderRelated();
     
}
@When("I click on Cancellation and Refunds")
public void i_click_on_cancellation_and_refunds() {
     helpPage.clickOnCanceellationAndRefunds();
     
}
@When("I click on Cancel Policy")
public void i_click_on_cancel_policy() {
     helpPage.clickOnCancelPolicy();
     
}
@When("I click on the Cancellation Policy Link")
public void i_click_on_the_cancellation_policy_link() {
     helpPage.clickOncancellationLink();
     
}
@Then("I verify the URL {string} and screenshot should be captured for verification")
public void i_verify_the_url_and_screenshot_should_be_captured_for_verification(String string) {
     helpPage.verifyCancelPolicyLink(string);
     
}

}
