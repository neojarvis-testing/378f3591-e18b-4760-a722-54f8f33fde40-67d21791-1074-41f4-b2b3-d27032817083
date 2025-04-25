package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaManPage;

public class NykaaManPageDefinitions {
    public ExtentTest test = Hooks.reports.createTest("Nykaa Man Page Test Case");
    NykaaManPage man = new NykaaManPage(test);  

    @Given("I clicks on Nykaa Man")
    public void i_clicks_on_nykaa_man() 
    {
        man.clickOnNykaaMan();
    }
    @When("I hover on Health and Nutrition")
    public void i_hover_on_health_and_nutrition() 
    {
        man.hoverHealthNutrition();
    }
    @When("I clicks on Whey Protein and switches to a new window")
    public void i_clicks_on_whey_protein_and_switches_to_a_new_window() 
    {
        man.clickOnWheyProtein();
    }
    @When("I verifies the text whey protein {string}")
    public void i_verifies_the_text_whey_protein(String string) 
    {
        man.verifyWheyProtein(string);
    }
    @When("I verifies the {string} text")
    public void i_verifies_the_text(String string) 
    {
        man.verifyThreePagination(string);
    }
    @When("I clicks on {int} pagination")
    public void i_clicks_on_pagination(Integer int1) 
    {
        man.clickTwoPagination();
    }
    @When("clicks on the first product")
    public void clicks_on_the_first_product() 
    {
        man.clickFirstProduct();
    }
    @When("enters the pincode {string}")
    public void enters_the_pincode(String string) 
    {
        man.enterPincodeData(string);
    }
    @When("clicks on the check button")
    public void clicks_on_the_check_button() 
    {
        man.clickCheck();
    }
    @When("verifies the text chennai {string}")
    public void verifies_the_text_chennai(String string) 
    {
        man.verifyChennai(string);
    }
    @When("scrolls to the Write a Review section and clicks on it")
    public void scrolls_to_the_write_a_review_section_and_clicks_on_it() 
    {
        man.scrollToWriteReview();
    }
    @Then("verifies the {string} text")
    public void verifies_the_text(String string) 
    {
        man.verifySignIn(string);
    }
}
