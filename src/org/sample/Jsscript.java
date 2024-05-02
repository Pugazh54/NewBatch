package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jsscript {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/login");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);
JavascriptExecutor j = (JavascriptExecutor) driver;

WebElement mobNum = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	j.executeScript("arguments[0].setAttribute('value','9500808808')", mobNum);
	Thread.sleep(3000);
	
	
	WebElement cc = driver.findElement(By.xpath("//*[@id=\"checkUser\"]"));
	j.executeAsyncScript("arguments[0].click()", cc);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
