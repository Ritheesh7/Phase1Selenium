package seleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkTextPartialLinktext {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(1500);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		driver.findElement(By.name("wpPassword")).sendKeys("admin@123");
		
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		Thread.sleep(1500);
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1500);
		
	   driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Wikipedia:Sign+up");
	  
	  
	   driver.findElement(By.partialLinkText("logging in")).click();
		
	   title = driver.getTitle();
		System.out.println(title);


	}

}
