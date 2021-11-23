package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	
	
	public static ExtentReports getReports() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		
		reporter.config().setDocumentTitle("tests reports");
		
		reporter.config().setReportName("tests results");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "SLAHEDDINE JEDER");
		
		return extent;
		
		
	}
	
	
	
		
		
		
	}
	


