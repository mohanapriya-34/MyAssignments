package marathon.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPurchase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for b");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		Thread.sleep(3000);
		WebElement results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(results.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[4]")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
		Thread.sleep(3000);
		WebElement bagname = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		System.out.println(bagname.getText());
		WebElement discprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(discprice.getText());
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
