package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	//Declaration
	@FindBy(xpath="//input[@id='email']") private WebElement uId;
	@FindBy(xpath="//input[@id='pass']") private WebElement pwd;
	@FindBy(xpath="//button[@name='login']")  private WebElement btn;

	
	
	//Initialization
	
	 LoginPagePOM(WebDriver driver){

		PageFactory.initElements(driver,this);
	 }
	 
	 //Usage
	 
	 public void setUserId(String uname) {
		 uId.sendKeys(uname);
	 }
	 
	 public void setpassword(String pass) {
		 pwd.sendKeys(pass);
	 }
	 public void clickLoginBtn() {
		 btn.click();
	 }
}

