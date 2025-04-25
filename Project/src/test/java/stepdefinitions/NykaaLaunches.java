package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaNewLaunches;

public class NykaaLaunches {

    ExtentTest test=Hooks.reports.createTest("newLaunches");
    NykaaNewLaunches launches=new NykaaNewLaunches(test);

    @Given("I am on the New Launches Page")
public void i_am_on_the_new_launches_page() {
   System.out.println("Application opened");
}
@When("I scroll down to the footer of the page")
public void i_scroll_down_to_the_footer_of_the_page() {
    launches.scrollDownToFooter();
}
@When("I click on the New Launches element")
public void i_click_on_the_new_launches_element() {
   launches.clickNewlaunches();
}
@Then("I verify that the text {string} is present")
public void i_verify_that_the_text_is_present(String string) {
    launches.verifyShopNewLaunches(string);
}
@When("I hover over the Natural element")
public void i_hover_over_the_natural_element() {
    launches.hoverOnNatural();
}
@When("I click on the Face Wash element {string}")
public void i_click_on_the_face_wash_element(String string) {
    launches.clickFaceWah(string);
    launches.verifyFaceWash(string);
}
@When("I click on the price option of new launches")
public void i_click_on_the_price_filter_option_of_new_launches() {
    launches.clickPrices();
}
@When("I select a price range of new launches")
public void i_select_a_specific_price_range_filter() {
    launches.clickPriceRange();
}
@When("I click on the first product link and switch to its page")
public void i_click_on_the_first_product_link_and_switch_to_its_page() {
    launches.clickFirstProductLink();
}
@When("I click on the pin code input field")
public void i_click_on_the_pin_code_input_field() {
   launches.clickPinCode();
}
@When("I input a pin code {string}")
public void i_input_a_pin_code(String string) {
    launches.inputPinCode(string);
}
@When("I click the check button")
public void i_click_the_check_button() {
    launches.clickCheck();
}
@When("I click on the Add to Bag button")
public void i_click_on_the_add_to_bag_button() {
    launches.clickAddtoBag();
}
@When("I click on the cart icon to view the added product")
public void i_click_on_the_cart_icon_to_view_the_added_product() {
    launches.clickCart();
}
@Then("I verify that the bag contains the {string}")
public void i_verify_that_the_bag_contains_the(String string) {
    launches.verifyBag(string);
}

}
