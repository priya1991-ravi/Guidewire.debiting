import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");

driver.findElement(By.cssSelector("#email")).sendKeys("priya.1991ravi@gmail.com");

driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("runway@123");

driver.close();
	}

}
