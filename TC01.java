package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class TC01 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get(Configurations.appURL="https://www.facebook.com/login/");
		driver.manage().window().maximize();
		LoginPagePOM login=new LoginPagePOM(driver);
		
		//TC01
		login.setUserId("Tester");
		login.setpassword("12345");
		login.clickLoginBtn();
	
	}


}



	


