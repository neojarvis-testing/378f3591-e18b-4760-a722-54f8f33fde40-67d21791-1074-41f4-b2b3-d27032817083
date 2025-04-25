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
@When("I click on 'Order Related")
public void i_click_on_order_related() {
         
          
}
@When("I verify the text {string}")
public void i_verify_the_text(String string) {
         
          
}
@When("I click on {string}")
public void i_click_on(String string) {
         
          
}
@When("verify the text {string}")
public void verify_the_text(String string) {
         
          
}
@When("I navigate back to the {string} page")
public void i_navigate_back_to_the_page(String string) {
         
          
}
@When("I click on the {string}")
public void i_click_on_the(String string) {
         
          
}
@Then("I verify the URL and screenshot should be captured for verification")
public void i_verify_the_url_and_screenshot_should_be_captured_for_verification() {
         
          
}
}
