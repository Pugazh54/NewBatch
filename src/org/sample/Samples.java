package org.sample;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Samples {
	
private static final int FILE = 0;

public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
	Thread.sleep(3000);
	JavascriptExecutor s = (JavascriptExecutor) driver;
	s.executeScript("arguments[0].setAttribute('value','Watches')", search);
	Thread.sleep(3000);
	
	TakesScreenshot a =(TakesScreenshot) driver;
	File source = a.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\pugazh\\eclipse\\Browser\\Screenshot.ss.png");
	FileUtils.copyFile(source, des);
	
}
}
