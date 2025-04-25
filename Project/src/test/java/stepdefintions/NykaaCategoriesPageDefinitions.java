package stepdefintions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaCategoriesPage;

public class NykaaCategoriesPageDefinitions {
    public ExtentTest test = Hooks.reports.createTest("Nykaa Categories Page Test Case");
    NykaaCategoriesPage category = new NykaaCategoriesPage(test);
    
    @Given("I verify that I'm in {string} Page")
    public void i_verify_that_i_m_in_page(String string) 
    {
        category.verifyCategories(string);
    }
    @When("I clicks on search bar, sends data {string}")
    public void i_clicks_on_search_bar_sends_data(String string) 
    {
        category.sendDataToSearchBar(string);
    }
    @When("I verify the text containing {string}")
    public void i_verify_the_text_containing(String string) 
    {
        category.verifyKajal(string);
    }
    @When("I click on Formulation and clicks on the Pencil")
    public void i_click_on_formulation_and_clicks_on_the_pencil() 
    {
        category.clickOnPencil();
    }
    @When("I hovers over the Fragrance")
    public void i_hovers_over_the_fragrance() 
    {
        category.hoverFragrance();
    }
    @When("I click New Launches and switch the tab")
    public void i_click_new_launches_and_switch_the_tab() 
    {
        category.clickNewLaunches();
    }
    @When("I click on first product and switches the tab")
    public void i_click_on_first_product_and_switches_the_tab() 
    {
        category.clickFirstProduct();
    }
    @When("I clicks on the Add to Bag button")
    public void i_clicks_on_the_add_to_bag_button() 
    {
        category.clickAddToBag();
    }
    @When("I clicks on the How to Use section")
    public void i_clicks_on_the_how_to_use_section() 
    {
        category.clickHowtoUse();
    }
    @Then("I verify that the text containing {string} is present")
    public void i_verify_that_the_text_containing_is_present(String string) 
    {
        category.verifyText(string);
    }
}
