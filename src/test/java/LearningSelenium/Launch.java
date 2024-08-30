package LearningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {

	@Test
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();
		driver.get("https://youtube.com/");

	}

}
