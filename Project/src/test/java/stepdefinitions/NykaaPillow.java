package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaPillowPage;

public class NykaaPillow {
    ExtentTest test=Hooks.reports.createTest("Pillow");
    NykaaPillowPage pillow = new NykaaPillowPage(test);
    @Given("I am on the Pillow Page")
    public void i_am_on_the_pillow_page() {
        
    }
    @When("I click on the search bar fo pillow page")
    public void i_click_on_the_search_bar_fo_pillow_page() {
        pillow.clickSearchBar();
    }
    @When("I input {string} in the search bar")
    public void i_input_in_the_search_bar(String string) {
        pillow.inputPillow(string);
    }
    @When("I hit Enter of pillow page")
    public void i_hit_enter_of_pillow_page() {
        pillow.hitEnter();
    }
    @When("I verify that the search results contain {string}")
    public void i_verify_that_the_search_results_contain(String string) {
        pillow.verifyPillow(string);
    }
    @When("I click on the price filter option")
    public void i_click_on_the_price_filter_option() {
        pillow.clickPrice();
    }
    @When("I select a specific price range filter")
    public void i_select_a_specific_price_range_filter() {
        pillow.clickPriceRange();
    }
    @When("I click on the discount filter option")
    public void i_click_on_the_discount_filter_option() {
        pillow.clickDiscount();
    }
    @When("I select a specific discount range filter")
    public void i_select_a_specific_discount_range_filter() {
        pillow.clickDiscountRange();
    }
    @When("I click on the average customer rating filter option")
    public void i_click_on_the_average_customer_rating_filter_option() {
        pillow.clickAverageRating();
    }
    @When("I select a four-star rating filter option")
    public void i_select_a_four_star_rating_filter_option() {
        pillow.clickAverageOption();
    }
    @When("I verify that the applied filters are displayed correctly {string}")
    public void i_verify_that_the_applied_filters_are_displayed_correctly(String string) {
        pillow.verifyFilter(string);
    }
    @When("I click first product of pillow Page")
    public void i_click_first_product_of_pillow_page() {
        pillow.clickFirstProduct();
    }
    @When("I add the product to add to bag")
    public void i_add_the_product_to_add_to_bag() {
        pillow.clickAddtoBag();
    }
    @When("I click on cart of the particular product")
    public void i_click_on_cart_of_the_particular_product() {
        pillow.clickCart();
    }
    @Then("I verify the {string}")
    public void i_verify_the(String string) {
        pillow.verifyBag(string);
    }
}
