package home.assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week1CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		String title = driver.getTitle();
		System.out.println(title);
		
		
		if(title.contains("TestLeaf Automation")) {
			System.out.println("login is successful");
		}else {
			System.out.println("login is not successful");
		}
		//String accountName = "Sarvik";
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("KMPo");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(industry);
		option.selectByVisibleText("Computer Software");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select optionowner = new Select(ownership);
		optionowner.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select optionsource = new Select(source);
		optionsource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select optionmark = new Select(marketing);
		optionmark.selectByIndex(7);
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select optionstate = new Select(state);
		optionstate.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("//span[@class='tabletext')]"));
		
		String acctitle = driver.getTitle();
		System.out.println(acctitle);
		
		
		if(acctitle.contains(acctitle)) {
			System.out.println("Account Details page is loaded successfully");
		}else {
			System.out.println("Account Details page is not loaded successfully");
		}
		
        String aname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("The account name is : " +aname);
		if(aname.contains(aname)) {
			System.out.println("Account name is correct");
		}else {
			System.out.println("Account name is incorrect");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		
		
		driver.close();

		//Completed

	}

}
