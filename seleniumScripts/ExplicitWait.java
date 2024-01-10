package seleniumScripts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.flipkart.com/");
		
		
		driver.navigate().refresh();
	
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// wait until the given condition is satisfied
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")));
		
	
		WebElement e1 = driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]"));
		// find the element text box to enter mobile number on the dialogue box
		
		e1.sendKeys("2343535345");

	}

}
