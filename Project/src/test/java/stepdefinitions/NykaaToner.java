package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaTonerPage;

public class NykaaToner {
    static ExtentTest test = Hooks.reports.createTest("Nykaa Toner Page Test case");
    NykaaTonerPage tonerPage = new NykaaTonerPage(test);

    @Given("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String string) {
        tonerPage.sendTonerInSearchBar(string);
    }

    @When("I press the Enter key")
    public void i_press_the_enter_key() {
        tonerPage.performEnter();
        // tonerPage.verifyToner();
    }

    @When("I click on Sort By")
    public void i_click_on_sort_by() {
        tonerPage.clickOnSortBy();
    }

    @When("I select New Arrivals")
    public void i_select_new_arrivals() {
        tonerPage.selectNewArrivals();
    }

    @When("I scroll and click on the Average Customer Rating filter")
    public void i_scroll_and_click_on_the_average_customer_rating_filter() {
        tonerPage.clickOnAvgCustomer();
    }

    @When("I select a specific rating")
    public void i_select_a_specific_rating() {
        tonerPage.selectRating();
    }

    @When("I click on the first product")
    public void i_click_on_the_first_product() {
        tonerPage.clickOnFirstProduct();
    }

    @When("I click on Add to Bag")
    public void i_click_on_add_to_bag() {
        tonerPage.clickOnAddToBag();
    }

    @When("I verify the product description {string}")
    public void i_verify_the_product_description(String string) {
        tonerPage.verifyDescriptionText(string);
    }

    @When("I click on the Ingredients section")
    public void i_click_on_the_ingredients_section() {
        tonerPage.clickOnIngredients();
    }

    @Then("I click on Read More and capture a screenshot for verification")
    public void i_click_on_read_more_and_capture_a_screenshot_for_verification() {
        tonerPage.clickOnReadMore();
    }
}
