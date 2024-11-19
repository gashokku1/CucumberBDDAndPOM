package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedArticlePage {
	
	@FindBy(xpath="//h1")
	WebElement articleTitle;
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
	
	public CreatedArticlePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean validateCreatedArticle() {
		return articleTitle.isDisplayed();
		
	}
	
	public void validateTitle(String title) {
		String titletxt = articleTitle.getText();
		if (titletxt.equalsIgnoreCase(title)) {
			System.out.println(titletxt);
		}
	}
	

}
