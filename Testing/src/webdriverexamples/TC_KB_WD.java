package webdriverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_KB_WD {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	System.out.println("Down arrow for 1st time");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	System.out.println("Down arrow for 2nd time");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	System.out.println("Logout");
	Thread.sleep(4000);
	driver.close();
}
}

