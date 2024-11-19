package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.Assert;

public class ApplicationHomepage {
	
	@FindBy(xpath="//*[text()='New Article']")
	WebElement newArticleTab;
	/*
	 * @FindBy(id="add-to-cart-sauce-labs-bike-light") WebElement itemTwo;
	 * 
	 * @FindBy(id="shopping_cart_container") WebElement cartIcon;
	 * 
	 * @FindBy (xpath = "//span[contains(text(),'Products')]") WebElement
	 * productsTitle;
	 */
	
	public ApplicationHomepage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean validateHomePage() {
		//Assert.check(newArticleTab.isDisplayed());
		return newArticleTab.isDisplayed();
	}
	
	public void navigateToArticle() {
		newArticleTab.click();
	}
	
	/*
	 * public boolean isOnProducts() { return productsTitle.isDisplayed();
	 * 
	 * }
	 */


}
