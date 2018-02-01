package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionTest {
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
	  }
	 
  @BeforeTest
  public void LaunchingBrowser() {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 driver.get("http://opensource.demo.orangehrmlive.com/");    
  }

  @AfterTest
  public void afterTestlogout() {
	 driver.findElement(By.linkText("Welcome Admin")).click();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.linkText("Logout")).click();
	  
  }

}
