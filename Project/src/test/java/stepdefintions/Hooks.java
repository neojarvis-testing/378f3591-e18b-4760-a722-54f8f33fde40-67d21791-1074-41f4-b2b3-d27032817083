package stepdefintions;



import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Report;

public class Hooks extends Base{
    static ExtentReports reports;

    @BeforeAll
    public static void report(){
        reports = Report.generateExtenteReports("NYKAA_Report");
    }

    @Before
    public void open(){
        openBrowser();
    }

    @After
    public void close(){
        driver.quit();
    }

    @AfterAll
    public static void generateReport(){
        reports.flush();
    }
}
