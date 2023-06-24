package pagetesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravels {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		wb.get("https://phptravels.com/demo/");
		wb.manage().window().maximize();
		wb.findElement(( By.xpath("//input[@type='text' and @placeholder='First Name']"))).sendKeys("devi");
		wb.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("dinesh");
		wb.findElement(By.xpath("//input[@type='text' and @placeholder='Business Name']")).sendKeys("tech dev");
		wb.findElement(By.xpath("//input[@type='email' and @placeholder='Email']")).sendKeys("devidinesh09@gmail.com");
		wb.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/h2")).sendKeys("8");
		//wb.findElement(By.xpath("//h2[@class='cw mw100' and @style='margin-top:10px']")).click();
		wb.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//input[@type='text' and @placeholder='Business Name']
		//input[@type='email' and @placeholder='Email']
		//input[@type='text' and @placeholder='Result ?']
		//*[text()='Submit']
		
  
       

	}

}
