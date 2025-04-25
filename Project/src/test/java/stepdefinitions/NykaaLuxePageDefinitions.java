package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaLuxeHomePage;

public class NykaaLuxePageDefinitions {
    ExtentTest test = Hooks.reports.createTest("Nykaa Luxe Page Test Case");
    NykaaLuxeHomePage luxe = new NykaaLuxeHomePage(test);    
    
    @Given("I scroll to Nykaa Luxe Footer Section")
    public void i_scroll_to_nykaa_luxe_footer_section() 
    {
        luxe.scrollToFooter();
    }
    @When("I click on Luxe")
    public void i_click_on_luxe() 
    {
        luxe.clickOnLuxe();
    }
    @When("I verify the text Luxe {string}")
    public void i_verify_the_text_luxe(String string)
    {
        luxe.verifyLuxe(string);
    }
    @When("I click on Sort by Popularity")
    public void i_click_on_sort_by_popularity() 
    {
        luxe.clickOnSortByPopularity();
    }
    @When("I click on Customer Top Rated")
    public void i_click_on_customer_top_rated() 
    {
        luxe.clickOnCustomerToprated();
    }
    @When("I click on Gender")
    public void i_click_on_gender() 
    {
        luxe.clickOnGender();
    }
    @When("I click on Unisex")
    public void i_click_on_unisex() 
    {
        luxe.clickOnUnisex();
    }
    @When("I verifies the text {string}")
    public void i_verifies_the_text(String string) 
    {
        luxe.verifyUnisex(string);
    }
    @When("I click on Occasion")
    public void i_click_on_occasion() 
    {
    }
    @When("I click on Day Wear")
    public void i_click_on_day_wear() 
    {
        luxe.clickOnDaywear();
    }
    @When("I scroll to the footer again")
    public void i_scroll_to_the_footer_again() 
    {
        luxe.scrollToFooterAgain();
    }
    @When("I click on Nykaa Man")
    public void i_click_on_nykaa_man() 
    {
        luxe.clickOnNykaaMan();
    }
    @When("I click on Grooming Advice")
    public void i_click_on_grooming_advice() 
    {
        luxe.clickOnGroomingAdvice();
    }
    @Then("I verifies elements text Shaving {string}")
    public void i_verifies_elements_text_shaving(String string) 
    {
        luxe.verifyShaving(string);
    }
}
