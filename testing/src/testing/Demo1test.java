package testing;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb= new ChromeDriver();
	    wb.manage().window().maximize();
	    wb.get("https://toolsqa.com/");
	    WebElement findElement = wb.findElement(By.xpath("/html/body/header/nav/div/div/a/img"));
	    
	    wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		
		
		
		
		
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		wb.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
////		WebDriverWait wait= new WebDriverWait(wb,10);
////		Thread.sleep(1000);
////		WebDriverWait wait = new WebDriverWait(wb, 40);
////		wb.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("amalaramesh08@gmail.com");
//		
		
		

