package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_5 {

	public static void main(String[] args) {
		
		//5.W.A.J. Script To perform the radio button to select one by one in loop
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("(//input[@name='webform'])[1]")).click();
		
		
		
		
	}
	
	
	
}
