package com.absa.qa.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.absa.qa.base.TestBase;



public class ScreenshotBase extends TestBase {

	
	public static void failed(String un)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File("F:/Projects/QA Test/ScreenshotFail/"+un+"-"+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
	public static void success(String un1)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File("F:/Projects/QA Test/Screenshotpass/"+un1+"-"+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
	public static void onfinish(String un2)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    try {
				FileUtils.copyFile(scrFile, new File("F:/Projects/QATestAutomationAssessment/OnFinish/"+un2+"-"+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
