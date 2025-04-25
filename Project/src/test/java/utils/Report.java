package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class Report {
    public static ExtentTest test;
    public static ExtentReports reports;
 
    /**
     * Method Name: generateExtenteReports
     *
     * Description: Creates and initializes an ExtentReports instance with ExtentSparkReporter for generating HTML reports.
     *
     * Parameters:
     * String reportName - Name of the report file (without extension) to be generated in the "/reports" directory.
     *
     * Return Type: ExtentReports - Returns the configured ExtentReports instance.
     */
    public static ExtentReports generateExtenteReports(String reportName){
        ExtentSparkReporter sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+reportName+".html");
        reports= new ExtentReports();
        reports.attachReporter(sparkReporter);
        return reports;
    }

    /**
     * Method Name: addScreenshotToReport
     * 
     * Description: Captures a screenshot and adds it to the provided test report.
     * 
     * Parameters:
     * String file name-To pass the filename
     * ExtentTest test - ExtentTest instance where the screenshot will be attached.
     * WebDriver driver - WebDriver instance used for capturing the screenshot.
     * String message - Message describing the screenshot or context.
     * 
     * Return Type: void - This method does not return any value.
     */
    public static void addScreenshotToReport(String filename,ExtentTest test, WebDriver driver, String message) {
        try {
            String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            TakesScreenshot ts=(TakesScreenshot)Base.driver;
	    	File source=ts.getScreenshotAs(OutputType.FILE);
            String screenshotPath = System.getProperty("user.dir") + "/reports/" +filename+"_"+timestamp+".png";
            File destFile = new File(screenshotPath);
            FileUtils.copyFile(source,destFile);
           test.info(message,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}