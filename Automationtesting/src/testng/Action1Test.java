package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action1Test {
	Actions a;
	WebDriver driver;
  @Test (priority=1)
  public void login() {
  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  driver.findElement(By.name("txtPassword")).sendKeys("admin");	  
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
     @Test(priority=2)
	  public void admin(){ 
		  
		  Actions a=new Actions(driver);
		  driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b")).click(); 
		  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  a.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		  driver.findElement(By.xpath(".//*[@id='101_dealView_4']/div/div[2]/div/div/div[8]/div/span/span/span/button")).click();
		  
	  }
	 
  @BeforeTest
  public void LaunchingBrowser() {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://opensource.demo.orangehrmlive.com/");  
		 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTestlogout() {
	 driver.findElement(By.linkText("Welcome Admin")).click();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.linkText("Logout")).click();
	  
  }

}
