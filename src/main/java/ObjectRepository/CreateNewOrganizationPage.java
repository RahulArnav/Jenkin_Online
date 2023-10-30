package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility {// rule1

	// declaration
	@FindBy(name = "accountname")
	private WebElement OrgNameEdt;

	@FindBy(name = "industry")
	private WebElement IndustryDropDwn;

	@FindBy(name = "accounttype")
	private WebElement typeDropDwn;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;

	// Initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilisation

	public WebElement getOrgNameEdt() {
		return OrgNameEdt;
	}

	public WebElement getIndustryDropDwn() {
		return IndustryDropDwn;
	}

	public WebElement getTypeDropDwn() {
		return typeDropDwn;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	// Business Library

	public void CreateNewOrganization(String ORGNAME) {
		OrgNameEdt.sendKeys(ORGNAME);
		SaveBtn.click();
	}

	/**
	 * This method will create new organization with industry drop down
	 * 
	 * @param ORGNAME
	 * @param INDUSTRY
	 */
	public void CreateNewOrganization(String ORGNAME, String INDUSTRY) {
		OrgNameEdt.sendKeys(ORGNAME);
		handleDropDown(IndustryDropDwn, INDUSTRY);
		SaveBtn.click();
	}

}
