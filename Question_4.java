package Assignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_4 {

	public static void main(String[] args) {
		
		//4.W.A.J.script to register your self in Gmail.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
	
		driver.findElement(By.xpath("(//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c'])[1]")).click();
		
		//driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
			
	
		driver.findElement(By.name("firstName")).sendKeys("Malati");
		driver.findElement(By.name("lastName")).sendKeys("Maurya");
		
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
		
	
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("January");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
