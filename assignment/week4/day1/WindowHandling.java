package home.assignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//Now handle child window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		//switch to child window
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		Thread.sleep(3000);
		//close the child window also my control will be in child window
				//driver.close();
				Thread.sleep(3000);
				//switch back to parent window 
				driver.switchTo().window(window.get(0));
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
				Thread.sleep(5000);
				
				Set<String> windowHandles2 = driver.getWindowHandles();
				System.out.println(windowHandles2);
				
				//convert set in to list
				
				List<String> window2=new ArrayList<String>(windowHandles2); 
				
				
				driver.switchTo().window(window2.get(1));
				driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
				Thread.sleep(3000);
				//now again back to parent window and click merge:
				driver.switchTo().window(window.get(0));
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
				//Handle Alert
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				
				String title =driver.getTitle();
				System.out.println(title);
				if(title.equals("Merge")) {
					System.out.println(title);
				}
				
				driver.close();
				driver.quit();
				
				
				
				
				
	}

}
