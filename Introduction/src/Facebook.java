import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("http://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("debeale@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("~#0614$3@HaWk$1959~1");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("test");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_3']")).click();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();
	}

}
