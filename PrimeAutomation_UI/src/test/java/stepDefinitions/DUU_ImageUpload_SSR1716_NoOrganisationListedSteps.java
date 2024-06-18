package stepDefinitions;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import utility.PropertiesFileReader;
import utility.Screenshot;
import utility.Utility;

public class DUU_ImageUpload_SSR1716_NoOrganisationListedSteps {
	
	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(DUU_ImageUpload_SSR1716_NoOrganisationListedSteps.class);
	Utility utility = new Utility();
	Exception exception = null;
	Boolean stepStatus = true;
	Screenshot screenshot = new Screenshot();
	String scenarioName;
	
	@Then("Notification message should be displayed if organisation is not linked to user")
	public void notification_message_should_be_displayed_if_organisation_is_not_linked_to_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
