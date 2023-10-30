package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderpop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		//driver.findElement(By.className("commonModal__close")).click();
		WebElement from= driver.findElement(By.xpath("//input[@id='fromCity']"));	
		WebElement to=driver.findElement(By.xpath("//input['toCity']"));
		from.sendKeys("bengaluru");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		to.sendKeys("pune");
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Aug 02 2023']")).click();
		
	}

}
