package DifferentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser {

	public static void main(String[] args) {
		
		//For Edge Browser
		
				//Location of the exe file of browser		
				System.setProperty("webdriver.Edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				
				//Create object for Edge driver
				WebDriver driver = new EdgeDriver();
				
				//For Maximize the window
				driver.manage().window().maximize();
				
				//Navigate to the URL
				driver.get("https://youtube.com/");
				
				//For close the browser
				driver.close();

	}

}
