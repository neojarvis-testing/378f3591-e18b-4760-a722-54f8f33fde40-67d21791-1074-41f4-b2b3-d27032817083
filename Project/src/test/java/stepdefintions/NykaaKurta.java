package stepdefintions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaKurtasPage;

public class NykaaKurta {
    ExtentTest test=Hooks.reports.createTest("Kurtas");
    NykaaKurtasPage Kurta= new NykaaKurtasPage(test);

    @Given("I am on the Kurtas Page")
    public void i_am_on_the_kurtas_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the search bar")
    public void i_click_on_the_search_bar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I input  in the search bar {string}")
    public void i_input_in_the_search_bar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I hit Enter")
    public void i_hit_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I verify that the search results {string}")
    public void i_verify_that_the_search_results(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I hover on the sort option")
    public void i_hover_on_the_sort_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the Best Seller option {string}")
    public void i_click_on_the_best_seller_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the second product {string}")
    public void i_click_on_the_second_product(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the Size Guide option")
    public void i_click_on_the_size_guide_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I verify that the Size Guide {string}")
    public void i_verify_that_the_size_guide(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the cross mark")
    public void i_click_the_cross_mark() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the Read All Reviews")
    public void i_click_on_the_read_all_reviews() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I verify that the all reviews {string}")
    public void i_verify_that_the_all_reviews(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the Helpful {string}")
    public void i_click_on_the_helpful(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the mobile number input field")
    public void i_click_on_the_mobile_number_input_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I input a mobile number {string}")
    public void i_input_a_mobile_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I verify that the submit action")
    public void i_verify_that_the_submit_action() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
