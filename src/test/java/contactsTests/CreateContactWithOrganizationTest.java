package contactsTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.ContactsInfoPage;
import ObjectRepository.ContactsPage;
import ObjectRepository.CreateNewContactPage;
import ObjectRepository.CreateNewOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrganizationInfoPage;
import ObjectRepository.OrganizationPage;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithOrganizationTest extends BaseClass{

	@Test
	public void CreateContactWithOrgTest() throws IOException, InterruptedException {
		// Step 1: Create all the required Objects
//		JavaUtility jUtil = new JavaUtility();
//		ExcelFileUtility eUtil = new ExcelFileUtility();
//		PropertyFileUtility pUtil = new PropertyFileUtility();
//		WebDriverUtility wUtil = new WebDriverUtility();
//		WebDriver driver = null;

		// Step 2: Read The Required Data
//		String BROWSER = pUtil.readDataFromPropertyFile("browser");
//		String URL = pUtil.readDataFromPropertyFile("url");
//		String USERNAME = pUtil.readDataFromPropertyFile("username");
//		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		String ORGNAME = eUtil.readDataFromExcelFile("Contacts", 4, 3) + jUtil.getRandomNumber();
		String LASTNAME = eUtil.readDataFromExcelFile("Contacts", 4, 2);

		// Step 3: Launch the browser
//		if (BROWSER.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			System.out.println(BROWSER + " launched");
//		} else if (BROWSER.equalsIgnoreCase("Firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			System.out.println(BROWSER + " launched");
//		} else if (BROWSER.equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			System.out.println(BROWSER + " launched");
//		} else {
//			System.out.println("Invalid Browser Name");
//		}
//
//		wUtil.maximizeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//
//		// Step 4: Load the URL
//		driver.get(URL);

//		// Step 5: Login To Application
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApp(USERNAME, PASSWORD);
//
//		// Step 6: click on Organization
		HomePage hp = new HomePage(driver);
		hp.clickorganizationLink();

		// Step 7: Click on Create Organization look Up Image
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnOrganizationLookUpImg();

		// Step 8: Create new Organization with Mandatory fields
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.CreateNewOrganization(ORGNAME);

		// Step 9: Validate for Organization
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String orgHeader = oip.getHeaderText();
		Assert.assertTrue(orgHeader.contains(ORGNAME));
		System.out.println(orgHeader);
		System.out.println("Organization Created");
//		if (orgHeader.contains(ORGNAME)) {
//			System.out.println(orgHeader);
//			System.out.println("Organization Created");

//		} else {
//			System.out.println("FAIL");
//		}
		// Step 10: Click On Contacts Link
		hp.clickOnContactsLink();

		// Step 11: Click on Create contact Look Up Image
		ContactsPage cp = new ContactsPage(driver);
		cp.ClickOnCreateContactLookUpImg();

		// Step 12: Create Contact with Organization
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.CreateNewContact(driver, LASTNAME, ORGNAME);

		// Step 13: Validation
		ContactsInfoPage cip = new ContactsInfoPage(driver);
		String contactHeader = cip.getHeaderText();
		Assert.assertTrue(contactHeader.contains(LASTNAME));
		
		System.out.println(contactHeader);
		
		System.out.println("PASS");
		
//		if (contactHeader.contains(LASTNAME)) {
//			System.out.println(contactHeader);
//			System.out.println("PASS");
//		} else {
//			System.out.println("FAIL");
//		}

//		// Step 14: Logout
//		hp.logoutOfApp(driver);
//
//		// Step 15: Close the Browser
//		driver.quit();

	}

}
