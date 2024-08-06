package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_7 {

	public static void main(String[] args) {
		
		//7.W.A.J.Script To write a script for drop down.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Nitesh");
		driver.findElement(By.name("lastName")).sendKeys("Maurya");
		driver.findElement(By.name("phone")).sendKeys("8000806020");
		driver.findElement(By.name("userName")).sendKeys("niteshmaurya123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("kadodara");
		driver.findElement(By.name("city")).sendKeys("surat");
		driver.findElement(By.name("state")).sendKeys("gujarat");
		driver.findElement(By.name("postalCode")).sendKeys("02622");
		
		WebElement country = driver.findElement(By.name("country"));
		Select countries = new Select(country);
		countries.selectByVisibleText("AMERICAN SAMOA");
		
		driver.findElement(By.name("email")).sendKeys("nitesh123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
	}
	
	
	
}
