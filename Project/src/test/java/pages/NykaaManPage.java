package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaManPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Report;

public class NykaaManPage {
    WebDriverHelper helper;
    ExtentTest test;
    public NykaaManPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * A. Method Name: clickOnNykaaMan
     * B. Author Name: Tanu Shree Das
     * C. Description: This method performs multiple scrolls and pauses before clicking on the Nykaa Man section and switching contexts.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void clickOnNykaaMan() {
        try {
            helper.doHoverOnElement(NykaaManPageLocators.healthandWellness);
            helper.doScrollBypixel(0, 4000);
            helper.doScrollBypixel(0, 4000);
            helper.doScrollBypixel(0, 4000);
            helper.doClickandswitch(NykaaManPageLocators.nykaaMan);
            test.log(Status.PASS, "scroll down to footer");
            LoggerHandler.info("scroll down to footer");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to scroll down to footer");
        }
    }

    /*
     * A. Method Name: hoverHealthNutrition
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the Health & Nutrition section to be visible and then hovers over it.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void hoverHealthNutrition() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.healthNutrition, 5);
            helper.doHoverOnElement(NykaaManPageLocators.healthNutrition);
            test.log(Status.PASS, "hovered on health and nutrition.");
            LoggerHandler.info("hovered on health and nutrition.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to hover on health and nutrition.");
        }
    }

    /*
     * A. Method Name: clickOnWheyProtein
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the Whey Protein section to be visible, clicks on it, and switches to a new window.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnWheyProtein() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.wheyProtein, 5);
            helper.doClickandswitch(NykaaManPageLocators.wheyProtein);
            test.log(Status.PASS, "switch to new window");
            LoggerHandler.info("switch to new window");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Not able to switch to new window");
        }
    }

    /*
     * A. Method Name: verifyWheyProtein
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the Whey Protein heading to be visible, verifies its text, and logs the result.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyWheyProtein(String data) {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.wheyProteinText, 10);
            String mainHeading = helper.doGetText(NykaaManPageLocators.wheyProteinText);
            Assert.assertTrue(mainHeading.contains(data));
            test.log(Status.PASS, "Verified 'Whey Protein'");
            LoggerHandler.info("Verified 'Whey Protein'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("'Whey Protein' not verified");
        }
    }

    /*
     * A. Method Name: verifyThreePagination
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the pagination element displaying "3" to be visible and verifies its presence.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyThreePagination(String data) {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.three, 10);
            String mainHeading = helper.doGetText(NykaaManPageLocators.three);
            Assert.assertTrue(mainHeading.contains(data));
            test.log(Status.PASS, "Verified '3 pagination'");
            LoggerHandler.info("Verified '3 pagination'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot(" '3 pagination' not verified");
        }
    }

    /*
     * A. Method Name: clickTwoPagination
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the pagination element displaying "2" to be visible and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickTwoPagination() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.two, 10);
            helper.doClick(NykaaManPageLocators.two);
            test.log(Status.PASS, "Clicked '2 pagination'");
            LoggerHandler.info("Clicked '2 pagination'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot(" '2 pagination' not clicked");
        }
    }

    /*
     * A. Method Name: clickFirstProduct
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the first product to be visible, clicks on it, and switches to a new window.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickFirstProduct() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.firstProduct, 10);
            helper.doClickandswitch(NykaaManPageLocators.firstProduct);
            test.log(Status.PASS, "Clicked on first product");
            LoggerHandler.info("Clicked on first product");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Not clicked on first product");
        }
    }

    /*
     * A. Method Name: enterPincodeData
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the pincode input field to be visible, clicks on it, and enters data from an Excel sheet.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void enterPincodeData(String data) {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.pincode, 5);
            helper.doClick(NykaaManPageLocators.pincode);
            helper.doSendKeys(NykaaManPageLocators.pincode, data);
            test.log(Status.PASS, "Entered pincode.");
            LoggerHandler.info("Entered pincode.");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Pincode not entered");
        }
    }

    /*
     * A. Method Name: clickCheck
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the check button to be visible and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickCheck() {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.checkBtn, 10);
            helper.doClick(NykaaManPageLocators.checkBtn);
            test.log(Status.PASS, "Clicked on check button");
            LoggerHandler.info("Clicked on check button");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Not clicked on check button");
        }
    }

    /*
     * A. Method Name: verifyChennai
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the Chennai text element to be visible and verifies its presence.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void verifyChennai(String data) {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.chennaiText, 10);
            String chennai = helper.doGetText(NykaaManPageLocators.chennaiText);
            Assert.assertTrue(chennai.contains(data));
            test.log(Status.PASS, "Verified Chennai Text");
            LoggerHandler.info("Verified Chennai Text");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Chennai Text not verified");
        }
    }

    /*
     * A. Method Name: scrollToWriteReview
     * B. Author Name: Tanu Shree Das
     * C. Description: This method scrolls down to the write review section and clicks on it.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void scrollToWriteReview() {
        try {
            helper.doScrollBypixel(0, 2000);
            helper.doClick(NykaaManPageLocators.writeReview);
            test.log(Status.PASS, "Clicked on write review");
            LoggerHandler.info("Clicked on write review");
        } catch (AssertionError | Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Not clicked on write review");
        }
    }

    /*
     * A. Method Name: verifySignIn
     * B. Author Name: Tanu Shree Das
     * C. Description: This method waits for the sign-in text element to be visible, verifies its presence, and captures a screenshot.
     * D. Parameters: None
     * E. Return Type: void
     */

    public void verifySignIn(String data) {
        try {
            helper.dowaitForElementToBeVisible(NykaaManPageLocators.signIn, 10);
            String signIn = helper.doGetText(NykaaManPageLocators.signIn);
            Screenshot.captureFullScreenshot("nykaa");
            Report.addScreenshotToReport("nykaa",test,Base.driver,"nykaa sign in");
            Assert.assertTrue(signIn.contains(data));
            test.log(Status.PASS, "Verified Sign In Text");
            LoggerHandler.info("Verified Sign In Text");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Sign In Text not verified");
        }
    }
}