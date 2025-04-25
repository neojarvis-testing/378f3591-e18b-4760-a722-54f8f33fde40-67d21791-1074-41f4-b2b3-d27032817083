package stepdefinitions;



import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Report;
import utils.SendEmailWithAttachment;

public class Hooks extends Base{
    static ExtentReports reports;


    /**
     * A. Method Name: report
     * B. Author Name: Group 7
     * C. Description: This method is executed before all the test cases. It initializes the extent report for the test suite.
     * D. Parameters: None
     * E. Return Type: void
     */


    @BeforeAll
    public static void report(){
        reports = Report.generateExtenteReports("NYKAA_Report");
    }


    /**
     * A. Method Name: open
     * B. Author Name: Group 7
     * C. Description: This method is executed before each test case. It opens the browser and sets up the environment.
     * D. Parameters: None
     * E. Return Type: void
     */


    @Before
    public void open(){
        openBrowser();
    }

    /**
     * A. Method Name: close
     * B. Author Name: Group 7
     * C. Description: This method is executed after each test case. It quits the browser driver and cleans up resources.
     * D. Parameters: None
     * E. Return Type: void
     */


    @After
    public void close(){
        driver.quit();
    }


    /**
     * A. Method Name: generateReport
     * B. Author Name: Group 7
     * C. Description: This method is executed after all the test cases. It flushes and finalizes the extent report for the test suite.
     * D. Parameters: None
     * E. Return Type: void
     */


    @AfterAll
    public static void generateReport(){
        reports.flush();
        try {
            SendEmailWithAttachment.sendEmailWithAttachment("likithareddy177@gmail.com", "likithareddy177@gmail.com", "BDD_Report", "Hey Hi");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
