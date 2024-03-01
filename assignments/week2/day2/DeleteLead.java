package home.assignments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8612398765");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		WebElement leadname = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		leadname.getText();
		System.out.println(leadname.getText());		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(leadname.getText());
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Message displayed after deletion " +message);
		Thread.sleep(3000);
		
		//completed 
		
		
		
		//driver.close();

	}

}
