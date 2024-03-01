package home.assignment.week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
        System.out.println("The first displayed Price : " +price);
        String stars = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
        System.out.println("People rating no : " +stars);
        driver.findElement(By.xpath("//img[@class='s-image']")).click();
        
        //handle child window:
        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println(windowHandles);
		
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		//switch to child window
		driver.switchTo().window(window.get(1));
		Thread.sleep(3000);
		//SUB TOTAL :
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])")).click();
		Thread.sleep(3000);
        String sub = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("Sub cart total" +sub);
        System.out.println(sub);
        if (price.contains(sub)) {
        	System.out.println("Amount for phone is correct : " +sub);
			
		} else {
			System.out.println("Amount is not correct ");

		}
		WebElement snp = driver.findElement(By.id("landingImage"));
		Thread.sleep(3000);
		
		//To take screenshots step 1:
        File scr = snp.getScreenshotAs(OutputType.FILE);
        //step 2 - to store the ss 
        File dst = new File("./AmazonS/img5.png");
        FileUtils.copyFile(scr, dst); 
        
        // Add to cart 
        
        driver.close();
        driver.quit();
        
        
        
        
	}

}
