package seleniumScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//div[@class='DPXIy']/child::textarea[1]")).sendKeys("Simplilearn");

		Thread.sleep(7000);
		
		List<WebElement> li = driver.findElements(By.xpath("(//div[@role='presentation'])[2]/descendant::li"));
		
		
		System.out.println(li.size());
		
		for(WebElement text: li)
		{
			String elementText = text.getText();
			System.out.println(elementText);
			
			if(elementText.contains("customer"))
			{
				text.click();
				break;
			}
			
		}
	}
}

