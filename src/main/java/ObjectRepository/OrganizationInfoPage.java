package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {	// rule1

			// rule2- declaration
			@FindBy(xpath="//span[@class='dvHeaderText']")
			private WebElement OrgHeaderText;
	
			// Rule3: Initialization
			public OrganizationInfoPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
			
			
			// rule4: Utilisation
	
	public WebElement getOrgHeaderText() {
		return OrgHeaderText;
		
	}
	/**
	 * This method will capture the header text and return it to caller
	 * @return
	 */
	//Business library
	 	public String getHeaderText(){
	 	return OrgHeaderText.getText();
	 	}
	
	
}
