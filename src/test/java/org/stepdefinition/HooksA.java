package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClassAdactinT;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksA extends BaseClassAdactinT {
   @Before
   public void beforeScenario() throws InterruptedException {
	   ChromeBrowser();
	   MaxWindow();
	   Thread.sleep(3000);
   }
   @After
   public void afterScenario(Scenario s) throws IOException, InterruptedException {
	   /*String name=s.getName();
	     String filename=name.replace(" ","_");
	     Thread.sleep(3000);
	     takeSnap(filename);*/
	   if(s.isFailed()) {
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
		   s.embed(screenshot,"image/png");
	   }
	   CloseBrowser();
	   System.out.println("Scenario Ends...");
   }
   
	
}
