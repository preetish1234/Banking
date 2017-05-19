package utilitys;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class Baseclasse{
	
	public static ExtentHtmlReporter htmlReport;	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void Logconfig()throws ClassNotFoundException, SQLException
	{
	PropertyConfigurator.configure("C:\\Users\\Preetish Kumar\\Desktop\\Banking/log.properties");
	}
	
	
	@BeforeSuite(alwaysRun=true)
	public  void setUp(){
		  {

			  try {
			  
			  htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/MyOwnReport.html");  
		    	extent = new ExtentReports(); 
			    extent.attachReporter(htmlReport);
			
			 extent.setSystemInfo("OS", "Win 8.1");
			 extent.setSystemInfo("Host Name", "Preetish");
			 extent.setSystemInfo("Envirment", "QA");
			 extent.setSystemInfo("User Name", "Preetish Kumar");
		 htmlReport.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		 htmlReport.config().setDocumentTitle("Banking Report");
		 htmlReport.config().setReportName("My Owm report");
		 htmlReport.config().setTestViewChartLocation(ChartLocation.TOP);
		  }
		  catch (Exception e) {
				
				e.printStackTrace();
		  }
			  }
	}
	@AfterMethod(alwaysRun=true)
	public void getResult(ITestResult result) throws IOException
	{
		try {
			if(result.getStatus()==ITestResult.FAILURE){
				String screenshotPath = Getscreenshot.captureScreenShot(driver, "screenshotName");
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " Test case FAILED due to below issue", ExtentColor.RED));
				test.fail(result.getThrowable());
			    test.fail("Snapshot below: "+ test.addScreenCaptureFromPath(screenshotPath));		
			}
			else if(result.getStatus()==ITestResult.SUCCESS){
				test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test case PASSED", ExtentColor.GREEN));
			
			}
			else if(result.getStatus()==ITestResult.SKIP){
				test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test case SKIPPED", ExtentColor.YELLOW));
				test.skip(result.getThrowable());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	@AfterSuite(alwaysRun=true)
	public void tearDown(){
		try {
			extent.flush();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}

