package pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.PropertiesFileReader;
import utility.Utility;

public class BrowsePcScreenPage {
	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(BrowsePcScreenPage.class);
	Utility utility = new Utility();
	
	/**
	 * This method is used to check browse pc screen displayed or not.
	 * 
	 * @throws IOException
	 */
	public boolean isBrowsePCScreenDisplayed() throws IOException {
		logger.info("Browse PC Screen is displayed : "
				+ utility.initializeElement(LoginPage.driver, "browsepc.screen.xpath").isDisplayed());
		return utility.initializeElement(LoginPage.driver, "browsepc.screen.xpath").isDisplayed();
			}
	
	/**
	 * This method is used to check if top center header displayed or not
	 * 
	 * @return boolean
	 * @throws IOException
	 */
	public Boolean isTopCenterHeaderDisplayed() throws IOException {
		logger.info("Top center header displayed is : "
				+ utility.initializeElement(LoginPage.driver, "browsepc.screen.title.xpath").getText());
		return utility.initializeElement(LoginPage.driver, "browsepc.screen.title.xpath").isEnabled();
	}
	
	/**
	 * This method is used to check browse pc screen components displayed or not
	 * 
	 * @return WebElement
	 * @throws IOException
	 */
	public WebElement isBrowsePcInfoDisplayed(String component) throws IOException {
		LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		if (component.equalsIgnoreCase("select files to upload or drop below")) {
			WebElement element = utility.initializeElement(LoginPage.driver,
					"browsepc.modal.title.xpath");
			WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.visibilityOf(element));
			return wait;
		}
		if (component.equalsIgnoreCase("Back button")) {
			return utility.initializeElement(LoginPage.driver,
					"browsepc.btn.back.xpath");
		}
		if (component.equalsIgnoreCase("Browse PC button")) {
			return utility.initializeElement(LoginPage.driver,
					"browsepc.btn.browsepc.xpath");
		}
		if (component.equalsIgnoreCase("Drag and Drop Here")) {
			return utility.initializeElement(LoginPage.driver,
					"browsepc.txt.xpath");
		}
		if (component.equalsIgnoreCase("Dotted line box")) {
			return utility.initializeElement(LoginPage.driver,"browsepc.dottedbox.xpath");
		}
		if (component.equalsIgnoreCase("Upload Icon")) {
			return utility.initializeElement(LoginPage.driver,
					"browsepc.img.xpath");
		}
		if (component.equalsIgnoreCase("Browse PC button highlighted")) {
			return utility.initializeElement(LoginPage.driver,
					"browsepc.btn.browsepc.xpath");
		}
		logger.error("Unable to find the WebElement as locator is null or element name is not found " + component);
		return null;
	}

}
