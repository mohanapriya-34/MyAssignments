package marathon.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bengaluru");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		String travels = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("The travels list 1st available is : " +travels);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='btn  outlined tertiary sm inactive button'])[4]")).click();
		Thread.sleep(3000);
		String travel2 = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]")).getText();
		System.out.println("The seats available are : " +travel2);
		driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]")).click();
		Thread.sleep(3000);
		boolean seatavail =driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).isEnabled();
		if(seatavail)
		{
			driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		}
		
		 
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000);
		String seatno = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		System.out.println("The selected seat no :   " +seatno);
		Thread.sleep(5000);
		String fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("The selected seat no :   " +fare);
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		driver.close();
		
		
	}

}
