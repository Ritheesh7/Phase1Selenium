package seleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIDName {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.manage().window().maximize();
		
		boolean display = driver.findElement(By.id("wpName2")).isDisplayed(); 
		
		System.out.println("the element is visible : " + display);
		
		boolean enable =	driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("the element is enabled : " + enable);
		
	
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		
       display = driver.findElement(By.id("wpPassword2")).isDisplayed(); 
		
		System.out.println("the element is visible : " + display);
		
		enable =	driver.findElement(By.id("wpPassword2")).isEnabled();
		System.out.println("the element is enabled : " + enable);
		
		driver.findElement(By.id("wpPassword2")).sendKeys("admin@123");
		
		
	
		 display = 	driver.findElement(By.name("retype")).isDisplayed();
		 System.out.println("the element is visible : " + display);
		
		 enable = driver.findElement(By.name("retype")).isEnabled();
		 System.out.println("the element is enabled : " + enable);
		
		 driver.findElement(By.name("retype")).sendKeys("admin@123");
		
		 
		
		 display = 	driver.findElement(By.name("email")).isDisplayed();
		 System.out.println("the element is visible : " + display);
		
		 enable = driver.findElement(By.name("email")).isEnabled();
		 System.out.println("the element is enabled : " + enable);
		
		 driver.findElement(By.name("email")).sendKeys("admin@gmail.com");


	}

}
