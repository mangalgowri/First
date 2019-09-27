package webdriverexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC102 {
	static String username="Admin";
	static String password="admin123";
	
	
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver(); //open browser
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	//verify title
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched and expected title is " + driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	//mouse over
	WebElement pimmenu = driver.findElement(By.linkText("PIM"));
	Actions ac = new Actions(driver);
	ac.moveToElement(pimmenu).perform();
	System.out.println("Mouse over completed");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("Clicked on submenu");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.quit();
}
}


