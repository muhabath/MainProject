package com.blog.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.blog.pages.Adminloginpage;

import com.blog.pages.Approve;

import com.blog.utilities.Excelutility;



public class TestClassAdmin2 extends TestBase{

	Adminloginpage objlogin;
	Excelutility objread;
    Approve objapp;
	
	@Test(priority=1)
	public void VerifyValidLogin() throws IOException
	{
		objlogin=new Adminloginpage(driver);
		objlogin.Profile();
		objlogin.Loginto();
		objread=new Excelutility();
		String StrArray[][] = Excelutility.getCellData();
		
		objlogin.setEmailid(StrArray[0][0]);
		objlogin.setPassword(StrArray[0][1]);
		objlogin.clicklogin();
	}
	@Test(priority=2)
	
	public void verifycategories()
	{
		
		//objlogin.categories();
	
		
			
	}
	
      
      @Test(priority=3)
      public void VerifyAct2()
      {
    	  objlogin.Actions1();
      }
      
      
	@Test(priority=4)
	public void Verifyapprove()
	{
		objlogin.Pendingapprovals();
		objapp=new Approve(driver);
		objapp.Clickapprove();
		driver.switchTo().alert().accept();
		
		
	}
	
	@Test(priority=5)
	public void actagain()
	{
		objlogin.Actions1();
	}
	@Test(priority=6)
      public void Verifytoaddandremovecategories()
    {
   		
   	  
   	  objlogin.addremovecatgories();
   	  objlogin.setaddcategories();
   	 objlogin.catadd();
   	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
   	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
   	alert.accept();
   //	driver.quit();
   	  
     }
	
}
