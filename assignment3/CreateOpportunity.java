package marathon.assignment3;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CreateOpportunity extends BaseClass{ 
	@DataProvider(name="getData")

public String[][] sendData() throws IOException
{
	return ReadDataFromSheet.excelCreateData();
	
}
	@Test(dataProvider ="getData")
	public void Createopp(String name , String amt) throws InterruptedException {
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();*/
		Thread.sleep(3000);
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		driver.findElement(By.xpath("//a[contains(@class,'forceActionLink')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String opportunityName = driver.findElement(By.xpath("//span[contains(@class, 'toastMessage')]")).getText();
		System.out.println(opportunityName);
		if (opportunityName.contains(" was created.")) {

		System.out.println("Opportunity Created Successfully");

		}
		else {

		System.out.println("Opportunity NotCreated");
		}

		//driver.close();
		}


	}


