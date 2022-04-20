package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91915\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vaishnavi");
		driver.findElement(By.name("lastname")).sendKeys("Kandukuri");
		driver.findElement(By.name("reg_email__")).sendKeys("vaishnavi@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vaishnavi@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vaishnavi@123");
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("09");

		Select selectMon=new Select(driver.findElement(By.name("birthday_month")));

		selectMon.selectByValue("01");

		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2001");

		driver.findElement(By.xpath("//input[@value='-1']")).click();

		
		Select selectPro=new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPro.selectByIndex(3);

		
		
		
		
		driver.findElement(By.name("websubmit")).click();

	}

}
