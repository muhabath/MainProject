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
   public void aboutus()
   {
	   objhome = new Homepage(driver);
	   driver.navigate().refresh();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	    objhome.clickaboutus();
   }

@Test(priority=4)
   public void profileH()
   {
	   objhome = new Homepage(driver);
	   driver.navigate().refresh();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
	    objhome.clickprofile();
   }
@Test(priority=5)
	public void contactusH()
	{
		 objhome = new Homepage(driver);
		 driver.navigate().refresh();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //for selenium 4
		    objhome.clickcontactus();
	}
	@Test(priority=6)
	public void exit()
	
	{
		driver.quit();
	}    
   
                                                                   
	
}
