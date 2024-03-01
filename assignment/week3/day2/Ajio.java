package home.assignment.week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		WebElement count = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("Tota items found: " +count.getText());
		
		
		List<WebElement> bagsprice = driver.findElements(By.className("brand"));
		
		
		for(WebElement j :bagsprice)
		{
		String text =j.getText();
		System.out.print("Print the list of Brands available : " );
		System.out.println(text);
				
		}
		
		List<WebElement> bagsname = driver.findElements(By.className("nameCls"));
		for(WebElement bn :bagsname)
		
		{
			String name =bn.getText();
			System.out.print("Print the list of Bags name available : "  );
			System.out.println(name);
	}
  driver.close();
  
}
}
