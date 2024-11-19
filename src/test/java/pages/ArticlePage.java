package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ArticlePage {
	
	@FindBy(css="[name=title]")
	WebElement title;
	@FindBy(css ="fieldset> [name=description]")
	WebElement description;
	
	@FindBy (css = "fieldset> [name=body]")
	WebElement content;
	@FindBy(css = "fieldset> [name=tags]")
	WebElement tags;
	@FindBy(xpath = "//*[text()='Publish Article']")
	WebElement publishBtn;
	
	public ArticlePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean  validateArticlePage() {
		return title.isDisplayed();
	}
	
	public void sendTitle(String titleTxt) {
		Actions act = new Actions(TestBase.getDriver());
		act.moveToElement(title);
		//JavascriptExecutor
		title.sendKeys(titleTxt);
	}
	public void sendDescription(String description) {
		
		this.description.sendKeys(description);
	}
	public void sendContent(String content) {
		
		this.content.sendKeys(content);
	}
	public void sendTags(String tags) {
		//JavascriptExecutor
		this.tags.sendKeys(tags);
	}
	public void publishArticle() throws InterruptedException {
		//Actions act = new Actions(TestBase.getDriver());
		//act.moveToElement(submit);
		//JavascriptExecutor
		publishBtn.click();
		Thread.sleep(3000);
		
	}
	

}
