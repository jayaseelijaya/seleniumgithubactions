package stepDefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FacilityListPage;
import pages.LoginPage;
import pages.SurgeonListPage;
import utility.PropertiesFileReader;
import utility.ScreenRecording;
import utility.Screenshot;
import utility.Utility;

public class DUU_ImageUpload_SSR1718_SurgeonSelectionSteps {
	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(DUU_ImageUpload_SSR1718_SurgeonSelectionSteps.class);
	Utility utility = new Utility();
	Exception exception = null;
	Boolean stepStatus = true;
	Screenshot screenshot = new Screenshot();
	String scenarioName;
	LoginPage lp = new LoginPage();
	SurgeonListPage sp = new SurgeonListPage();
	FacilityListPage fp = new FacilityListPage();
	public static WebDriver driver;

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		exception = null;
	}

	@AfterStep
	public void afterStep() {
		String exceptionName = null;
		if (exception != null) {
			stepStatus = false;
			logger.info(
					"\n******************************STEP FAILED*****************************************************");
			exceptionName = exception.getClass().getSimpleName();
			logger.info("Exception Type : " + exceptionName);
			if (exceptionName.equals("NoSuchElementException")) {
				logger.info("Element could not be found");
			} else if (exceptionName.equals("ElementNotSelectableException")) {
				logger.info("Element could not be not selected");
			} else if (exceptionName.equals("NoSuchFrameException")) {
				logger.info("Frame does not exist");
			} else if (exceptionName.equals("NoSuchWindowException")) {
				logger.info("Window does not exist");
			} else if (exceptionName.equals("TimeoutException")) {
				logger.info("Element could not be found within the specified time");
			} else if (exceptionName.equals("ConnectionClosedException")) {
				logger.info("Driver is disconnected");
			} else if (exceptionName.equals("AssertionError")) {
				logger.info(exceptionName);
			} else {
				logger.info("Exception occured : " + exceptionName);
			}
			logger.info("Exception Details below:\n");
			logger.info(exception.toString());
			logger.info(
					"**********************************************************************************************");
			System.out.println(stepStatus);
		}
		if (stepStatus == false) {
			logger.info("TESTCASE HAS FAILED AT THIS STEP");
			Assert.fail();
		}
	}

	@When("User clicks on facility which has surgeon associated")
	public void user_clicks_on_facility_which_has_surgeon_associated() {
		try {
			lp = new LoginPage();
			fp = new FacilityListPage();
			fp.selectFacilityListedSurgeon();
			logger.info("Step : Facility is selected from the list which has surgeon associated");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("surgeon list should be display as per the selected facility")
	public void surgeon_list_should_be_display_as_selet_default() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			sp.getSurgeonText();
			logger.info("Step : Surgeon associated list is displayed to the user");
			sp.isNextButtonDisabled();
			logger.info("Step : Next Button is in disabled mode if surgeon is not selected");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("user clicks on any of the surgeon listed")
	public void user_clicks_on_any_of_the_surgeon_listed() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			sp.selectSurgeon();
			logger.info("Step : Surgeon is selected from the list displayed to the user");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("Next button should be in enabled mode after selecting surgeon")
	public void next_button_should_be_in_enabled_mode_after_selecting_surgeon() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			sp.isNextButtonDisabled();
			logger.info("Step : Next Button is in enabled mode after surgeon selection");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			sp.NextBtnSurgeon();
			logger.info("Step : Next Button is Clicked");
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@When("User clicks on facility which has no surgeon associated")
	public void user_clicks_on_facility_which_has_no_surgeon_associated() {
		try {
			lp = new LoginPage();
			fp = new FacilityListPage();
			fp.selectfacilitynoSurgeon();
			logger.info("Step : Facility is selected from the list which has no surgeon associated");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("notification message should be displayed to the user")
	public void notification_message_should_be_displayed_to_the_user() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			String message = sp.verifySurgeonmsg();
			logger.info("Notification message : " + message);
			logger.info("Step : Notification message is displayed to the user");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("Back button should be in enabled mode & clickable")
	public void back_button_should_be_in_enabled_mode_clickable() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			sp.isBackButtonEnabled();
			logger.info("Step : Back Button is in enabled mode & clickable ");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("Next button should be in disabled mode & non-clickable")
	public void next_button_should_be_in_disabled_mode_non_clickable() {
		try {
			lp = new LoginPage();
			sp = new SurgeonListPage();
			sp.isNextButtonDisabled();
			logger.info("Step : Next Button is in disabled mode if no surgeon is present");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}

	@Then("user is not able to proceed with data upload if no surgeon selected")
	public void user_is_not_able_to_proceed_with_data_upload_if_no_surgeon_selected() {

		try {
			sp = new SurgeonListPage();
			logger.info("No Surgeon is selected from the surgeon selection screen");
			sp.isNextButtonDisabled();
			logger.info("Step : Next Button is in disabled mode if no surgeon is selected from the list");
			LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		} catch (Exception e) {
			logger.error("Step: Caught exception:: " + e.toString());
			exception = e;
		}
	}
}
