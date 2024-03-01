package home.assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ICS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sarvikmses");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Saran");
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Achu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SW");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sarvik10@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(state);
		option.selectByVisibleText("Alabama");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important notes test");
		driver.findElement(By.name("submitButton")).click();
		
		String viewTitle = driver.getTitle();
		System.out.println(viewTitle);
		Thread.sleep(3000);
		//Completed
		
		
		
		
		driver.close();
		
		
	}

}
