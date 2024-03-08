package marathon.assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;
	//public ChromeDriver driver;
	public ChromeOptions option;
	public EdgeOptions option1;
	@Parameters({"url","username","password","browser"})
@BeforeMethod
			public void preCondition(String url, String uname , String pwd,String browser) {
				option = new ChromeOptions();
				option1 =new EdgeOptions();
				option.addArguments("--disable-notifications");
				// option.addArguments("inprivate");
				if (browser.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver(option);
					
				} else if(browser.equalsIgnoreCase("edge")) {
					
					driver = new EdgeDriver(option1);
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				driver.findElement(By.id("username")).sendKeys(uname);
				driver.findElement(By.id("password")).sendKeys(pwd);
				driver.findElement(By.id("Login")).click();
				driver.findElement(By.xpath("//button[contains(@class, 'AppLauncherHeader')]")).click();
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
				driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		}
			@AfterMethod
			public void postCondition() {
				driver.close();
			}
		}

	


