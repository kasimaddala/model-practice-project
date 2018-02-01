package Abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
      
	  WebDriver driver;
	
	public void Launchingchrome(){
		 
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
			
	}
	
   public static void main(String[] args){
			
		GmailLogin s= new GmailLogin();
		s.Launchingchrome();
			
		}
		
	}
	
	
	
	
	
	

