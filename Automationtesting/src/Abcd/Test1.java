package Abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        driver.navigate().to("http:amazon.com");
        driver.navigate().to("http:flipcart.com");
        driver.navigate().to("http:moneycontrol.com");   
        driver.navigate().to("http:amazon.com");
        driver.navigate().to("http:investing.com");
        
        
	}

}
