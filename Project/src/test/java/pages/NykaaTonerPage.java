package pages;


import org.junit.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.TonerPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Report;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaTonerPage {
     WebDriverHelper helper;
     ExtentTest test;
     static final String sheetOfToner = "Likitha";
     static final String userDirectory="user.dir";
     static final String testdataFolder="/testdata/TonerExcel.xlsx";
    public NykaaTonerPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * a. Method Name: sendTonerInSearchBar
     * b. Author:Likitha
     * c. Description:
     * - Retrieves the toner name from an Excel sheet and inputs it into the search
     * bar.
     * - Logs success or failure messages accordingly
     * d.Parameters:None
     * e. return type : void
     */

    public void sendTonerInSearchBar(String value) {
        try {
            helper.doSendKeys(TonerPageLocator.searchBar, value);
            LoggerHandler.info("Toner Entered in search Bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to enter Toner in serach Bar");
            LoggerHandler.info("Failed to enter Toner in search bar");
            Screenshot.captureFullScreenshot("Failed to enter Toner in search bar");
        }
    }

    /*
     * a. Method Name: performEnter
     * b. Author:Likitha
     * c. Description:
     * -Executes the enter action on the search bar element using the helper method.
     * -Logs success or failure using test reporting and logger.
     * d.Parameters:None
     * e. return type : void
     */

    public void performEnter() {
        try {
            helper.doEnterAction(TonerPageLocator.searchBar);
            test.log(Status.INFO,"Press enter in the keyboard");
            test.log(Status.PASS, "Performed enter action succesfully");
            LoggerHandler.info("Performed enter action succesfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to perform enter action");
            LoggerHandler.info("Failed to perform enter action");
            Screenshot.captureFullScreenshot("Failed to perform enter action");
        }
    }

    /*
     * a. Method Name: verifyToner
     * b. Author:Likitha
     * c. Description:
     * -Retrieves the text from the toner element and asserts if it contains
     * "Toner".
     * d.Parameters:None
     * e. return type : void
     */

    public void verifyToner() {
        try {
            // String toner = helper.doGetText(TonerPageLocator.toner);
            String toner=Base.driver.getCurrentUrl();
            String expected=ExcelReader.readdata(System.getProperty(userDirectory) + testdataFolder, sheetOfToner, 0, 1);
            Assert.assertTrue(toner.contains(expected));
            test.log(Status.PASS, "Verified toner text succesfully");
            LoggerHandler.info("Verified toner text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify toner text");
            LoggerHandler.info("Failed to verify toner text");
            Screenshot.captureFullScreenshot("Failed to verify toner text");
        }
    }

    /*
     * a. Method Name: clickOnSortBy
     * b. Author:Likitha
     * c. Description:
     * -Waits for the Sort By element to be visible and then performs a click
     * action.
     * d.Parameters:None
     * e. return type : void
     */
    public void clickOnSortBy() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.sortBy, 3);
            helper.doClick(TonerPageLocator.sortBy);
            test.log(Status.PASS, "Clicked on sortby succesfully");
            LoggerHandler.info("Clicked on sortby sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on sortby");
            LoggerHandler.info("Failed to click on sortby");
            Screenshot.captureFullScreenshot("Failed to click on sortby");
        }
    }

    /*
     * a. Method Name: selectNewArrivals
     * b. Author:Likitha
     * c. Description:
     * -Waits for the "New Arrivals" element to be visible and then performs a click
     * action.
     * d.Parameters:None
     * e. return type : void
     */
    public void selectNewArrivals() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.newArrivals, 3);
            helper.doClick(TonerPageLocator.newArrivals);
            test.log(Status.INFO,"Filter products based on new arrivals");
            test.log(Status.PASS, "Selected new Arrivals succesfully");
            LoggerHandler.info("Selected new Arrivals successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to select new Arrivals");
            LoggerHandler.info("Failed to select new Arrivals");
            Screenshot.captureFullScreenshot("Failed to select new Arrivals");
        }
    }

    /*
     * a. Method Name: clickOnAvgCustomer
     * b. Author:Likitha
     * c. Description:
     * -Waits until the "Average Customer Rating" filter is visible, scrolls the
     * page to ensure it’s within view,
     * and then clicks on the element. Logs success or failure using test reporting
     * and a logger.
     * d.Parameters:None
     * e. return type : void
     */
    public void clickOnAvgCustomer() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.avgRate, 3);
            helper.doScrollBypixel(0, 500);
            test.log(Status.INFO, "Scrolled to click on Avg Customer Rating");
            helper.doClick(TonerPageLocator.avgRate);
            test.log(Status.PASS, "Clicked on Avg Customer Rating succesfully");
            LoggerHandler.info("Clicked on Avg Customer Rating sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Avg Customer Rating");
            LoggerHandler.info("Failed to click on Avg Customer Rating");
            Screenshot.captureFullScreenshot("Failed to click on Avg Customer Rating");
        }
    }

    /*
     * a. Method Name: selectRating
     * b. Author:Likitha
     * c. Description:
     * -Waits for visibility, then clicks the rating filter.
     * Logs success or failure for tracking.
     * d.Parameters:None
     * e. return type : void
     */
    public void selectRating() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.rate, 3);
            helper.doClick(TonerPageLocator.rate);
            test.log(Status.PASS, "Selected rating succesfully");
            LoggerHandler.info("Selected rating successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to select Rating");
            LoggerHandler.info("Failed to select Rating");
            Screenshot.captureFullScreenshot("Failed to select Rating");
        }
    }

    /*
     * a. Method Name: clickOnFirstProduct
     * b. Author:Likitha
     * c. Description:
     * -Ensures visibility before clicking and switching context.
     * Logs success or failure for tracking.
     * d. Parameters:None
     * e. return type : void
     */
    public void clickOnFirstProduct() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.firstProduct, 10);
            helper.doClickandswitch(TonerPageLocator.firstProduct);
            test.log(Status.INFO, "Switch to new tab of the product");
            test.log(Status.PASS, "Clicked on First product succesfully");
            LoggerHandler.info("Clicked on First Product sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on First product");
            LoggerHandler.info("Failed to click on First product");
            Screenshot.captureFullScreenshot("Failed to click on First product");
        }
    }

    /*
     * a. Method Name: verifyInclusiveText
     * b. b. Author:Likitha
     * c. Description:
     * -Retrieves the text from the inclusive tax element and asserts its
     * correctness.
     * Logs success or failure using test reporting and a logger.
     * d. Parameters:None
     * e. return type : void
     */
    public void verifyInclusiveText() {
        try {
            String inclusiveTax = helper.doGetText(TonerPageLocator.inclusiveTax);
            String expected=ExcelReader.readdata(System.getProperty(userDirectory) + testdataFolder, sheetOfToner, 1, 1);
            Assert.assertTrue(inclusiveTax.contains(expected));
            test.log(Status.PASS, "Verified inclusive of all taxes text succesfully");
            LoggerHandler.info("Verified inclusive of all taxes text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify inclusive of all taxes text");
            LoggerHandler.info("Failed to verify inclusive of all taxes text");
            Screenshot.captureFullScreenshot("Failed to verify inclusive of all taxes text");
        }
    }

    /*
     * a. Method Name: clickOnAddToBag
     * b. b. Author:Likitha
     * c. Description:
     * -Waits for the "Add to Bag" button to be visible before performing the click
     * action.
     * Logs success or failure using test reporting and a logger.
     * d. Parameters:None
     * e. return type : void
     */
    public void clickOnAddToBag() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.addToBag, 10);
            helper.doClick(TonerPageLocator.addToBag);
            test.log(Status.PASS, "Clicked on add to bag successfully");
            LoggerHandler.info("Clicked on add to bag successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on add to bag");
            LoggerHandler.info("Failed to click on add to bag");
            Screenshot.captureFullScreenshot("Failed to click on add to bag");
        }
    }

    /*
     * a. Method Name: verifyDescriptionText
     * b. Author:Likitha
     * c. Description:
     * -Verifies if the retrieved text from a specific web element contains
     * the word "Description" and logs the result.
     * d.Parameters:None
     * e. return type : void
     */
    public void verifyDescriptionText(String value) {
        try {
            String description = helper.doGetText(TonerPageLocator.description);
            Assert.assertTrue(description.contains(value));
            test.log(Status.PASS, "Verified Description text succesfully");
            LoggerHandler.info("Verified Description text sucessfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to verify Description text");
            LoggerHandler.info("Failed to verify Description text");
            Screenshot.captureFullScreenshot("Failed to verify Description text");
        }
    }

    /*
     * a. Method Name: clickOnIngredients
     * b. Author:Likitha
     * c. Description:
     * -Waits for the "Ingredients" element to be visible, clicks on it,
     * and logs the outcome (success or failure).
     * d.Parameters:None
     * e. return type : void
     */
    public void clickOnIngredients() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.ingredients, 10);
            helper.doClick(TonerPageLocator.ingredients);
            test.log(Status.PASS, "Clicked on ingredients successfully");
            LoggerHandler.info("Clicked on ingredients successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Cannot be Clicked on ingredients successfully");
            LoggerHandler.info("Cannot be Clicked on ingredients successfully");
            Screenshot.captureFullScreenshot("Cannot be Clicked on ingredients successfully");
        }
    }

    /*
     * a. Method Name: clickOnReadMore
     * b. Author:Likitha
     * c. Description:
     * -Waits for the "Ingredients" element to be visible, clicks on it,
     * and logs the outcome (success or failure).
     * d.Parameters:None
     * e. return type : void
     */
    public void clickOnReadMore() {
        try {
            helper.dowaitForElementToBeVisible(TonerPageLocator.readMore, 10);
            helper.doClick(TonerPageLocator.readMore);
            test.log(Status.PASS, "Clicked on ReadMore");
            LoggerHandler.info("Clicked on ReadMore");
            Screenshot.captureFullScreenshot("Read More Ingredients");
            Report.addScreenshotToReport("Read More",test, Base.driver,"Read more screenshot");

        } catch (Exception e) {
            test.log(Status.FAIL, "Cannot be Clicked on ReadMore");
            LoggerHandler.info("Cannot be Clicked on ReadMore");
            Screenshot.captureFullScreenshot("Cannot be Clicked on ReadMore");
        }
    }
}
