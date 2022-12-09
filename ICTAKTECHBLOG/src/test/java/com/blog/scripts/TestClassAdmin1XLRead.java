package com.blog.scripts;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.ICTAKBLOG.utilities.ExcelUtilities;
import com.ictaktech.pages.LoginPage;



public class TestClassAdmin1XLRead extends TestBase{
	
	LoginPage objlogin;
	ExcelUtilities objread;

    
	@Test(priority=5)
	public void VerifyvalidLogin() throws IOException
	{
		objlogin=new LoginPage(driver);
		objlogin.clickdropdown();
		objlogin.clickLoginText();
		
		objread=new ExcelUtilities();
		String StrArray[][]= ExcelUtilities.getCellData();
		objlogin.setEmail( StrArray[0][0]);
		objlogin.setPassword(StrArray[0][1]);
		objlogin.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //for selenium 4
		objlogin.clickLogout();	
		
}
	@Test(priority=1)
	public void VerifyvalidLogin1() throws IOException
	{
		objlogin=new LoginPage(driver);
		objlogin.clickdropdown();
		objlogin.clickLoginText();
		objread=new ExcelUtilities();
		String StrArray[][]= ExcelUtilities.getCellData();
		objlogin.setEmail( StrArray[1][0]);
		objlogin.setPassword(StrArray[1][1]);
		objlogin.clickLogin();
		driver.switchTo().alert().accept();
		
	}	


	@Test(priority=2)
	public void VerifyvalidLogin2() throws IOException
	{
		objlogin=new LoginPage(driver);
		objlogin.clickdropdown();
		objlogin.clickLoginText();
		objread=new ExcelUtilities();
		String StrArray[][]= ExcelUtilities.getCellData();
		objlogin.setEmail( StrArray[2][0]);
		objlogin.setPassword(StrArray[2][1]);
		objlogin.clickLogin();
		driver.switchTo().alert().accept();
}
	
	@Test(priority=3)
	public void VerifyvalidLogin3() throws IOException
	{
		objlogin=new LoginPage(driver);
		objlogin.clickdropdown();
		objlogin.clickLoginText();
		objread=new ExcelUtilities();
		String StrArray[][]= ExcelUtilities.getCellData();
		objlogin.setEmail( StrArray[3][0]);
		objlogin.setPassword(StrArray[3][1]);
		objlogin.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //for selenium 4
		objlogin.clickLogout();	
		driver.switchTo().alert().accept();
}
	@Test(priority=4)
	public void VerifyvalidLogin4() throws IOException
	{
		objlogin=new LoginPage(driver);
		objlogin.clickdropdown();
		objlogin.clickLoginText();
		objread=new ExcelUtilities();
		String StrArray[][]= ExcelUtilities.getCellData();
		objlogin.setEmail( StrArray[4][0]);
		objlogin.setPassword(StrArray[4][1]);
		objlogin.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //for selenium 4
		objlogin.clickLogout();	
		driver.switchTo().alert().accept();
}

}
