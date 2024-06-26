package UtilsPackage;
//This is a Listener Class
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.configuration.Theme;

import tech.grasshopper.pdf.extent.ExtentPDFCucumberReporter;

public class Reporting extends TestListenerAdapter{
//https://www.pavantestingtools.com/2017/11/testng-listeners-extent-reports-in.html

	 public ExtentPDFCucumberReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest logger;


//	 public void onStart(ITestContext testContext){
//
//      String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //Time stamp
//      String repName="Test-Report-"+timeStamp+".html";
//
//	  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);//specify location of the report
//	  htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
//
//	  extent=new ExtentReports();
//
//	  extent.attachReporter(htmlReporter);
//	  extent.setSystemInfo("Host name","localhost");
//	  extent.setSystemInfo("Environemnt","QA");
//	  extent.setSystemInfo("user","SHARIF");
//
//	  htmlReporter.config().setDocumentTitle("Inet Banking Test Automation Report"); // Tile of report
//	  htmlReporter.config().setReportName("Functional Test Report"); // name of the report
//	 // htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart/
//	  htmlReporter.config().setTheme(Theme.STANDARD);
//	 }
//
//	 public void onTestSuccess(ITestResult tr)
//	 {
//	  logger=extent.createTest(tr.getName()); // create new entry in th report
//	  logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
//	 }
//
//	 public void onTestFailure(ITestResult tr)
//	 {
//	  logger=extent.createTest(tr.getName()); // create new entry in th report
//	  logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted
//
//	  String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
//	  //logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
//	  File f = new File(screenshotPath);
//	  if(f.exists())
//	  {
//		  try {
//			logger.fail("Screenshot is below: "+ logger.addScreenCaptureFromPath(screenshotPath));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  }
//	 }

	 public void onTestSkipped(ITestResult tr)
	 {
	  logger=extent.createTest(tr.getName()); // create new entry in th report
	  logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	 }

	 public void onFinish(ITestContext testContext)
	 {
	  extent.flush();
	 }





}
