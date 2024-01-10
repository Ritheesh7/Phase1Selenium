package demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SkuiliUploadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.remove.bg/");
		
		Thread.sleep(4000);
		
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// wait until the given condition is satisfied
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		
		e1.click();
		
		
		Screen s = new Screen();
		
		Pattern textfield = new Pattern("C:\\sikuli\\image10.png");
		
		Pattern openButton = new Pattern("C:\\sikuli\\image101.png");
		
		s.wait(textfield,20);
		
		s.type(textfield,"C:\\Users\\sonal\\Documents\\ATE-Phase1-SL\\sikulidemo");
		
		s.click(openButton);

	}

}
