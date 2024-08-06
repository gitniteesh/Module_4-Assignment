package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_8 {

	public static void main(String[] args) throws InterruptedException {
		
		//.W.A.J.Script To use Mouse and Keyboard event using Action class
		//1.Mouse Hover Event
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement Grocery = driver.findElement(By.linkText("Grocery"));
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		WebElement Fashion = driver.findElement(By.linkText("Fashion"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(Grocery).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(Mobiles).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(Fashion).build().perform();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
}
