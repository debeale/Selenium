import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClick_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		
		driver.findElement(By.xpath("//*[@id=\'homepage\']/header/div[2]/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getTagName());

	}

}
