package home.assignments.week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class CheckboxButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/parent::div")).click();
		Thread.sleep(3000);
		//check for the notification checked
		
		
		boolean basic = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).isEnabled();
		System.out.println("Boolena Value of basic ******** : " + basic);
		
		
		boolean notification = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/parent::div")).isEnabled();
		System.out.println("Boolena Value of notification ******** : " + notification);
		
		if(notification) {
		String checked=	driver.findElement(By.xpath("//div[@class='ui-growl-item']")).getText();	
		System.out.println(checked);
		}
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		
		boolean tristate = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']")).isEnabled();
		System.out.println("Boolena Value tristate check selected ******** : " + tristate);
		
		if(tristate) {
			String tristatesel = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();	
			System.out.println(tristatesel);
			}
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']/parent::div")).click();
		boolean triunselected =driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-closethick']")).isEnabled();
		System.out.println("Boolena Value of tristate unselected ******** : " + triunselected);
		
		if(triunselected) {
			String tristateunsel = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();	
			System.out.println(tristateunsel);
			}
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']/parent::div")).click();		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']/parent::div")).isSelected();
		
		//boolean toogle=	driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget ui-toggleswitch-checked']")).isEnabled();
		//System.out.println("Boolena Value of toogle selected ******** : " + toogle);
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Barcelona'])[2]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
