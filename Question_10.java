package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_10 {

	public static void main(String[] args) {
		
		//10.W.A.J. Script How to handled Alert in selenium
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		
        driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
		
	}
	
	
	
	
}
