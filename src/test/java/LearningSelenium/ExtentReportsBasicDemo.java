package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		//Start Reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");

      //Location of the exe file of browser		
      		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      		
      		//Create object for chromedriver
      		driver = new ChromeDriver();
      		
      		//extent report will be perform for the status
      		test1.log(Status.INFO, "Starting Test Case");
      		
      		//For Maximize the window
      		driver.manage().window().maximize();
      		
      		//Navigate to the URL
      		driver.get("https://www.google.com/");
      		
      		//For pass the test case use log command
      		test1.pass("Navigated to google.com");
      		
      		//path of the field and pass the value
      		driver.findElement(By.name("q")).sendKeys("Automation");
      		
      	    //For pass the test case use log command
      		test1.pass("Entered text in SearchBox");
      		
      		//Path of the button and click on it by keys
      	//	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
      		
      	    //For pass the test case use log command
      	//	test1.pass("Press keyboard enter key");
      		
      		//For close the browser 
      		driver.close();
      		
      		//For quit the browser
      		driver.quit();
      		
      		//For pass the test case use log command
      		test1.pass("Closed the browser");
      		
      		//Info of completing the test
      		test1.info("Test Completed");
      		
      		 // creates a toggle for the given test, adds all log events under it    
            ExtentTest test2 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");

          //Location of the exe file of browser		
          		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          		
          		//Create object for chromedriver
          		driver = new ChromeDriver();
          		
          		//extent report will be perform for the status
          		test2.log(Status.INFO, "Starting Test Case");
          		
          		//For Maximize the window
          		driver.manage().window().maximize();
          		
          		//Navigate to the URL
          		driver.get("https://www.google.com/");
          		
          		//For pass the test case use log command
          		test2.pass("Navigated to google.com");
          		
          		//path of the field and pass the value
          		driver.findElement(By.name("q")).sendKeys("Automation");
          		
          	    //For pass the test case use log command
          		test2.pass("Entered text in SearchBox");
          		
          		//Path of the button and click on it by keys
              	driver.findElement(By.name("btnK")).submit();
          		
          	    //For pass the test case use log command
          		test2.fail("Not enter the keyboard key");
          		
          		//For close the browser 
          		driver.close();
          		
          		//For quit the browser
          		driver.quit();
          		
          		//For pass the test case use log command
          		test2.pass("Closed the browser");
          		
          		//Info of completing the test
          		test2.info("Test Completed");
      		
      		// calling flush writes everything to the log file
            extent.flush();
        
	}

}
