import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		/*
		driver.findElement(By.id("username")).sendKeys("test");;
		driver.findElement(By.id("password")).sendKeys("123456");;
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		*/
		driver.findElement(By.cssSelector("#username")).sendKeys("Test");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("#Login")).click();
		
		
	}

}
