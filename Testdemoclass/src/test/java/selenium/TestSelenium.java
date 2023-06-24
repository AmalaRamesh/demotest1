package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver =new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait (driver, null);
    WebElement selectElement = driver.findElement(By.name("selectomatic"));
    Select select = new Select(selectElement);
    driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
    Actions actionProvider = new Actions(driver);
    Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
    keydown.perform();
    TakesScreenshot ts =((TakesScreenshot)driver);
    File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
    File file = new File("pathname//name.png");
    FileUtils.copyFile(screenShotAs,file);
 

	

	}

}
