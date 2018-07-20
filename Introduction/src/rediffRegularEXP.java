import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffRegularEXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("input[title*='Sign in']")).click();
		driver.close();
	}

}
