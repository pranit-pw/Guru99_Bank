package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/V4/");
	

	}

}
