 package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility {
	// rule2- declaration
	@FindBy(name= "lastname")
	private WebElement LastNameEdt;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveBtn;

	@FindBy(xpath ="(//img[@alt='Select'])[1]")
	private WebElement OrgLookUpImg;
	
	@FindBy(name="search_text")
	private WebElement OrgSearchEdt;
	
	@FindBy(name="search")
	private WebElement OrgSearchBtn;
	
	
	@FindBy(xpath="//a[text()='\" + ORGNAME + \"']")
	private WebElement orgnm;
	
	
	// Rule3: Initialization
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// rule4: Utilisation 

	public WebElement getLastNameEdt() {
		
		return LastNameEdt;
	}


	public WebElement getSaveBtn() {
		return SaveBtn;
	}


	public WebElement getOrgLookUpImg() {
		return OrgLookUpImg;
	}


	public WebElement getOrgSearchEdt() {
		return OrgSearchEdt;
	}


	public WebElement getOrgSearchBtn() {
		return OrgSearchBtn;
	}

	//business library
	
	public void CreateNewContact(String LASTNAME) {
		LastNameEdt.sendKeys(LASTNAME);
		SaveBtn.click();
	}
	
	
	public void CreateNewContact(WebDriver driver ,String LASTNAME,String ORGNAME)
	{
		LastNameEdt.sendKeys(LASTNAME);
		OrgLookUpImg.click();
		switchToWindow(driver, "Accounts");
		OrgSearchEdt.sendKeys(ORGNAME);
		OrgSearchBtn.click();
		driver.findElement(By.xpath("//a[.='"+ORGNAME +"']")).click();
		switchToWindow(driver, "Contacts");
		SaveBtn.click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
