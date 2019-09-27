package webdriverexamples;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class TC_WaitStmt {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//Explicit wait
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		WebDriverWait wait = new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		driver.findElement(By.name("Submit")).click();
		//Explicit Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		
	}
	}

