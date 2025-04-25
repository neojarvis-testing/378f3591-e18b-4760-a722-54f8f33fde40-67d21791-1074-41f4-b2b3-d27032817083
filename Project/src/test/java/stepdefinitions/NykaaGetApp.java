package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaGetAppPage;

public class NykaaGetApp {
    ExtentTest test=Hooks.reports.createTest("Get App Page test case");
    NykaaGetAppPage getAppPage=new NykaaGetAppPage(test);
    @Given("I click on Get App and switch to the corresponding tab")
public void i_click_on_get_app_and_switch_to_the_corresponding_tab() {
     getAppPage.clickOnGetApp();
    
}
@When("I verify the Beauty to go {string} heading")
public void i_verify_the_beauty_to_go_heading(String string) {
     getAppPage.verifyBeautyToGo(string);
    
}
@When("I enter a valid mobile number in the input field {string}")
public void i_enter_a_valid_mobile_number_in_the_input_field(String string) {
     getAppPage.enterMobileNumberData(string);
}
@When("I click on Terms & Conditions")
public void i_click_on_terms_conditions() {
     getAppPage.clickOnTermsConditions();
    
}
@When("I verify the Terms & Conditions {string}")
public void i_verify_the_terms_conditions(String string) {
     getAppPage.verifyTermsConditions(string);
    
}
@When("I click on Shipping Policy")
public void i_click_on_shipping_policy() {
     getAppPage.clickOnShippingPolicy();
    
}
@When("I verify Delivery process question {string}")
public void i_verify_delivery_process_question(String string) {
     
    getAppPage.verifyDeliveryProcessQues(string);
}
@When("I click on Privacy Policy")
public void i_click_on_privacy_policy() {
     getAppPage.clickOnPrivacyPolicy();
    
}
@When("I verify its Privacy Policy {string}")
public void i_verify_its_privacy_policy(String string) {
     getAppPage.verifyPrivacyPolicy(string);
    
}
@When("I scroll to the Offer Zone and switch to its tab")
public void i_scroll_to_the_offer_zone_and_switch_to_its_tab() {
     getAppPage.clickOnOfferZone();
    
}
@Then("I verify the URL of the Offer Zone page {string} and screenshots should be captured for verification")
public void i_verify_the_url_of_the_offer_zone_page_and_screenshots_should_be_captured_for_verification(String string) {
     
    getAppPage.verifyURL(string);
}
}
