package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaSearchLipstickPage;

public class NykaaSearchLipstick {
    static ExtentTest test=Hooks.reports.createTest("Liquid Lipstick test case");
    NykaaSearchLipstickPage searchLipstickPage=new NykaaSearchLipstickPage(test);
    @Given("I enter liquid lipstick in the search bar {string}")
public void i_enter_liquid_lipstick_in_the_search_bar(String string) {
      searchLipstickPage.sendLipstickInsearchBar(string);
}
@When("I press the Enter key to search for liquid lipstick")
public void i_press_the_enter_key_to_search_for_liquid_lipstick() {
      searchLipstickPage.clickOnLiquidLipstickSuggestion();
     
}
@When("I hover over the first product")
public void i_hover_over_the_first_product() {
      searchLipstickPage.hoverOnFirstProduct();
     
}
@When("I click on Preview Shades")
public void i_click_on_preview_shades() {
      searchLipstickPage.clickOnPriviewShades();
     
}
@When("I verify  Select a Shade {string}")
public void i_verify_select_a_shade(String string) {
      searchLipstickPage.verifySelectAShade(string);
     
}
@When("I click on View Details to switch to the product details page")
public void i_click_on_view_details_to_switch_to_the_product_details_page() {
      searchLipstickPage.clickOnViewDetails();
     
}
@When("I click on the down arrow in the dropdown menu")
public void i_click_on_the_down_arrow_in_the_dropdown_menu() {
      searchLipstickPage.clickOnArrow();
     
}
@When("I select the third option from the dropdown menu")
public void i_select_the_third_option_from_the_dropdown_menu() {
      searchLipstickPage.selectThirdOption();
     
}
@When("I scroll to the footer of the page")
public void i_scroll_to_the_footer_of_the_page() {
      searchLipstickPage.scrollToFooter();
     
}
@When("I click on Contact Us")
public void i_click_on_contact_us() {
      searchLipstickPage.clickOnContactUs();
     
}
@When("I verify Browse Topics {string}")
public void i_verify_browse_topics(String string) {
      searchLipstickPage.verifyBrowseTopics(string);
     
}
@When("I click on the Nykaa account section")
public void i_click_on_the_nykaa_account_section() {
      searchLipstickPage.clickOnNykaaAccount();
     
}
@When("I click on My Wishlist and take a screenshot")
public void i_click_on_my_wishlist_and_take_a_screenshot() {
      searchLipstickPage.clickOnMyWishlist();
     
}
@When("I click on Add Items")
public void i_click_on_add_items() {
      searchLipstickPage.clickAddItems();
     
}
@Then("I verify Was this helpful {string} and screenshots should be captured for verification")
public void i_verify_was_this_helpful_and_screenshots_should_be_captured_for_verification(String string) {
      searchLipstickPage.verifyWasHelpful(string);
     
}
}
