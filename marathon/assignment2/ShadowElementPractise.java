package marathon.assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ShadowElementPractise {

	public static void main(String[] args) throws InterruptedException, IOException {
       ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dev210045.service-now.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);		
        WebElement un = driver.findElement(By.id("user_name"));
        un.sendKeys("admin");
        WebElement pwd = driver.findElement(By.id("user_password"));
        pwd.sendKeys("tdY0ES=5luW-");
        driver.findElement(By.id("sysverb_login")).click();
        Thread.sleep(3000);	
        //Handling shadow element All, Service catalog:
      	Shadow shadow = new Shadow(driver);	
        shadow.setImplicitWait(20);
      	shadow.findElementByXPath("//div[text()='All']").click();
      	shadow.findElementByXPath("//span[text()='Service Catalog']").click();
      	//Mobiles is under a frame under a shadow
      	Thread.sleep(6000);
      	WebElement mobiles = shadow.findElementByXPath("//iframe[@id='gsft_main']");
      	driver.switchTo().frame(mobiles);
      	driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
      	Thread.sleep(3000);
      	//5.Select Apple iphone 13 pro
      	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
      	//6.Choose yes option
      	driver.findElement(By.xpath("//span[@class='input-group-radio']")).click();
    	Thread.sleep(3000);
    	 //7. Enter phonenumber as 99 in original phonenumber field
     WebElement no=driver.findElement(By.xpath("//input[contains(@class,'cat_item_option sc-content-')]"));
       no.sendKeys("99");           
       //8. Select Unlimited from the dropdown in Monthly data allowance
       WebElement allowance = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
       Select option = new Select(allowance);
		option.selectByVisibleText("Unlimited [add $4.00]");
		Thread.sleep(3000);
       //9. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("(//label[@class='radio-label']/parent::span)[5]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label']/parent::span)[11]")).click();
       //10. Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
       //11. Verify order is placed and copy the request number
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("REQ")) {
			System.out.println("Order is placed successfully with request no : " +title);
			
		} else {
			System.out.println("Order is not placed");

		}
		//12.Take a Snapshot of order placed page
		Thread.sleep(3000);
		WebElement snp = driver.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal']"));
		Thread.sleep(3000);
		
		//To take screenshots step 1:
        File scr = snp.getScreenshotAs(OutputType.FILE);
        //step 2 - to store the ss 
        File dst = new File("./SN_01/img.png");
        FileUtils.copyFile(scr, dst);
		
		driver.close();
       
	}

}
