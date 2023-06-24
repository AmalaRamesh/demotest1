package toolpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[contains(@data-bind,'html: $parent.prepareMessageForHtml(message.text)')]")).getText();
		if(text.equalsIgnoreCase("You added Radiant Tee to your shopping cart.")){
		System.out.println("the testcase pass");
		}else {
		System.out.println("testcase fail");
		}
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
		button.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("amala12345@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'customer-password')]")).sendKeys("amala@12345");
		driver.findElement(By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button")).click();
	
//     	Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@class='input-text' and @name='street[0]']")).sendKeys("anna nagar");
////		driver.findElement(By.xpath("//*[@class='input-text' and @name='city']")).sendKeys("chennai");
//		
//		Select india = new Select(driver.findElement(By.xpath("//*[@class='select' and @name='region_id']")));
//		india.selectByIndex(6);
//		
//	
//		driver.findElement(By.xpath("//*[@class='input-text' and @name='postcode']")).sendKeys("12345");
//		
//		driver.findElement(By.xpath("//*[@class='input-text' and @name='telephone']")).sendKeys("986543773489");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='radio' and @name='ko_unique_1']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
		System.out.println("test case compelete");
		driver.close();
		
		
}
		}

