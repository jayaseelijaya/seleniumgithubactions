package stepDefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApplicationCardsPage;
import pages.LoginPage;
import pages.SurgeonListPage;
import utility.PropertiesFileReader;
import utility.Screenshot;
import utility.Utility;

public class DUU_ImageUpload_SSR1720_ListedApplicationSteps {

	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(DUU_ImageUpload_SSR1720_ListedApplicationSteps.class);
	Utility utility = new Utility();
	Exception exception = null;
	Boolean stepStatus = true;
	Screenshot screenshot = new Screenshot();
	String scenarioName;
	ApplicationCardsPage ap = new ApplicationCardsPage();
	SurgeonListPage sp = new SurgeonListPage();

	@Then("List of Application Card associated with selected facility\\/surgeon is displayed")
	public void list_of_application_card_associated_with_selected_facility_surgeon_is_displayed() {
		try {
			ap = new ApplicationCardsPage();
			ap.applicationcardText();
			logger.info("Step: List of Application Card is displayed to the user");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@When("user clicks on Back button")
	public void user_clicks_on_back_button() {
		try {
			ap = new ApplicationCardsPage();
			ap.clickBack();
			logger.info("Step : Back Button is clicked");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}

	}

	@When("user clicks on another surgeon from the surgeon selection screen")
	public void clicks_on_another_surgeon_from_the_surgeon_selection_screen() {
		try {
			ap = new ApplicationCardsPage();
			ap.selectSurgeon();
			logger.info("Step : Surgeon is selected which has Nine Application cards associated");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@When("user clicks on surgeon which deosn't have application card associated")
	public void user_clicks_on__surgeon_from_the_surgeon_selection_screen() {
		try {
			sp = new SurgeonListPage();
			sp.selectSurgNoAppCards();
			logger.info("Step : Surgeon is selected which has No Application cards associated");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("Notification message should be displayed to user if no application card is present")
	public void notification_message_no_application_card_displayed_to_the_user() {
		try {
			ap = new ApplicationCardsPage();
			String msg = ap.getMessage();
			logger.info("Notification message is displayed as : " + msg);
			logger.info("Step : Notification message is displayed to user if no cards associated");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}
}
