
package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.PropertiesFileReader;
import utility.Screenshot;
import utility.Utility;

public class UploadFilePage {
	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(UploadFilePage.class);
	Utility utility = new Utility();
	Screenshot screenshot = new Screenshot();

	/**
	 * This method is used to get Title of the page.
	 * 
	 * @return String
	 * @throws IOException
	 */
	public String getPageTitle() {
		String Title = LoginPage.driver.getTitle();
		return Title;
	}

	/**
	 * This method is used to perform click.
	 * 
	 * @throws IOException
	 */
	public void clickOnUploadFilesFromLeftMenu() throws IOException {
		WebElement history = utility.initializeElement(LoginPage.driver, "uploaddashboard.btn.search.xpath");
		if (!history.isDisplayed()) {
			WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.img.xpath");
			WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.elementToBeClickable(element));

			wait.click();
		} else {
			WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.img.xpath");
			WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.elementToBeClickable(element));

			wait.click();
		}
	}

	/**
	 * This method is used to check right sides components displayed or not
	 * 
	 * @return WebElement
	 * @throws IOException
	 */
	public WebElement isRightSideInfoDisplayed(String component) throws IOException {
		LoginPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		if (component.equalsIgnoreCase("Upload file icon")) {
			WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.img.uploadicon.xpath");
			WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.visibilityOf(element));
			return wait;
		}
		if (component.equalsIgnoreCase("Upload file button")) {
			WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.btn.upload.xpath");
			WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
					.until(ExpectedConditions.visibilityOf(element));
			return wait;
		}
		logger.error("Unable to find the WebElement as locator is null or element name is not found " + component);
		return null;
	}

	/**
	 * This method is used to check facility selection modal displayed or not.
	 * 
	 * @return String
	 * @throws IOException
	 */
	public boolean isFacilitySelectionModalDisplayed() throws IOException {
		return utility.initializeElement(LoginPage.driver, "uploadfiles.modal.newfacilityselection.xpath")
				.isDisplayed();
	}

	/**
	 * This method is used to check surgeon selection modal displayed or not.
	 * 
	 * @return String
	 * @throws IOException
	 */
	public boolean isSurgeonSelectionModalDisplayed() throws IOException {
		return utility.initializeElement(LoginPage.driver, "uploadfiles.modal.newsurgeonselection.xpath").isDisplayed();
	}

	/**
	 * This method is used to perform click.
	 * 
	 * @throws IOException
	 */
	public void clickOnAnyFacility() throws IOException {
		WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.facilityselection.second.xpath");
		WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
		wait.click();
	}

	/**
	 * This method is used to perform select a surgeon.
	 * 
	 * @throws IOException
	 */
	public void selectASurgeon() throws IOException {
		WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.surgeonselection.first.xpath");
		WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
		wait.click();
	}

	/**
	 * This method is used to perform select a surgeon.
	 * 
	 * @throws IOException
	 */
	public void selectApplication() throws IOException {
		WebElement element = utility.initializeElement(LoginPage.driver,
				"uploadfiles.applicationselection.first.xpath");
		WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
		wait.click();
	}

	/**
	 * This method is used to perform click.
	 * 
	 * @throws IOException
	 */
	public void clickOnNextButton() throws IOException {
		WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.btn.surgeon.next.xpath");
		WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
		wait.click();
	}

	/**
	 * This method is used to perform click.
	 * 
	 * @throws IOException
	 */
	public void clickOnUploadFilesIcon() throws IOException {
		WebElement element = utility.initializeElement(LoginPage.driver, "uploadfiles.img.xpath");
		WebElement wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
		wait.click();
	}

	/**
	 * This method is used to perform click.
	 * 
	 * @throws IOException
	 */
	public void clickOnBrowsePcButton() throws IOException {
		utility.initializeElement(LoginPage.driver, "uploadfiles.browsepc.btn.browsepc.xpath").click();
	}

	/**
	 * This method is to check the upload files page header
	 *
	 * @throws IOException
	 * @return Boolean
	 */
	public Boolean checkUploadFilesHeader() throws IOException {
		Boolean bool = utility.initializeElement(LoginPage.driver, "upload.txt.title.xpath").isDisplayed();
		if (bool == true) {
			logger.info("Upload files page header is displayed");
			return true;
		} else {
			logger.info("Upload files page header is not displayed");
			return false;
		}
	}

	/**
	 * This method is to upload valid dicom files using the windows file explorer
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void uploadUsingWindows() throws IOException, InterruptedException {
		Actions actions = new Actions(LoginPage.driver);
		WebElement uploadBox = utility.initializeElement(LoginPage.driver, "upload.dragdrop.xpath");
		actions.moveToElement(uploadBox).click().build().perform();
		Thread.sleep(5000);
		screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		String SSPath = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "1",
				LoginPage.driver);
		String SSPath2 = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "2",
				LoginPage.driver);
		String autoItScriptPath = System.getProperty("user.dir") + "\\src\\test\\resources\\autoit\\FileUpload.exe";
		String validDicomFolderPath = System.getProperty("user.dir") + "\\src\\test\\resources\\datasets\\valid\\";
		String[] cmd = { autoItScriptPath, validDicomFolderPath, SSPath, SSPath2 };
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(10000);
	}

	/**
	 * This method is to upload invalid dicom files using the windows file explorer
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void uploadInvalidUsingWindows() throws IOException, InterruptedException {
		Actions actions = new Actions(LoginPage.driver);
		WebElement uploadBox = utility.initializeElement(LoginPage.driver, "upload.dragdrop.xpath");
		actions.moveToElement(uploadBox).click().build().perform();
		Thread.sleep(5000);
		screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		String SSPath = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "1",
				LoginPage.driver);
		String SSPath2 = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "2",
				LoginPage.driver);
		String autoItScriptPath = System.getProperty("user.dir") + "\\src\\test\\resources\\autoit\\FileUpload.exe";
		String validDicomFolderPath = System.getProperty("user.dir") + "\\src\\test\\resources\\datasets\\invalid\\";
		String[] cmd = { autoItScriptPath, validDicomFolderPath, SSPath, SSPath2 };
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(10000);
	}

	/**
	 * This method is to upload non dicom files using the windows file explorer
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void uploadNonDicomUsingWindows() throws IOException, InterruptedException {
		Actions actions = new Actions(LoginPage.driver);
		WebElement uploadBox = utility.initializeElement(LoginPage.driver, "upload.dragdrop.xpath");
		actions.moveToElement(uploadBox).click().build().perform();
		Thread.sleep(5000);
		screenshot.screenshot(new Throwable().getStackTrace()[0].getMethodName(), LoginPage.driver);
		String SSPath = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "1",
				LoginPage.driver);
		String SSPath2 = screenshot.autoITScreenshot(new Throwable().getStackTrace()[0].getMethodName() + "2",
				LoginPage.driver);
		String autoItScriptPath = System.getProperty("user.dir") + "\\src\\test\\resources\\autoit\\FileUpload.exe";
		String validDicomFolderPath = System.getProperty("user.dir") + "\\src\\test\\resources\\datasets\\non_dicom\\";
		String[] cmd = { autoItScriptPath, validDicomFolderPath, SSPath, SSPath2 };
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(10000);
	}
}
