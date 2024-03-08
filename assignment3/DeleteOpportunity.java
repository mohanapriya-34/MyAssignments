package marathon.assignment3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class DeleteOpportunity extends BaseClass{
@Test
	public void DeleteOpp() throws InterruptedException {
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'AppLauncherHeader')]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();*/
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);

		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Pooja", Keys.ENTER);
		Thread.sleep(3000);
		WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class, 'rowActionsPlaceHolder')])[1]"));
		driver.executeScript("arguments[0].click();", virtualButton);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("(//button[contains(@class, 'uiButton forceActionButton')])[2]")).click();
		String opportunityName = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--')]")).getText();
		System.out.println(opportunityName);
		if (opportunityName.contains(" was deleted")) {

		System.out.println("Opportunity was deleted Successfully");

		} else {

		System.out.println("Opportunity was not deleted");
		}



	}

}
