package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NykaaLuxePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaLuxeHomePage {
   ExtentTest test;
   WebDriverHelper helper;
   public NykaaLuxeHomePage(ExtentTest test){
    helper=new WebDriverHelper(Base.driver);
    this.test=test;
   } 
    /*
	 * a.Method Name: scrollToFotter
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method scrolls the page to the footer section .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void scrollToFooter(){
    Base.driver.navigate().refresh();
    helper.doScrollBypixel(0,10000);
    helper.doScrollBypixel(0,10000);
   }
    /*
	 * a.Method Name:clickOnLuxe
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element luxe and clicks on it .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnLuxe(){
    try{
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.luxe, 10);
        helper.doClickandswitch(NykaaLuxePageLocators.luxe);
        test.log(Status.PASS,"Clicked on Luxe");
        LoggerHandler.info("Clicked on Luxe");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Luxe");
        LoggerHandler.error("Cannot Click on Luxe");
    }
   }
    /*
	 * a.Method Name:verifyLuxe
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element luxe and verifies the text Luxe .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void verifyLuxe(String data){
    try {
        String luxe=helper.doGetText(NykaaLuxePageLocators.nykaaLuxe);
        Assert.assertTrue(luxe.contains(data));
        test.log(Status.PASS,"Verified the text  Luxe");
        LoggerHandler.info("Verified the text  Luxe");
    } catch (AssertionError e) {
        test.log(Status.FAIL,"Cannot Verify the text  Luxe");
        LoggerHandler.error("Cannot Verifiy the text  Luxe");
      
    }
   }
    /*
	 * a.Method Name:clickOnSortByPopularity
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Popularity and clicks on popularity .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnSortByPopularity(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.popularity, 10);
        helper.doClick(NykaaLuxePageLocators.popularity);
        test.log(Status.PASS,"Clicked on popularity");
        LoggerHandler.info("Clicked on popularity");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on popularity");
        LoggerHandler.error("Cannot click on popularity");
    } 
   }
    /*
	 * a.Method Name:clickOnCustomerToprated
	 * b.Author Name: Tanu Shree Das 
	 * c.Description: The method finds the element Customer Toprated and clicks on Customer Toprated .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnCustomerToprated(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.customerRated, 10);
        helper.doClick(NykaaLuxePageLocators.customerRated);
        test.log(Status.PASS,"Clicked on Customer Top Rated");
        LoggerHandler.info("Clicked on Customer Top Rated"); 
        
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot Click on Customer Top Rated");
        LoggerHandler.error("Cannot Clickon Customer Top Rated"); 
    }
   }
    /*
	 * a.Method Name:clickOnGender
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Gender and clicks on Gender .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnGender(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.gender, 10);
        helper.doClick(NykaaLuxePageLocators.gender);
        test.log(Status.PASS,"Clicked on Gender");
        LoggerHandler.info("Clicked on Gender"); 
        
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Gender");
        LoggerHandler.error("Cannot click on Gender");
        
    }
   }
    /*
	 * a.Method Name:clickOnUnisex
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Unisex and clicks on Unisex .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnUnisex(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.unisex, 10);
        helper.doClick(NykaaLuxePageLocators.unisex);
        test.log(Status.PASS,"Clicked on Unisex");
        LoggerHandler.info("Clicked on Unisex");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Unisex");
        LoggerHandler.error("Cannot click on Unisex");
    }
   }
    /*
	 * a.Method Name:verifyUnisex
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Unisex and verifies the text Unisex .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void verifyUnisex(String data){
    try {
        String unisex=helper.doGetText(NykaaLuxePageLocators.unisexText);
        Assert.assertTrue(unisex.contains(data));
        test.log(Status.PASS,"Verified the text Unisex");
        LoggerHandler.info("Verified the text Unisex");
    } catch (AssertionError e) {
        test.log(Status.FAIL,"Cannot Verify the text Unisex");
        LoggerHandler.error("Cannot Verify the text Unisex");
    }
   }
    /*
	 * a.Method Name:clickOnOccasion
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Occasion and clicks on Occasion.
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnOccasion(){
    try {
        helper.doScrollBypixel(0, 300);
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.occasion, 10);
        helper.doClick(NykaaLuxePageLocators.occasion);
        test.log(Status.INFO,"clicked on Occasion");
        LoggerHandler.info("clicked on Occasion");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Occasion");
        LoggerHandler.error("Cannot click on Occasion");
    }
   }
    /*
	 * a.Method Name:clickOnDaywear
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element Daywear and clicks on Day wear.
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnDaywear(){
    try {
        
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.daypuWear, 10);
        helper.doClick(NykaaLuxePageLocators.daypuWear);
        test.log(Status.PASS,"clicked on Day wear");
        LoggerHandler.info("clicked on Day wear");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Daywear");
        LoggerHandler.error("Cannot click on Daywear");
    }
   }
    /*
	 * a.Method Name:clickOnFirstProduct
	 * b.Author Name: Tanu Shree Das
	 * c.Description:The method clicks on firstProduct under all products.
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnFirstProduct(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.firstProduct, 10);
        helper.doClickandswitch(NykaaLuxePageLocators.firstProduct);
        Base.driver.navigate().refresh();
        test.log(Status.PASS,"clicked on First Product");
        LoggerHandler.info("clicked on First Product");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on First Product");
        LoggerHandler.error("Cannot click on First Product");
       
    }
   }
    /*
	 * a.Method Name: scrollToFotterAgain
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method scrolls the page to the footer section .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void scrollToFooterAgain(){
    helper.doJsScrollFooter();
   }
    /*
	 * a.Method Name:clickOnNykaaMan
	 * b.Author Name: Tanu Shree Das
	 * c.Description:The method finds the element Nykaaman and clicks on Nykaa man.
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnNykaaMan(){
    try {
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.nykaaman, 10);
        helper.doClickandswitch(NykaaLuxePageLocators.nykaaman);
        Base.driver.navigate().refresh();
        test.log(Status.INFO,"clicked on NykaaMan");
        LoggerHandler.info("clicked on NykaaMan");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on NykaaMan");
        LoggerHandler.error("Cannot click on NykaaMan");
    }
   }
    /*
	 * a.Method Name:clickOnGroomingAdvice
	 * b.Author Name: Tanu Shree Das
	 * c.Description:The method finds the element GroomingAdvice and clicks on GrommingAdvice.
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void clickOnGroomingAdvice(){
    try {
        //Thread.sleep(1000);
        helper.dowaitForElementToBeVisible(NykaaLuxePageLocators.gromming, 5);
        helper.doClick(NykaaLuxePageLocators.gromming);
        test.log(Status.PASS,"clicked on Gromming Advice");
        LoggerHandler.info("clicked on Gromming Advice");
    } catch (Exception e) {
        test.log(Status.FAIL,"Cannot click on Gromming advice");
        LoggerHandler.error("Cannot click on Gromming advice");
    }
   }
    /*
	 * a.Method Name:verifyShaving
	 * b.Author Name: Tanu Shree Das
	 * c.Description: The method finds the element SHAVING & BEARD CARE and verifies the text SHAVING & BEARD CARE .
	 * d.Parameter:None
	 * e.Return type:void
	 */
   public void verifyShaving(String data){
        try {
            helper.doClick(NykaaLuxePageLocators.shaving);
            String shaving=helper.doGetText(NykaaLuxePageLocators.shavingandbeard);
            System.out.println(shaving);
            Assert.assertTrue(shaving.contains(data));
            Screenshot.captureFullScreenshot("Shaving and beard");
            test.log(Status.INFO,"Verified the text Shaving");
            LoggerHandler.info("Verified the text Shaving");
        } catch (AssertionError e) {
            test.log(Status.FAIL,"Cannot Verified the text Shaving");
            LoggerHandler.info("Cannot Verified the text Shaving");
        }
   } 
}