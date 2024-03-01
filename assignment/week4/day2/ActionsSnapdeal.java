package home.assignment.week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.index.qual.SubstringIndexBottom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
        WebElement moveto = driver.findElement(By.xpath("//span[@class='catText']"));
		//handle Actions by declaring
        Actions act = new Actions(driver);
        act.moveToElement(moveto).perform();
        driver.findElement(By.xpath("//span[@class='linkTest']")).click();
        Thread.sleep(3000);
        String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
        System.out.println("Mens Sports shoe count : " +count);
        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
        WebElement option = driver.findElement(By.xpath("//div[@class='sort-selected']"));
        option.click();
        driver.findElement(By.xpath("//li[@class='search-li']")).click();
        //Thread.sleep(3000);
        //get the list of prices :
        List<WebElement> lhprice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int size= lhprice.size();
        System.out.println("Number of training shoes available : " +size);
        List<Integer> allPrice = new ArrayList<Integer>();
        //iterate to get each price 
		for (int i = 0; i < size; i++) {
			String text = lhprice.get(i).getText();
			System.out.print("The low to High price list :");
			System.out.println(text);
			String text2 =text.substring(4);
			//System.out.println("4 digit Price" +text2);
			text2= text2.replace("," , "");
			int toInt = Integer.parseInt(text2);
			allPrice.add(toInt);
			
		}
		//Compare the web price displayed with the sorted price 
		List<Integer> checkPrice = new ArrayList<Integer>(allPrice);
		Collections.sort(allPrice);
		if (checkPrice==allPrice) {
			System.out.println("Prices are printing as low to high as expected");
			
		} else {
			System.out.println("Prices are not printing as low to high as expected");

		}
		
		
		//Handle scroll bar by dragging x nd y axis:
       WebElement drag =driver.findElement(By.xpath("//input[@name='fromVal']"));
		drag.clear();
		drag.sendKeys("500");
		WebElement drop =driver.findElement(By.xpath("//input[@name='toVal']"));
		drop.clear();
		drop.sendKeys("700");
		driver.findElement(By.xpath("//span[@class='filter-color-tile']/parent::label")).click();
		
		//Move to element for the found item :
		Thread.sleep(3000);
		WebElement toShoe = driver.findElement(By.xpath("//img[@title='ASIAN Black Training Shoes']"));
		//handle Actions by declaring
        Actions act2 = new Actions(driver);
        Thread.sleep(3000);
        act2.moveToElement(toShoe).perform();
        driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar  ')]")).click();
        Thread.sleep(3000);
        //Handle window of child :
        Set<String> windowHandles = driver.getWindowHandles();
				
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		//switch to child window
		driver.switchTo().window(window.get(1));
		WebElement Wprice = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		Wprice.getText();
		WebElement Wdisc = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		Wdisc.getText();
		Thread.sleep(3000);
		
		//take screenshots :
		WebElement snp = driver.findElement(By.xpath("//img[@class='cloudzoom']"));
		Thread.sleep(3000);
		
		//To take screenshots step 1:
        File scr = snp.getScreenshotAs(OutputType.FILE);
        //step 2 - to store the ss 
        File dst = new File("./SnapDeal/img.png");
        FileUtils.copyFile(scr, dst); 
        
		
	}

}
