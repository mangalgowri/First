package webdriverexamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;
public class TC_Frames {
	static String username="Admin";
	static String password="admin123";
public static void main(String args[]) throws Exception{
	//Test case steps
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(5000);
	System.out.println("Login completed");
	//Verify Text 
	assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
	//enter into frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(3000);
	//retrive the data from textbox
	String empid = driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).getAttribute("value");
	System.out.println(empid);
	
	driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("suresh");
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	Thread.sleep(3000);
	System.out.println("New Emp Added");
	//Exit from frame
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
