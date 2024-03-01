package home.assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sarvik");
		driver.findElement(By.name("lastname")).sendKeys("Saran");
		driver.findElement(By.name("reg_email__")).sendKeys("ssoossriyasel318@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ssoossriyasel318@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("testpwd@35W");
		//driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testpwd@35W");
		Thread.sleep(3000);
		WebElement dob = driver.findElement(By.name("birthday_day"));
		Select date = new Select (dob);
		date.selectByValue("10");
		
		WebElement month = driver.findElement(By.id("day"));
		Select monthmay = new Select (month);
		monthmay.selectByValue("5");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearno = new Select (year);
		yearno.selectByValue("1981");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.name("websubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		
		//completed
		
		driver.close();
	}

}
