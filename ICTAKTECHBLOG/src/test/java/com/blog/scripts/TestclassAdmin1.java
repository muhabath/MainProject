package com.blog.scripts;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.ictaktech.pages.LoginPage;



public class TestclassAdmin1 extends TestBase{
	
	
	//Pass email and password from Config.properties  file	
					LoginPage objlogin;
					@Test
					public void VerifyValidLogin() throws IOException
					{

						LoginPage lp=new LoginPage(driver);
						lp.clickdropdown();
						lp.clickLoginText();
						lp.setEmail(prop.getProperty("email"));
						lp.setPassword(prop.getProperty("passwd"));
						lp.clickLogin();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						lp.clickLogout();
						
						lp.clickdropdown();
						lp.clickLoginText();
						lp.setEmail(prop.getProperty("email2"));
						lp.setPassword(prop.getProperty("passwd2"));
						lp.clickLogin();
						lp.clickLogout();
						driver.switchTo().alert().accept();
						
						lp.clickdropdown();
						lp.clickLoginText();
						lp.setEmail(prop.getProperty("email1"));
						lp.setPassword(prop.getProperty("passwd1"));
						lp.clickLogin();
						lp.clickLogout();
		                driver.switchTo().alert().accept();
						
						lp.clickdropdown();
						lp.clickLoginText();
						lp.setEmail(prop.getProperty("email3"));
						lp.setPassword(prop.getProperty("passwd3"));
						lp.clickLogin();
						lp.clickLogout();
					
					    
		}


}
