package pagetesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
//		driver.findElement(By.xpath("//*[@id=\"nav-al-signin\"]")).click();
//		Thread.sleep(5000);
//		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email' and @tabindex='1']"));
//		email.click();
//		email.sendKeys("subabose6@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("8525813283");
//		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='OnePlus 11 5G (Eternal Green, 16GB RAM, 256GB Storage)']")).click();
		Set<String> nxTap = driver.getWindowHandles();
		Iterator<String> it = nxTap.iterator();
		String parentPage = it.next();
		String childPage = it.next();
		driver.switchTo().window(childPage);
		driver.findElement(By.xpath("//*[@id=\'add-to-cart-button\']")).click();
	}
}

////	
//
////}
////input[@id='ap_email']
////input[@id='continue']
////subabose6@gmail.com
////pw:8525813283