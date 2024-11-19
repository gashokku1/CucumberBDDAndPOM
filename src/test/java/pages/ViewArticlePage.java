package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewArticlePage {
	
	@FindBy(xpath="//*[text()=' Edit Article']")
	WebElement editArticleBtn;
	
	@FindBy(xpath="//*[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//*[text()='Home']")
	WebElement homepagebtn;
	@FindBy(xpath="//*[text()='Global Feed']")
	WebElement globalFeedBtn;
	//String txt;
	@FindBy(xpath="(//div//a//h1)[1]")
	WebElement viewArticleBtn;
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
	
	public ViewArticlePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean validateEditArticle() {
		return editArticleBtn.isDisplayed();
	}
	
	public void navigateToEditArticle() {
		editArticleBtn.click();
	}
	
	public void validateAndUpdateArticle(String titletxt) {
		title.sendKeys(titletxt);
	}
	
	public void navigateToHomePage() {
		homepagebtn.click();
	}
	public void navigateToGlobalFeed() {
		globalFeedBtn.click();
	}
	
	public void viewArticle(String expectedTxt) {
		String title = viewArticleBtn.getText();
		if (title.equalsIgnoreCase(expectedTxt)) {
		viewArticleBtn.click();
		}
	}
	
	public boolean validateArticle() {
		 return viewArticleBtn.isDisplayed();
	}
	

}
