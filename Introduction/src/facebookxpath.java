import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		/*XPath locators */
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("debeale@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("~#0614$3@HaWk$1959~1");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
			
		
	}

}
