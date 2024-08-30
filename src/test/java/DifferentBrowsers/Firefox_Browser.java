package DifferentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser {

	public static void main(String[] args) {
		
		//For Firefox Browser
		
				//Location of the exe file of browser		
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				
				//Create object for Firefox driver
				WebDriver driver = new FirefoxDriver();
				
				//For Maximize the window
				driver.manage().window().maximize();
					
				//Navigate to the URL
				driver.get("https://youtube.com/");
				
				//For close the browser
			//	driver.close();

	}

}
