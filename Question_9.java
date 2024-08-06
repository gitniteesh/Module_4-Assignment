package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_9 {

	public static void main(String[] args) {
		
		//.Keyboard Event
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions (driver);
		
		builder.click(search).sendKeys("mobiles").sendKeys(Keys.ENTER).build().perform();
		
		
	}
	
	
	
	
	
}
