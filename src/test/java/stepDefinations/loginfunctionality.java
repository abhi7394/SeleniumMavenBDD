package stepDefinations;

import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class loginfunctionality {

	LoginPage loginPage;
	HomePage homePage;

	@Given("^User is on zoho landing page$")
	public void user_is_on_zoho_landing_page() {
		BaseTest.startBrowser();
		loginPage = new LoginPage();
	}

	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String s1, String s2)
			throws InterruptedException {
		loginPage.checklogin(s1, s2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		homePage = new HomePage();

		Assert.assertEquals(homePage.usernameExists(), "abhi7354");
	}
}
