package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consists of all generic methods related to webdriver actions
 * 
 * @author Rahulkumar
 */
public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {

		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the window
	 * 
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method will wait for the page to load
	 * 
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * This method will wait for a particular element to be visible in the DOM
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementTobeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait for a particular element to be clickable in the DOM
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	/**
	 * This method will handle dropdown by index
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method will handle dropdown by value
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, String value) {// method overloading
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method will handle dropdown by visible text
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropDown(String text, WebElement element) {// method overloading
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * This method will perform mose hovering action
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	/**
	 * This method will perform right click
	 * 
	 * @param driver
	 */
	public void moveAndClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
	}

	/**
	 * This method will perform right click
	 * 
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}

	public void doubleClickAction(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	}

	public void dragAndDropAction(WebDriver driver, WebElement srcEle, WebElement dstEle) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(srcEle, dstEle).perform();
	}

	/**
	 * 
	 * This method will switch to frame by index
	 * 
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String NameorId) {
		driver.switchTo().frame(NameorId);
	}
	/**
	 * Immidiate parent
	 * @param driver
	 */
	public void switchToParent(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/**
	 * Main frame
	 * @param driver
	 */
	public void switchToMain(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * 
	 * This method will scroll up or down by 500 units
	 * 
	 * @param index
	 */
	public void ScrollUpAction(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-500);", "");
	}

	public void ScrollDownAction(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500);", "");
	}

	/**
	 * 
	 * This method will handle the Alert popup to accept
	 * 
	 * @param index
	 */
	public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
	}
	public void getAlertText(WebDriver driver) {
	driver.switchTo().alert().getText();
	}
	/**	
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String captureScreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//temporary location
		File dst=new File(".\\Screenshots\\"+screenshotName+".png");
		Files.copy(src, dst);
		return dst.getAbsolutePath();//used for extent reports
	}
	
/**
 * 	This method is use for window handle
 * @param driver
 * @param partialWinTitle
 */
	public void switchToWindow(WebDriver driver,String partialWinTitle) {
		//step1: get all the window IDs
		Set<String> allwinds =driver.getWindowHandles();
		
		//Step2: Navigate thru each window
		for(String winID:allwinds) {
		// step3: switch to each window and capture the title	
		String actTitle=driver.switchTo().window(winID).getTitle();	
		
		//step4: compare act title with expected partial Title
		if(actTitle.contains(partialWinTitle)) {
		break;
		}	
		}
	}
}
