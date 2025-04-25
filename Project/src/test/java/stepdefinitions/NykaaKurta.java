package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaKurtasPage;

public class NykaaKurta {
    ExtentTest test=Hooks.reports.createTest("Kurtas");
    NykaaKurtasPage kurta= new NykaaKurtasPage(test);

    @Given("I am on the Kurtas Page")
public void i_am_on_the_kurtas_page() {
   System.out.println("Application opened");
}
@When("I click on the search bar")
public void i_click_on_the_search_bar() {
   kurta.clickSearchBar();
}
@When("I input  in the search bar {string}")
public void i_input_in_the_search_bar(String string) {
   kurta.inputKurtas(string);
}
@When("I hit Enter")
public void i_hit_enter() {
   kurta.hitEnter();
}
@When("I verify that the search results {string}")
public void i_verify_that_the_search_results(String string) {
   kurta.verifyKurta(string);
}
@When("I hover on the sort option")
public void i_hover_on_the_sort_option() {
   kurta.hoverOnSort();
}
@When("I click on the Best Seller option {string}")
public void i_click_on_the_best_seller_option(String string) {
   kurta.clickOnBestSeller(string);
}
@When("I click on the second product {string}")
public void i_click_on_the_second_product(String string) {
    kurta.clickSecondProduct(string);
}
@When("I click on the Read All Reviews")
public void i_click_on_the_read_all_reviews() {
    kurta.clickReadAllReviews();
}
@When("I click on the Helpful {string}")
public void i_click_on_the_helpful(String string) {
    kurta.clickHelpful(string);
}
@When("I click on the mobile number input field")
public void i_click_on_the_mobile_number_input_field() {
    kurta.clickMobileInput();
}
@When("I input a mobile number {string}")
public void i_input_a_mobile_number(String string) {
    kurta.inputMobileNumber(string);
}
@Then("I click the submit button")
public void i_click_the_submit_button() {
    kurta.clickSubmit();
}
}
