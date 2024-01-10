package seleniumScripts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opera.com/download");
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='cookie-consent__basic cookie-consent__inner']/descendant::span[3]"));
		e1.click();


	}

}
