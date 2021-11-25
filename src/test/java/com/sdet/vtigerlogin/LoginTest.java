package com.sdet.vtigerlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public void verifyUserAbleToLoginWithalidCredentials() {
		WebDriverManager.chromedriver().setup();
		Reporter.log("launching chrome browser",true);
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("Maximizing the window",true);
		driver.manage().window().maximize();
		Reporter.log("Setting implict wait to 10 seconds",true);
		throw new SkipException("skip");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Reporter.log("Navigating to http://localhost:8888",true);
//		driver.get("http://localhost:8888");
//		Reporter.log("entering username",true);
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		Reporter.log("entering password",true);
//		driver.findElement(By.name("user_password")).sendKeys("manager");
//		Reporter.log("clicking on submit button",true);
//		driver.findElement(By.id("submitButton")).click();
//		Reporter.log("capturing the title",true);
//		System.out.println(driver.getTitle());
//		Reporter.log("close browser",true);
//		driver.close();
	}

}
