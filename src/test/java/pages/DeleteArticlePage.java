package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticlePage {
	
	@FindBy(xpath="(//*[text()=' Delete Article'])[1]")
	WebElement deleteArticleBtn;
	
	@FindBy(xpath="//*[@name='title']")
	WebElement title;
	
	
	
	/*
	 * @FindBy(id="last-name") WebElement lastName;
	 * 
	 * @FindBy(id="postal-code") WebElement postalCode;
	 * 
	 * @FindBy (xpath = "//*[@id='continue']") WebElement continueBtn;
	 * 
	 * @FindBy(id="finish") WebElement finishBtn;
	 * 
	 * @FindBy (xpath = "(//*[text()='Swag Labs'])[1]") WebElement title;
	 * 
	 * @FindBy (xpath = "//*[text()='Thank you for your order!']") WebElement
	 * thanksBtn;
	 */
	
	public DeleteArticlePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean validateDeleteArticle() {
		return deleteArticleBtn.isDisplayed();
	}
	
	public void deleteArticle() {
		deleteArticleBtn.click();
		
	}
	
	public void validateAndUpdateArticle(String titletxt) {
		title.sendKeys(titletxt);
	}
	
	

}
