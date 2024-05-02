package org.sample;







import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class New2 {
public static void main(String[] args) throws InterruptedException  {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
     driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("iphone 14");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='desktopSearchResults']")).click();
     Thread.sleep(3000);
    String pd = driver.getWindowHandle();
    
    Set<String> chd = driver.getWindowHandles();
    
    List<String> aa = new LinkedList<String> ();
    aa.addAll(chd);
    
    driver.switchTo().window(pd);
    Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]")).click();
	
	WebElement ss = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]"));
	System.out.println(ss.getText());
}
	
	
	
	
	
	
	
	
	
	
}
