package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_1 {

	public static void main(String[] args) {
		
		//1.W.A.J.Script for Locating links by linkText() and partialLinkText()
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		

		
		
	}
	
	
	
}
