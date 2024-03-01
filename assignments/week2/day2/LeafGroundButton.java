package home.assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains(title)) {
			System.out.println("Dashboard Page is loaded successfully");
		}else {
			System.out.println("Dashboard Page is not loaded ");
		}
		driver.navigate().back();
		Thread.sleep(3000);
		boolean enable = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/parent::div")).isEnabled();
		System.out.println("The check box is disabled   " +enable);
		
				
		Point position = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2'][position()=1]")).getLocation();
		System.out.println("The position is :  "  +position);
		
		String currentColor = "#ffffff";
		String color = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("color");
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		
		if(currentColor.equals(hex)) {
			System.out.println("The colour is matched  :  "  +hex);
		}else {
			System.out.println("The colour is not matched  :  ");
		}
		
		
		Dimension diemension = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize();
		int height = diemension.getHeight();
		int width = diemension.getWidth();
		
		
		System.out.println("The Button is Hieght  :  "  +height);
		System.out.println("The Button is Width  :  "  +width); 
		
		
		//completed
		driver.close();
		
		
		
		
	}

}
