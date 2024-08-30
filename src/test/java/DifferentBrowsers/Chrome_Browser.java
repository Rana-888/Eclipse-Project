package DifferentBrowsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {

	public static void main(String[] args) {
		
		//For Chrome Browser
		
		//Location of the exe file of browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Create object for chromedriver
		WebDriver driver = new ChromeDriver();
		
		//For Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://youtube.com/");
		
		//For close the browser
		driver.close();

	}

}
