package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfoPage {
	// rule2- declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement ContactHeaderText;

	// Rule3: Initialization
	public ContactsInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// rule4: Utilisation
	public WebElement getContactHeaderText() {
		return ContactHeaderText;
	}
//Business Libraries
/**
 * This method will create on create contact look up img
 * @return
 */
	public String getHeaderText() {
		
		return ContactHeaderText.getText();
	}
	
	
	
}
