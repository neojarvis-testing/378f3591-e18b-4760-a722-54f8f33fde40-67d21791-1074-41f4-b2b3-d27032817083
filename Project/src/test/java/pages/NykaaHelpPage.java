package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaHelpPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Report;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaHelpPage {
    WebDriverHelper helper;
    ExtentTest test;
    public NykaaHelpPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /**
     * a. Method Name: clickOnHelp
     * b. Author: Likitha
     * c. Description: This method waits for the "Help" button to be visible, clicks on it, and switches to the corresponding help page. It logs the action accordingly
     *          and handles failures gracefully.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnHelp() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.help, 5);
            helper.doClickandswitch(NykaaHelpPageLocator.help);
            test.log(Status.PASS, "Clicked on Help on Navigation bar");
            LoggerHandler.info("Clicked on Help on Navigation bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on Help on Navigation bar");
            LoggerHandler.error("Failed to Click on Help on Navigation bar");
            Screenshot.captureFullScreenshot("Failed to Click on Help on Navigation bar");
        }
    }

    /**
     * a. Method Name: verifyHelpPageTitle
     * b. Author: Likitha
     * c. Description: This method retrieves the current page title and verifies that it contains "Help Center"
     *                  using an assertion. If successful, it logs the result; otherwise, it logs the failure message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyHelpPageTitle(String value) {
        try {
            String pageTitle=helper.doGetText(NykaaHelpPageLocator.helpCentre);
            Assert.assertTrue(pageTitle.contains(value));
            test.log(Status.PASS, "Verified Help Page Title");
            LoggerHandler.info("Verified Help Page Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify  Help page title");
            LoggerHandler.error("Failed to verify  Help page title");
            Screenshot.captureFullScreenshot("Failed to verify  Help page title");
        }
    }

    /**
     * a. Method Name: clickOnOrderRelated
     * b. Author: Likitha
     * c. Description: This method waits for the "Order Related" section to be visible,
     *                  clicks on it, and logs the action appropriately. If an exception occurs, it logs the failure message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnOrderRelated() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderRelated, 5);
            helper.doClick(NykaaHelpPageLocator.orderRelated);
            test.log(Status.PASS, "Clicked on Order Related successfully");
            LoggerHandler.info("Clicked on Order Related successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on order related.");
            LoggerHandler.error("Failed to click on order related.");
            Screenshot.captureFullScreenshot("Failed to click on order related.");
        }
    }

    /**
     * a. Method Name: verifyOrderRelatedText
     * b. Author: Likitha
     * c. Description: This method verifies whether the "Order Related" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void (Does not return a value)
     */
    public void verifyOrderRelatedText(String value) {
        try {
            String orderrelated = helper.doGetText(NykaaHelpPageLocator.orderRelatedText);
            Assert.assertTrue(orderrelated.contains(value));
            test.log(Status.PASS, "Verified the text Order Related");
            LoggerHandler.info("Verified the text Order Related");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Order Related");
            LoggerHandler.error("Failed to Verify the text Order Related");
            Screenshot.captureFullScreenshot("Failed to Verify the text Order Related");
        }
    }

    /**
     * a. Method Name: clickOnOrderStatus
     * b. Author: Likitha
     * c. Description: This method waits for the "Order Status" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnOrderStatus() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.orderStaus, 5);
            helper.doClick(NykaaHelpPageLocator.orderStaus);
            test.log(Status.PASS, "Clicked on Order Status");
            LoggerHandler.info("Clicked on Order Status");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on order status");
            LoggerHandler.error("Failed to click on order status");
            Screenshot.captureFullScreenshot("Failed to click on order status");

        }
    }

    /**
     * a. Method Name: verifyOrderStatustext
     * b. Author: Likitha
     * c. Description: This method verifies whether the "Order Status" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */

    public void verifyOrderStatustext(String value) {
        try {
            String orderStatus = helper.doGetText(NykaaHelpPageLocator.orderStatusText);
            
            Assert.assertTrue(orderStatus.contains(value));
            test.log(Status.PASS, "Verified the text Order status");
            LoggerHandler.info("Verified the text Order status");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Order status");
            LoggerHandler.error("Failed to Verify the text Order status");
            Screenshot.captureFullScreenshot("Failed to Verify the text Order status");

        }
    }

    /**
     * a. Method Name: navigateBackToOrderRelated
     * b. Author: Likitha
     * c. Description: This method navigates back to the previous page using the browser's built-in navigation.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void navigateBackToOrderRelated() {
        try {
            Base.driver.navigate().back();
            test.info("Naviagte back to Order Related page");
            test.log(Status.PASS, "Navigated back to Order Related page successfully");
            LoggerHandler.info("Navigated back to Order Related page successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to navigate back to Order Related page");
            LoggerHandler.error("Failed to navigate back to Order Related page");
            Screenshot.captureFullScreenshot("Failed to navigate back to Order Related page");
        }
    }

    /**
     * a. Method Name: clickOnRefund
     * b. Author: Likitha
     * c. Description: This method waits for the "Returns and Refunds" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnRefund() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.returnRefunds, 5);
            helper.doClick(NykaaHelpPageLocator.returnRefunds);
            test.log(Status.PASS, "clicked on Returns and Refund");
            LoggerHandler.info("clicked on Returns and Refund");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Return and Refund");
            LoggerHandler.error("Failed to click on Return and Refund");
            Screenshot.captureFullScreenshot("Failed to click on Return and Refund");
        }
    }

    /**
     * a. Method Name: verifyCanIReturn
     * b. Author: Likitha
     * c. Description: This method verifies whether the "Can I return part of my order?" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCanIReturn(String value) {
        try {
            String canIReturn = helper.doGetText(NykaaHelpPageLocator.canIReturn);
            Assert.assertTrue(canIReturn.contains(value));
            test.log(Status.PASS, "Verified the text Can I return a part of my order");
            LoggerHandler.info("Verified the text Can I return a part of my order");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Can I return a part of my order");
            LoggerHandler.error("Failed to Verify the text Can I return a part of my order");
            Screenshot.captureFullScreenshot("Failed to Verify the text Can I return a part of my order");
        }
    }

    /**
     * a. Method Name: clickOnCancellationAndRefunds
     * b. Author: Likitha
     * c. Description: This method waits for the "Cancellation and Refunds" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCanceellationAndRefunds() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancellation, 5);
            helper.doClick(NykaaHelpPageLocator.cancellation);
            test.log(Status.PASS, "Clicked on Cancellation and Refunds");
            LoggerHandler.info("Clicked on Cancellation and Refunds");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on canceelation and refunds.");
            LoggerHandler.error("Failed to click on canceelation and refunds.");
            Screenshot.captureFullScreenshot("Failed to click on canceelation and refunds.");
        }
    }

    /**
     * a. Method Name: clickOnCancelPolicy
     * b. Author: Likitha
     * c. Description: This method waits for the "Cancellation Policy" element to be visible and then clicks on it.
     *                  It logs the success or failure of the operation.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCancelPolicy() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelPolicy, 5);
            helper.doClick(NykaaHelpPageLocator.cancelPolicy);
            test.log(Status.PASS, "Clicked on Cancellation policy");
            LoggerHandler.info("Clicked on Cancellation policy");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on canceelation policy.");
            LoggerHandler.error("Failed to click on canceelation policy.");
            Screenshot.captureFullScreenshot("Failed to click on canceelation policy.");
        }
    }

    /**
     * a. Method Name: verifyCancelPolicy
     * b. Author: Likitha
     * c. Description: This method verifies whether the "Cancellation Policy" text is present on the Nykaa help page.
     *                  It fetches the text, checks if it contains the expected phrase, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCancelPolicy(String value) {
        try {
            String cancellationPolicy = helper.doGetText(NykaaHelpPageLocator.cancelPolicyText);
            Assert.assertTrue(cancellationPolicy.contains(value));
            test.log(Status.PASS, "Verified the text Cancellation Policy");
            LoggerHandler.info("Verified the text Cancellation Policy");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Cancellation Policy");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy");
            Screenshot.captureFullScreenshot("Failed to Verify the text Cancellation Policy");
        }
    }

    /**
     * a. Method Name: clickOnCancellationLink
     * b. Author: Likitha
     * c. Description: This method waits for the "Cancellation" link to be visible and then clicks on it.
     *              It switches to the new window if applicable and takes a screenshot for reporting.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOncancellationLink() {
        try {
            helper.dowaitForElementToBeVisible(NykaaHelpPageLocator.cancelLink, 5);
            helper.doClickandswitch(NykaaHelpPageLocator.cancelLink);
            test.log(Status.INFO, "Switch to new tab of cancellation link policy");
            test.log(Status.PASS, "Clicked on cancellation link policy");
            LoggerHandler.info("Clicked on cancellation link policy");
            Screenshot.captureFullScreenshot("Cancellation_Policy");
            Report.addScreenshotToReport("cancellation_policy",test, Base.driver,"CancellationPolicy");

        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on cancellation link.");
            LoggerHandler.info("Failed to click on cancellation link.");
            Screenshot.captureFullScreenshot("Failed to click on cancellation link.");
        }
    }

    /**
     * a. Method Name: verifyCancelPolicyLink
     * b. Author: Likitha
     * c. Description: This method verifies whether the "Cancellation Policy" link is correctly displayed.
     *                  It fetches the text from the element, compares it with the expected link, and logs the result.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyCancelPolicyLink(String value) {
        try {
            String link = Base.driver.getCurrentUrl();
            Assert.assertEquals(link, value);
            test.log(Status.PASS, "Verified the text Cancellation Policy url");
            LoggerHandler.info("Verified the text Cancellation Policy url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Verify the text Cancellation Policy url");
            LoggerHandler.info("Failed to Verify the text Cancellation Policy url");
            Screenshot.captureFullScreenshot("Failed to Verify the text Cancellation Policy url");
        }
    }
}
