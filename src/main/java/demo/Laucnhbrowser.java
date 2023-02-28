package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Laucnhbrowser {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver;
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	//	WebDriverManager.firefoxdriver().setup();
	//	driver = new FirefoxDriver();
		
		driver.get("http://localhost:8080/SavingsAccount/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer")).click();
		Thread.sleep(3000);
        driver.switchTo().alert();
        Alert alert= driver.switchTo().alert();
        alert.accept();
		Thread.sleep(3000);
        WebElement mp = driver.findElement(By.xpath("//input[@name='username']"));
        mp.clear();
        mp.sendKeys("username");
        WebElement sh = driver.findElement(By.xpath("//input[@name='password']"));
        mp.clear();
        mp.sendKeys("username");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Transaction"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Deposit")).click();
		Thread.sleep(3000);
		WebElement AccNo = driver.findElement(By.tagName("select"));
		AccNo.click();
		Select s = new Select(AccNo);
		s.selectByValue("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='creditAmt']")).sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Close']")).click();
		
	    Actions act1 = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Account"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mini Statement")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Actions act2 = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Account"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Statements")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='account_no']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='amt']")).sendKeys("1");
		WebElement date = driver.findElement(By.xpath("//input[@name='from']"));
		date.sendKeys("01022023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='to']")).sendKeys("20022023");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/select")).click();
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/select/option[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	    
      //  Select gg = new select();ath("//input[@value='Logout']")).click();
//		Thread.sleep(3000);
//        driver.switchTo().alert();
//        Alert alert1= driver.switchTo().alert();
//        alert.accept();
//       driver.findElement(By.xp
//		Thread.sleep(3000);
	}

}
