package stepDefs;

import java.util.List;
import java.util.Map;

import javax.annotation.WillCloseWhenClosed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApplicationHomepage;
import pages.ArticlePage;

import pages.CreatedArticlePage;
import pages.DeleteArticlePage;
import pages.EditArticlePage;
import pages.LoginPage;
import pages.ViewArticlePage;


public class ArticleTest {
	WebDriver driver;
	LoginPage loginPage;
	ApplicationHomepage applicationHomePage;
	ArticlePage articlePage;
	CreatedArticlePage createdArticlePage;
	EditArticlePage editArticlePage;
	DeleteArticlePage deleteArticlePage;
	ViewArticlePage viewArticlePage;
//	CheckoutPage checkoutPage;
	public ArticleTest() {
		
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		applicationHomePage = new ApplicationHomepage(driver);
		articlePage = new ArticlePage(driver);
		createdArticlePage = new CreatedArticlePage(driver);
		editArticlePage = new EditArticlePage(driver);
		viewArticlePage = new ViewArticlePage(driver);
		deleteArticlePage = new DeleteArticlePage(driver);
	}
	
	/*
	 * @BeforeTest public void setUp() {
	 * TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/");
	 * loginPage.navigateToLoginPage(); }
	 */
 
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/");
		loginPage.navigateToLoginPage();
		

	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User  provide {string} and {string}")
	public void user_provide_and(String userName,String password ) {
	   
		//loginPage.validLogin("TestUserBot@testmail.com", "TestUserBot");
		/*
		 * List<Map<String, String>> data = dataTable.asMaps(); String userName =
		 * data.get(0).get("username"); String password = data.get(0).get("password");
		 */
		loginPage.validLogin(userName, password);
	}
	@Then("User should be on home page")
	public void user_should_be_on_home_page() {
		applicationHomePage.validateHomePage();
		applicationHomePage.navigateToArticle();
	}
	@Given("User should be on New Article Page")
	public void user_should_be_on_new_article_page() {
	    articlePage.validateArticlePage();
	}
	@When("User  enters Article details")
	public void user_enters_article_details(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String title = data.get(0).get("title");
		String Desc = data.get(0).get("Desc");
		String Content = data.get(0).get("Content");
		String tag = data.get(0).get("tag");
		articlePage.sendTitle(title);
		articlePage.sendDescription(Desc);
		articlePage.sendContent(Content);
		articlePage.sendTags(tag);
	   
	}
	@Then("Article must be created")
	public void article_must_be_created() throws InterruptedException {
		articlePage.publishArticle();
	}

	
	@Given("User should be on Global Feed Page")
	public void user_should_be_on_global_feed_page() throws InterruptedException {
		viewArticlePage.navigateToHomePage();
		viewArticlePage.navigateToGlobalFeed();
		Thread.sleep(2000);
		createdArticlePage.validateCreatedArticle();
	}
	@When("User select an article {string}")
	public void user_select_an_article(String title) {
	   
		viewArticlePage.viewArticle(title);
	}
	@Then("Article details must be displayed")
	public void article_details_must_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		viewArticlePage.validateArticle();
	}
	

	@Given("Artilce detail page must be displayed")
	public void artilce_detail_page_must_be_displayed() {
		viewArticlePage.validateArticle();
	}
	@When("User update article detail {string}")
	public void user_update_article_detail(String title) {
		//Assert.assertTrue(editArticlePage.validateEditArticle());
		editArticlePage.navigateToEditArticle();
		editArticlePage.validateAndUpdateArticle(title);
		
		
	}
	@Then("Article detail must be updated")
	public void article_detail_must_be_updated() {
		createdArticlePage.validateCreatedArticle();
	}
	
	
	@Given("Article detail page must be displayed")
	public void article_detail_page_must_be_displayed() {
		createdArticlePage.validateCreatedArticle();
	}
	@When("User delete article")
	public void user_delete_article() {
		deleteArticlePage.deleteArticle();
		driver.switchTo().alert().accept();
	}
	@Then("Article must be deleted")
	public void article_must_be_deleted() {
	   System.out.println("Article is deleted");
	}


}
