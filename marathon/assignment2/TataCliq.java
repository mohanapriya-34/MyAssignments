package marathon.assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);		
        WebElement brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		//handle Actions by declaring
        Actions act = new Actions(driver);
        act.moveToElement(brand).perform();
        WebElement watches = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"));
        Actions act2 = new Actions(driver);
        act2.moveToElement(watches).perform();
        driver.findElement(By.xpath("//div[text()='Casio']")).click();
        Thread.sleep(3000);
        WebElement arrivals =driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
        Select option = new Select(arrivals);
		option.selectByVisibleText("New Arrivals");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='CheckBox__base']")).click(); 
		Thread.sleep(3000);
		//find all the watch prices 
		List<WebElement> lhprice = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		List<Integer> allPrice = new ArrayList<Integer>();
		for(WebElement j :lhprice)
		{
		String text =j.getText();
		Thread.sleep(3000);
		System.out.println(text);
		String ra = text.replaceAll("[^0-9]" , "");
		int parseInt = Integer.parseInt(ra);
		allPrice.add(parseInt);
		
		}
		System.out.println(allPrice);
		WebElement firstwatch= driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		firstwatch.getText();
		String value1 =firstwatch.getText();
		System.out.println("First watch price old window :" +firstwatch.getText());
		//To click the first product after sorting
		WebElement firstProduct = driver.findElement(By.xpath("//div[@class='ProductModule__base']/div"));
		driver.executeScript("arguments[0].click()", firstProduct);
		
		//Handle the child window :
		Set<String> windowHandles = driver.getWindowHandles();
			
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		Thread.sleep(3000);
		driver.switchTo().window(window.get(1));
		Thread.sleep(3000);
		WebElement fpprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		fpprice.getText();
		System.out.println(fpprice.getText());
		String value2 =fpprice.getText();
		String value3 = value2.replaceAll("MRP: " , "");
		System.out.println("VALUE After removing mrp:" +value3);
		Thread.sleep(3000);
		WebElement priceNewWindow =driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		priceNewWindow.getText();
		Thread.sleep(3000);
		System.out.println("New window fisrt watch price: " +priceNewWindow.getText());
				if (value1.contains(value3))						{
			System.out.println("Price is same : " +value1);
			
		} else {
			System.out.println("Price is different : " );
		}
		
		//Addto cart:
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		WebElement cartIcon =driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']/span"));
		cartIcon.getText();
		System.out.println("No of items in cart : " +cartIcon.getText());
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		//Take screenshots:
		WebElement snp = driver.findElement(By.xpath("//div[@class='CartPage__pageCenter']"));
		Thread.sleep(3000);
		
		//To take screenshots step 1:
        File scr = snp.getScreenshotAs(OutputType.FILE);
        //step 2 - to store the ss 
        File dst = new File("./SN_01/img3.png");
        FileUtils.copyFile(scr, dst);
		
		
		
		
	}

}
