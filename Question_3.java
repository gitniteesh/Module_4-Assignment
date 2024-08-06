package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_3 {

	public static void main(String[] args) {
		
		//3.W.A.J. script to use different methods to manage the windows-alerts and pop ups.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
        driver.findElement(By.name("cusid")).sendKeys("123");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
	}
	
	
	
}
