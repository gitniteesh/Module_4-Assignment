package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Question_2 {

	public static void main(String[] args) {
		
		
		//2.W.A.J.Script for Selecting multiple items in a drop dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Nitesh");
		driver.findElement(By.id("lastName")).sendKeys("Maurya");
		driver.findElement(By.id("userEmail")).sendKeys("nitesh@123.gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9080706050");
		
		String myDate ="3";
		String myMonth = "November";
		String myYear = "1999";
			
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		for(WebElement date : dates)
		{
			if(date.getText().equalsIgnoreCase(myDate))
			{
				if(date.getAttribute("aria-label").contains(myMonth))
				{
					date.click();
					break;
				}
			}
		}
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		
		Actions builder = new Actions(driver);
		
		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
	}
	
	
	
}
