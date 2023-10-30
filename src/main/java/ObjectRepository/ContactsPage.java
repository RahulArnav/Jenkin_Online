 package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	// rule2- declaration
			@FindBy(xpath="//img[@alt='Create Contact...']")
			private WebElement CreateContactLookUpImg;

			// Rule3: Initialization
			public ContactsPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			// rule4: Utilisation
			public WebElement getCreateContactLookUpImg() {
				return CreateContactLookUpImg;
			}
	//Business Libraries
	public void ClickOnCreateContactLookUpImg() {
	CreateContactLookUpImg.click();
	}		
	
	
}
