package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import utility.PropertiesFileReader;
import utility.Utility;

public class FileUploadPage {
	
	PropertiesFileReader reader = new PropertiesFileReader();
	final static Logger logger = Logger.getLogger(FileUploadPage.class);
	Utility utility = new Utility();
	UserInformationPage uiPage = new UserInformationPage();
	
	/***
	 * This method is used to locate the upload button.
	 * @return
	 * @throws IOException 
	 */
	public WebElement getUploadBtn() throws IOException {
		return uiPage.isUploadFilesComponentsDisplayed("upload button");
	}
	
	
	/**
	 * This method is used to locate upload icon.
	 * @return
	 * @throws IOException
	 */
	public WebElement uploadIcon() throws IOException {
		return uiPage.isUploadFilesComponentsDisplayed("upload icon");
	}
	
	
	
	/**
	 * This method is used to check upload button is displayed.
	 * @return
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public Boolean isUploadBtnDisplayed() throws IOException, InterruptedException {
		Thread.sleep(2000);
		logger.info("Upload button is displayed : "
				+  getUploadBtn().isDisplayed());
		return  getUploadBtn().isDisplayed();
	}
	
	/**
	 * This method is used to check upload icon is displayed
	 * @return
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public Boolean isUploadIconDisplayed() throws IOException, InterruptedException {
		Thread.sleep(2000);
		logger.info("Upload icon is displayed : "
				+  getUploadBtn().isDisplayed());
		return  uploadIcon().isDisplayed();
	}

	/**
	 * This method is used to locate site selection elements
	 * @param element
	 * @return
	 * @throws IOException 
	 */
	public WebElement siteSelectionScreen(String element) throws IOException {
		if(element.equalsIgnoreCase("Header"))
			return utility.initializeElement(LoginPage.driver,
					"upload.siteSelectionHeader.xpath");
		else if(element.equalsIgnoreCase("Label"))
			return utility.initializeElement(LoginPage.driver,
					"upload.SiteSelectionLable.xpath");
		else if(element.equalsIgnoreCase("Button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.nextbutton.xpath");
		return null;
		
	}
	
	/**
	 * This method is used to check whether site selection screen is displayed 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public Boolean isSiteSelectionScreenDisplayed() throws IOException, InterruptedException {
		Thread.sleep(2000);
		Boolean isDsiplayed = false;
		logger.info("Header is displayed as : " + siteSelectionScreen("Header").getText());
		logger.info("Label is displayed as : " + siteSelectionScreen("Label").getText());
		if(siteSelectionScreen("Header").isDisplayed())
			isDsiplayed = true;
		if(siteSelectionScreen("Label").isDisplayed())
			isDsiplayed= true;
		logger.info("Site selection screen is displayed");
		return isDsiplayed;
	}
	
	
	/**
	 * This method is used to select a site from the list in site selection screen
	 * @param index
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void selectSite(Integer index) throws IOException, InterruptedException {
		Thread.sleep(1000);
		List<WebElement> availableSites=utility.initializeElements(LoginPage.driver,"upload.SiteSelctList.xpath");
		if(availableSites.size()== 0) {
			WebElement element = utility.initializeElement(LoginPage.driver,"upload.selectedsite.xpath");
			logger.info("Available site:" + element.getText());
			element.click();
			logger.info("Selected site: "+ element.getText());
			}
		else {
			logger.info("Available sites:");
			for(WebElement webelement:availableSites) {
				logger.info("site: "+ webelement.getText());
			}
			availableSites.get(index).click();
			logger.info("Selected site: " + availableSites.get(index).getText());
		}
	}
	
	/**
	 * This method is used to check site is selected
	 * @return
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public Boolean isSiteSelected() throws IOException, InterruptedException {
		Thread.sleep(1000);
		return utility.initializeElement(LoginPage.driver,"upload.selectedsite.xpath").isDisplayed();
	}
	
	/**
	 * This method is used to click on next button
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public void clickNextBtn() throws IOException, InterruptedException {
		Thread.sleep(1000);
		siteSelectionScreen("Button").click();
		logger.info("Next button is clicked");
	}
	
	/**
	 * This method is used to locate surgeon selection screen elements
	 * @param element
	 * @return
	 * @throws IOException 
	 */
	public WebElement surgeonSelectionScreen(String element) throws IOException {
		if(element.equalsIgnoreCase("Header"))
			return utility.initializeElement(LoginPage.driver,
					"upload.surgeonselectionHeader.xpath");
		else if(element.equalsIgnoreCase("Label"))
			return utility.initializeElement(LoginPage.driver,
					"upload.surgeonselectionLable.xpath");
		else if(element.equalsIgnoreCase("Button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.nextbutton.xpath");
		return null;
		
	}
	
	/**
	 * This method is used to check whether surgeon selection screen is displayed 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public Boolean isSurgeonSelectionScreenDisplayed() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Boolean isDsiplayed = false;
		logger.info("Header is displayed as : " + surgeonSelectionScreen("Header").getText());
		logger.info("Label is displayed as : " + surgeonSelectionScreen("Label").getText());
		if(surgeonSelectionScreen("Header").isDisplayed())
			isDsiplayed = true;
		if(surgeonSelectionScreen("Label").isDisplayed())
			isDsiplayed= true;
		logger.info("Surgeon selection screen is displayed");
		return isDsiplayed;
	}
	
	
	/**
	 * This method is used to select a site from the list in site selection screen
	 * @param index
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void selectSurgeon(Integer index) throws IOException, InterruptedException {
		Thread.sleep(1000);
		List<WebElement> availableSurgeon=utility.initializeElements(LoginPage.driver,"upload.surgeonSelctList.xpath");
		if(availableSurgeon.size()== 0) {
			
			WebElement element = utility.initializeElement(LoginPage.driver,"upload.selectedsurgeon.xpath");
			logger.info("Available Surgeon:" + element.getText());
			element.click();
			logger.info("Selected Surgeon: "+ element.getText());
			}
		else {
			logger.info("Available Surgeons:");
			for(WebElement webelement:availableSurgeon) {
				logger.info("site: "+ webelement.getText());
			}
			availableSurgeon.get(index).click();
			logger.info("Selected Surgeon: " + availableSurgeon.get(index).getText());
		}
	}
	
	/**
	 * This method is used to check site is selected
	 * @return
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public Boolean isSurgeonSelected() throws IOException, InterruptedException {
		Thread.sleep(1000);
		return utility.initializeElement(LoginPage.driver,"upload.selectedsurgeon.xpath").isDisplayed();
	}
	
	/**
	 * This method is used to locate application selection screen elements
	 * @param element
	 * @return
	 * @throws IOException 
	 */
	public WebElement applicationSelectionScreen(String element) throws IOException {
		if(element.equalsIgnoreCase("Header"))
			return utility.initializeElement(LoginPage.driver,
					"upload.applicationheader.xpath");
		else if(element.equalsIgnoreCase("Application card box"))
			return utility.initializeElement(LoginPage.driver,
					"upload.applicationcardbox.xpath");
		else if(element.equalsIgnoreCase("Application card"))
			return utility.initializeElement(LoginPage.driver,
					"upload.applicationcard.xpath");
		else if(element.equalsIgnoreCase("Application name"))
			return utility.initializeElement(LoginPage.driver,
					"upload.applicationcardname.xpath");
		else if(element.equalsIgnoreCase("Button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.nextbutton.xpath");
		return null;
		
	}
	
	/**
	 * This method is used to check whether surgeon selection screen is displayed 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public Boolean isapplicationSelectionScreenDisplayed() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Boolean isDsiplayed = false;
		logger.info("Header is displayed as : " + applicationSelectionScreen("Header").getText());
		if(applicationSelectionScreen("Header").isDisplayed())
			isDsiplayed = true;
		if(applicationSelectionScreen("Application card").isDisplayed())
			isDsiplayed = true;
		logger.info("Application selection screen is displayed");
		return isDsiplayed;
	}
	
	/**
	 * This method is used to select a application from the list in application selection screen
	 * @param index
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void selectApplication() throws IOException, InterruptedException {
		Thread.sleep(1000);
		WebElement availableApplication=utility.initializeElement(LoginPage.driver,"upload.applicationcardname.xpath");
		availableApplication.click();
		logger.info("Selected application: " + availableApplication.getText());
	}
	
	/**
	 * This method is used to check site is selected
	 * @return
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public Boolean isApplicationSelected() throws IOException, InterruptedException {
		Thread.sleep(1000);
		return utility.initializeElement(LoginPage.driver,"upload.applicationcardselected.xpath").isDisplayed();
	}
	
	/**
	 * This method is used to locate upload screen elements
	 * @param element
	 * @return
	 * @throws IOException 
	 */
	public WebElement uploadScreen(String element) throws IOException {
		if(element.equalsIgnoreCase("Header"))
			return utility.initializeElement(LoginPage.driver,
					"upload.uploadscreenheader.xpath");
		else if(element.equalsIgnoreCase("Drag & drop"))
			return utility.initializeElement(LoginPage.driver,
					"upload.dragdrop.xpath");
		else if(element.equalsIgnoreCase("Browse pc"))
			return utility.initializeElement(LoginPage.driver,
					"upload.browsepc.btn.xpath");
		else if(element.equalsIgnoreCase("Application name"))
			return utility.initializeElement(LoginPage.driver,
					"upload.applicationcardname.xpath");
		else if(element.equalsIgnoreCase("Next Button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.nextbutton.xpath");
		return null;
	}
	
	/**
	 * This method is used to check whether upload screen is displayed
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public Boolean uploadScreenDisplayed() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Boolean isDsiplayed = false;
		logger.info("Header is displayed as : " + uploadScreen("Header").getText());
		if(uploadScreen("Header").isDisplayed())
			isDsiplayed = true;
		if(uploadScreen("Drag & drop").isDisplayed())
			isDsiplayed = true;
		if(uploadScreen("Browse pc").isDisplayed())
			isDsiplayed = true;
		logger.info("Upload screen is displayed");
		return isDsiplayed;
	}
	
	/**
	 * This method is used to locate upload success screen elements
	 * @param element
	 * @return
	 * @throws IOException
	 */
	public WebElement uploadSuccessScreen(String element) throws IOException {
		if(element.equalsIgnoreCase("Header"))
			return utility.initializeElement(LoginPage.driver,
					"upload.successmodeltitle.xpath");
		else if(element.equalsIgnoreCase("Success icon"))
			return utility.initializeElement(LoginPage.driver,
					"upload.successicon.xpath");
		else if(element.equalsIgnoreCase("Close button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.successclose.btn.xpath");
		else if(element.equalsIgnoreCase("Start new upload"))
			return utility.initializeElement(LoginPage.driver,
					"upload.startnewupload.btn.xpath");
		else if(element.equalsIgnoreCase("Dashboard button"))
			return utility.initializeElement(LoginPage.driver,
					"upload.dashboard.btn.xpath");
		return null;
	}
	
	public Boolean isuploadSuccessDisplayed() throws InterruptedException, IOException {
		Thread.sleep(2000);
		Boolean isDsiplayed = false;
		logger.info("Header is displayed as : " + uploadSuccessScreen("Header").getText());
		if(uploadSuccessScreen("Header").isDisplayed())
			isDsiplayed = true;
		if(uploadSuccessScreen("Success icon").isDisplayed())
			isDsiplayed = true;
		if(uploadSuccessScreen("Close button").isDisplayed())
			isDsiplayed = true;
		if(uploadSuccessScreen("Start new upload").isDisplayed())
			isDsiplayed = true;
		if(uploadSuccessScreen("Dashboard button").isDisplayed())
			isDsiplayed = true;
		logger.info("Upload success screen is displayed");
		return isDsiplayed;
	}
	
	/**
	 * This method is used to locate selection header in application selection and surgeon selection screen
	 * @return
	 * @throws IOException
	 */
	public WebElement selectionHeader() throws IOException {
		return utility.initializeElement(LoginPage.driver,"upload.selectedsitesurgeonheader.xpath");
	}
	
	/**
	 * This method is used to check selection header is displayed.
	 * @return
	 * @throws IOException
	 */
	public Boolean isSelectionHeaderDisplyed() throws IOException {
		logger.info("Selected Header: " + selectionHeader().getText());
		return selectionHeader().isDisplayed();
	}
	/***
	 * This method is used to return the local path of Datasets folder in the project
	 * @return
	 * @throws IOException
	 */
	public String getDataSetPath() throws IOException {
		Properties properties = reader.getProperty();
		String propertiesPath;
		File jarPath = new File(FileUploadPage.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		propertiesPath = jarPath.getAbsolutePath().replace("%20", " ");
		if (propertiesPath.contains(".jar")) {
			propertiesPath = jarPath.getParentFile().getAbsolutePath().replace("%20", " ")+ properties.getProperty("uploadfile.dataset.path");
			logger.info("Path of the jar is " + propertiesPath);
		} else {
			propertiesPath = jarPath.getParentFile().getParentFile().getAbsolutePath().replace("%20", " ") + properties.getProperty("uploadfile.dataset.path");
		}
		logger.info("File local path: "+propertiesPath);
		return propertiesPath;
	}
	
	
	
	/***
	 * This method is used to upload a file in upload file screen
	 * @param FileName
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public void uploadFileFromLocal(String FileName) throws IOException, InterruptedException {
		String absolutePath = getDataSetPath()  +FileName;
		File file = new File(absolutePath);
		utility.initializeElement(LoginPage.driver,
				"upload.input.xpath").sendKeys(file.getAbsolutePath());
		Thread.sleep(10000);
	}
	
}