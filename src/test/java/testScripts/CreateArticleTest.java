package testScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;
import pages.CreatedArticlePage;
import pages.LoginPage;
import pages.ApplicationHomepage;

public class CreateArticleTest {
	WebDriver driver;
	LoginPage loginPage;
	ApplicationHomepage applicationHomePage;
	ArticlePage articlePage;
	CreatedArticlePage createdArticlePage;
	public CreateArticleTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		applicationHomePage = new ApplicationHomepage(driver);
		articlePage = new ArticlePage(driver);
		createdArticlePage = new CreatedArticlePage(driver);
		
	}
	
	/*
	 * @BeforeTest public void setUp() {
	 * TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/");
	 * loginPage.navigateToLoginPage(); }
	 * 
	 * @Test public void login() { loginPage.validLogin("TestUserBot@testmail.com",
	 * "TestUserBot");
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void navigateToHomePage() throws
	 * InterruptedException { applicationHomePage.validateHomePage();
	 * 
	 * applicationHomePage.navigateToArticle();
	 * 
	 * }
	 * 
	 * @Test(priority = 2) public void writeArticle() throws InterruptedException {
	 * articlePage.validateArticlePage(); articlePage.sendTitle("TestArticleDemo");
	 * articlePage.sendDescription("New Description");
	 * articlePage.sendContent("TestContent"); articlePage.sendTags("TestTag");
	 * articlePage.publishArticle();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority = 3) public void validateTheCreatedArticle() throws
	 * InterruptedException { createdArticlePage.validateCreatedArticle();
	 * 
	 * }
	 * 
	 * @AfterTest public void closeBrowser() {
	 * 
	 * TestBase.tearDown(); }
	 */

	/*
	 * @Given("User is on Login page") public void user_is_on_login_page() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("User  provide {string} and {string}") public void
	 * user_provide_and(String string, String string2) { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("User should be on home page") public void
	 * user_should_be_on_home_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Given("User should be on New Article Page") public void
	 * user_should_be_on_new_article_page() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("User  enters Article details") public void
	 * user_enters_article_details(io.cucumber.datatable.DataTable dataTable) { //
	 * Write code here that turns the phrase above into concrete actions // For
	 * automatic transformation, change DataTable to one of // E, List<E>,
	 * List<List<E>>, List<Map<K,V>>, Map<K,V> or // Map<K, List<V>>. E,K,V must be
	 * a String, Integer, Float, // Double, Byte, Short, Long, BigInteger or
	 * BigDecimal. // // For other transformations you can register a DataTableType.
	 * throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Article must be created") public void article_must_be_created() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("User should be on Global Feed Page") public void
	 * user_should_be_on_global_feed_page() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("User select an article {string}") public void
	 * user_select_an_article(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Article detail page must be displayed") public void
	 * article_detail_page_must_be_displayed() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Artilce detail page must be displayed") public void
	 * artilce_detail_page_must_be_displayed() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("User update article detail") public void user_update_article_detail()
	 * { // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Article detail must be updated") public void
	 * article_detail_must_be_updated() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Article detail page must be displayed") public void
	 * article_detail_page_must_be_displayed() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("User delete article") public void user_delete_article() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Article must be deleted") public void article_must_be_deleted() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User  provide {string} and {string}")
	public void user_provide_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("User should be on home page")
	public void user_should_be_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("User should be on New Article Page")
	public void user_should_be_on_new_article_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User  enters Article details")
	public void user_enters_article_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}
	@Then("Article must be created")
	public void article_must_be_created() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	@Given("User should be on Global Feed Page")
	public void user_should_be_on_global_feed_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User select an article {string}")
	public void user_select_an_article(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Article details must be displayed")
	public void article_details_must_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

	@Given("Artilce detail page must be displayed")
	public void artilce_detail_page_must_be_displayed() {
	    
	}
	@When("User update article detail")
	public void user_update_article_detail() {
	   
	}
	@Then("Article detail must be updated")
	public void article_detail_must_be_updated() {
	    
	}
	
	
	@Given("Article detail page must be displayed")
	public void article_detail_page_must_be_displayed() {
	   
	}
	@When("User delete article")
	public void user_delete_article() {
	  
	}
	@Then("Article must be deleted")
	public void article_must_be_deleted() {
	   
	}


}
