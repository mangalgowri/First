package webdriverexamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class TC_Alerts {	
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("Admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	Thread.sleep(3000);
	a.accept();
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
