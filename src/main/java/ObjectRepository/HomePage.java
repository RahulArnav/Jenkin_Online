package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
//Declaration-dropdown,frames,window,textfields,popups
	@FindBy(linkText="Organizations")
	private WebElement organizationLnk;
	
	@FindBy(linkText ="Contacts")
	private WebElement contactLnk;
	
	@FindBy(linkText = "Products")
	private WebElement productLnk;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signountLnk;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getOrganizationLnk() {
		return organizationLnk;
	}

	public WebElement getContactLnk() {
		return contactLnk;
	}

	public WebElement getProductLnk() {
		return productLnk;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignountLnk() {
		return signountLnk;
	}
	//Business library
	/**
	 * This method will click on organization link
	 */
	
	public void clickorganizationLink() {
		organizationLnk.click();
	}
	public void clickOnContactsLink() {
		contactLnk.click();
	}
	public void logoutOfApp(WebDriver driver) throws InterruptedException {
		mouseHoverAction(driver, administratorImg);
		Thread.sleep(1000);
		signountLnk.click();
	
	}
	
	
}
