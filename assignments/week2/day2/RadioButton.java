package home.assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Chrome']/parent::td")).click();
		Thread.sleep(3000);
		boolean chrome = driver.findElement(By.xpath("//label[text()='Chrome']/parent::td")).isEnabled();
		System.out.println("The radio button chrome is selected : "  +chrome);
		Thread.sleep(3000);
		// Clicking on same radio button it is not unselected in the application , so it is not possible to cover it
		//driver.findElement(By.xpath("//label[text()='Chrome']/parent::td")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[text()='Firefox']/parent::td)[1]")).click();
		
		boolean chrome2 = driver.findElement(By.xpath("//label[text()='Chrome']/parent::td")).isSelected();
		System.out.println("The radio button chrome is unselected : "  +chrome2);
		
		//For Default TC:
	    
		boolean default1 = driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div)[2]")).isSelected();
		System.out.println("The radio button chrome is not defaulted/selected : "  +default1);
		
		boolean default2 = driver.findElement(By.xpath("(//label[text()='Firefox']/parent::td)[2]")).isSelected();
		System.out.println("The radio button chrome is not defaulted/selected : "  +default2);
		Thread.sleep(3000);
		boolean default3 = driver.findElement(By.xpath("(//label[text()='Safari']/parent::td)[2]")).isEnabled();
		System.out.println("The radio button Safari is  defaulted/selected : "  +default3);
		
		boolean default4 = driver.findElement(By.xpath("(//label[text()='Edge']/parent::td)[2]")).isSelected();
		System.out.println("The radio button chrome is not defaulted/selected : "  +default4);
		
		//driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		
		boolean agegrp1=driver.findElement(By.xpath("//label[text()='1-20 Years']")).isSelected();
	
		
		if(agegrp1)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
		}
		Thread.sleep(3000);
		
		boolean agegrp2=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		
		
		if(agegrp2)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
		}
		Thread.sleep(3000);
		
		boolean agegrp3=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		
		
		if(agegrp3)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
		}
		Thread.sleep(3000);
		
		//for radio button select and unselected TC 
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
		Thread.sleep(3000);
		boolean agegrpcheck=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		if(agegrpcheck)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
		}
		Thread.sleep(3000);
		
		driver.close();

	}

}
