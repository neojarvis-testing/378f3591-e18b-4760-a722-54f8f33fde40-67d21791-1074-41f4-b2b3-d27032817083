package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import lombok.val;
import uistore.NykaaGetAppPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaGetAppPage {
    WebDriverHelper helper;
    ExtentTest test;
    public NykaaGetAppPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /**
     * A. Method Name: clickOnGetApp
     * B. Author name: Tanu Shree Das
     * C. Description: Clicks on the "Get App" button and switches to the
     * corresponding tab.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnGetApp() {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.getApp, 5);
            helper.doClickandswitch(NykaaGetAppPageLocators.getApp);
            test.log(Status.PASS, "Clicked and Switched to Get App Tab");
            LoggerHandler.info("Clicked and Switched to Get App Tab");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to click and switch to get app tab");
        }
    }

    /**
     * A. Method Name: verifyBeautyToGo
     * B. Author name: Tanu Shree Das
     * C. Description: Verifies that the main heading contains "BEAUTY TO GO".
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyBeautyToGo(String value) {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mainHeading, 10);
            String mainHeading = helper.doGetText(NykaaGetAppPageLocators.mainHeading);
            Assert.assertTrue(mainHeading.contains(value));
            test.log(Status.PASS, "Verified 'Beauty to go'");
            LoggerHandler.info("Verified 'Beauty to go'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to verify 'Beauty to go'");
        }
    }

    /**
     * A. Method Name: enterMobileNumberData
     * B. Author name: Tanu Shree Das
     * C. Description: Enters mobile number data into the input field from an Excel
     * file.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void enterMobileNumberData(String value) {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doClick(NykaaGetAppPageLocators.mobileInputField);
            helper.doSendKeys(NykaaGetAppPageLocators.mobileInputField,value);
            helper.doEnterAction(NykaaGetAppPageLocators.mobileInputField);
            test.log(Status.PASS, "Entered mobile number.");
            LoggerHandler.info("Entered mobile number.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to entetr mobile number");
        }
    }

    /**
     * A. Method Name: clickOnTermsConditions
     * B. Author name: Tanu Shree Das
     * C. Description: Clicks on the "Terms & Conditions" link and switches to the
     * corresponding tab.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnTermsConditions() {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.mobileInputField, 5);
            helper.doJsscrollIntoView(NykaaGetAppPageLocators.termsConditions);
            helper.doClickandswitch(NykaaGetAppPageLocators.termsConditions);
            test.log(Status.PASS, "Clicked and switched tab to Terms and Conditions");
            LoggerHandler.info("Clicked and switched tab to Terms and Conditions");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to click on terms and conditions");
        }
    }

    /**
     * A. Method Name: verifyTermsConditions
     * B. Author name: Tanu Shree Das
     * C. Description: Verifies the heading text of the "Terms & Conditions" page.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyTermsConditions(String value) {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.termsConditionsHeading, 5);
            String tCHeading = helper.doGetText(NykaaGetAppPageLocators.termsConditionsHeading);
            Assert.assertEquals(tCHeading,value);
            test.log(Status.PASS, "Verified 'Terms & Conditions'");
            LoggerHandler.info("Verified 'Terms & Conditions'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to verify 'Terms & Conditions'");
        }
    }

    /**
     * A. Method Name: clickOnShippingPolicy
     * B. Author name: Tanu Shree Das
     * C. Description: Clicks on the "Shipping Policy" link.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnShippingPolicy() {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.shippingPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.shippingPolicy);
            test.log(Status.PASS, "Clicked to Shipping Policy.");
            LoggerHandler.info("Clicked to Shipping Policy.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to click on shipping policy");
        }
    }

    /**
     * A. Method Name: verifyDeliveryProcessQues
     * B. Author name: Tanu Shree Das
     * C. Description: Verifies the text of the delivery process question.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyDeliveryProcessQues(String value) {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.deliveryProcessQues, 5);
            String deliveryQues = helper.doGetText(NykaaGetAppPageLocators.deliveryProcessQues);
            Assert.assertTrue(deliveryQues.contains(value));
            test.log(Status.PASS, "Verified 'How does the delivery process work?'");
            LoggerHandler.info("Verified 'How does the delivery process work?'");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to verify 'How does the delivery process work?'");
        }
    }

    /**
     * A. Method Name: clickOnPrivacyPolicy
     * B. Author name: Tanu Shree Das
     * C. Description: Clicks on the "Privacy Policy" link.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnPrivacyPolicy() {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.privacyPolicy, 5);
            helper.doClick(NykaaGetAppPageLocators.privacyPolicy);
            test.log(Status.INFO, "Clicked to Privacy Policy.");
            LoggerHandler.info("Clicked to Privacy Policy.");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Clicked Privacy Policy");
        }
    }

    /**
     * A. Method Name: verifyPrivacyPolicy
     * B. Author name: Tanu Shree Das
     * C. Description: Verifies that the Privacy Policy heading text contains
     * "Privacy Policy".
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyPrivacyPolicy(String value) {
        try {
            helper.dowaitForElementToBeVisible(NykaaGetAppPageLocators.privacyPolicyHeading, 5);
            String deliveryQues = helper.doGetText(NykaaGetAppPageLocators.privacyPolicyHeading);
            Assert.assertTrue(deliveryQues.contains(value));
            test.log(Status.PASS, "Verified 'Privacy Policy'");
            LoggerHandler.info("Verified 'Privacy Policy'");
            Thread.sleep(4000);
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to verify Privacy Policy");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
    }

    /**
     * A. Method Name: clickOnOfferZone
     * B. Author name: Tanu Shree Das
     * C. Description: Clicks on the "Offer Zone" link, scrolling down the page
     * multiple times if needed, and switches to the corresponding tab.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void clickOnOfferZone() {
        try {
            try {
                Thread.sleep(4000);
               helper.doJsScrollFooter();
                helper.doClickandswitch(NykaaGetAppPageLocators.offerZone);
                test.log(Status.INFO, "Clicked and switched tab to Offer Zone");
                LoggerHandler.info("Clicked and switched tab to Offer Zone");
            } catch (Exception e) {
                LoggerHandler.error(e.getMessage());
                Screenshot.captureFullScreenshot("Unable to click on offer zone");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
        }
    }

    /*
     * A. Method Name: verifyURL
     * B. Author name: Tanu Shree Das
     * C. Description: Verifies that the current URL matches the expected Offer Zone
     * URL and captures a screenshot.
     * D. Parameters: None
     * E. Return Type: void
     */
    public void verifyURL(String value) {
        try {
            String currentURL = Base.driver.getCurrentUrl();
            Assert.assertEquals(currentURL,value);
            test.log(Status.PASS, "Verified 'current URL'");
            LoggerHandler.info("Verified 'current URL'");
            Screenshot.captureFullScreenshot("offerZone");
        } catch (AssertionError e) {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
            Screenshot.captureFullScreenshot("Unable to verify URL");
        }
    }
}
