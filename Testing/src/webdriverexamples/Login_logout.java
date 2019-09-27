package webdriverexamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Login_logout {
public static void main(String args[]) throws Exception{
	//Test case steps
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//open browser
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php"); //enter url
	System.out.println("Application opened");
	driver.findElement(By.name("txtUserName")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close(); //close browser
	
	
}
}
