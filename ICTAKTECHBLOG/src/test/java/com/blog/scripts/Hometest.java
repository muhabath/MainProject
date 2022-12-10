package com.blog.scripts;

import java.time.Duration;

import org.testng.annotations.Test;

import com.ictak.homepage.Homepage;


public class Hometest extends TestBase {

Homepage objhome;
	
	@Test(priority=1)
	
    public void verifyhomepage()
	{
   
		
    objhome = new Homepage(driver);
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //for selenium 4
    
    objhome.setHomef();
   
	}
    
   @Test(priority=2)
   public void verifycategories()
   {
	   objhome = new Homepage(driver);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	    objhome.setCategories();
   }
   @Test(priority=3)
   public void tosortcat()
   
   {
	   objhome = new Homepage(driver);
	   driver.navigate().refresh();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	 objhome.setCategories();
	objhome.Categoriessort();
   
   }
   @Test(priority=4)
   public void aboutus()
   {
	   objhome = new Homepage(driver);
	   driver.navigate().refresh();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	    objhome.clickaboutus();
   }
   @Test(priority=5)
   public void profileH()
   {
	   objhome = new Homepage(driver);
	   driver.navigate().refresh();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	    objhome.clickprofile();
   }
	@Test(priority=6)
	public void contactusH()
	{
		 objhome = new Homepage(driver);
		 driver.navigate().refresh();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
		    objhome.clickcontactus();
	}
	@Test(priority=7)
	public void loginp()
	{
		 objhome = new Homepage(driver);
		 driver.navigate().refresh();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
		    objhome.clickprofile();
		    objhome.loginpage();
	}
	@Test(priority=8)
	public void signupp()
	{
		 objhome = new Homepage(driver);
		 driver.navigate().refresh();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
		    objhome.clickprofile();
		    objhome.signuppage();
	}
	
	@Test(priority=9)
	public void exit()
	
	{
		driver.quit();
	}    
                                                                  
     
//  String expectedTitle =AutomationConstants.HOMEPAGETITLE;
//String actualTitle =driver.getTitle();
 // Assert.assertEquals(expectedTitle,actualTitle);
    }
	

	

                                          
	

