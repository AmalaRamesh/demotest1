package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPage {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//		        "C:\\Users\\91861\\eclipse-workspace\\selenium\\chrome\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();

		    driver.get("https://www.flipkart.com");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//		    WebDriver wait = new  ChromeDriver(); 
		    WebElement email = driver
		        .findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		    email.sendKeys("amalaramesh17@gmail.com");
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    WebElement button=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
		    button.click();

		    WebElement pass = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		    pass.sendKeys("amala12345");
		    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		    driver.findElement(By.className("\'_2IX_2- VJZDxU\'")).sendKeys("98765443210");
		    driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])[2]")).click();

		    WebElement searchBox = driver.findElement(By.name("q"));
		    searchBox.sendKeys("iphone",Keys.ENTER);
		  
//		      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
//		      driver.switchTo().window(newTb.get(1));
//		      ((WebElement) newTb).sendKeys(Keys.ENTER);
//		          WebElement mobile = driver.findElement(By.linkText("APPLE iPhone 11 (Black, 128 GB)"));
//		          mobile.click();

		  
		  }
	}

