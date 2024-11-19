package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//*[@name='email']")
	WebElement mailId;
	@FindBy(xpath="//*[@name='password']")
	WebElement pw;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginBtnHomePage;
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void navigateToLoginPage() {
		
		loginBtnHomePage.click();
	}
	
	public void validLogin(String uName, String pwd) {
		this.mailId.sendKeys(uName);
		pw.sendKeys(pwd);
		loginBtn.click();
	}

}
