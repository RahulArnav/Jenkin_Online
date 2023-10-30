package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	// Declaration
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement CreateOrgLookUpImg;

	// Initialization
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilisation
	public WebElement getCreateOrgLookUpImg() {
		
		return CreateOrgLookUpImg;
	}

	
	// Business library
	/**
	 * This method will click on create org look up image
	 */
	public void clickOnOrganizationLookUpImg() {
		CreateOrgLookUpImg.click();
	}

}
