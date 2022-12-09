package com.ictaktech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1.Create Consructor	
		WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	//2.Find Locators  :For this we  use the annotation @FindBy	
			@FindBy(xpath="//li[@class='nav-item dropdown ng-star-inserted']")
			private WebElement dropdown;
			@FindBy(xpath="//a[@href='/login']")
			private WebElement Logintext;
			
			@FindBy(id="user")
			private WebElement username;
			@FindBy(id="pwd")
			private WebElement password;
			@FindBy(id="logbut")
			private WebElement btnlogin;
			
			@FindBy(xpath="//li[11]//a[1]")
			private WebElement Logouttext;
	//3.send data and click()
			public void clickdropdown()
			{
				dropdown.click();
			
			}
			public void clickLoginText()
			{
				Logintext.click();
			}
			public void setEmail(String email)
			{
				username.sendKeys(email);
			}
			
			public void setPassword(String pwd)
			{
				password.sendKeys(pwd);
			}
			
			
			public void clickLogin()
			{
				btnlogin.click();
			}
			public void clickLogout()
			{
				Logouttext.click();
			}

			public boolean isAllPostsPageExists()
			{
				try
				{
					
				WebElement linktext = driver.findElement(By.linkText("All Posts"));
				return (linktext.isDisplayed());
				}
				catch(Exception e)
				{
					return(false);
				}
			}			
}
