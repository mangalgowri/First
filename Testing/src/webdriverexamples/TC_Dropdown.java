package webdriverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("E://ChromeDriver//dropdownNavigate.html");
	Thread.sleep(3000);
	Select st = new Select(driver.findElement(By.name("OptWeb")));
	st.selectByVisibleText("Google");
	Thread.sleep(3000);
	driver.findElement(By.name("btnGo")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().to("E://ChromeDriver//multiselectdropdown.html");
	Thread.sleep(3000);
	Select st1 = new Select(driver.findElement(By.id("tools")));
	Thread.sleep(3000);
	st1.selectByVisibleText("Selenium IDE");
	System.out.println("IDE");
	Thread.sleep(3000);
	st1.selectByIndex(1);
	System.out.println("RC");
	Thread.sleep(3000);
	st1.selectByIndex(3);
	System.out.println("Grid");
	Thread.sleep(3000);
	driver.close();
}
}
