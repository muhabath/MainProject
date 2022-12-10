package com.ictak.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 WebDriver driver;
	  
	    
	  @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[1]/a")
	  private WebElement Homef;
	    
	    @FindBy(linkText = "Categories")
	 //@FindBy(xpath = "/html/body/app-root/app-home/app-header/nav/div/div/ul/li[7]/a/p")
	  private WebElement Categories;    
	 
	 @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[8]/a")
	   private WebElement Aboutus;
	 
	   @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[9]/a")
	    private WebElement contactUs;
	   
	 
	     @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[11]/a")
	     private WebElement profile;
	     
	     @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[7]/ul/li[1]/a")
	     private WebElement  Sorttocat;
	     
	     @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[11]/ul/li[1]/a")
	     private WebElement login;
	     
	     @FindBy(xpath="/html/body/app-root/app-home/app-header/nav/div/div/ul/li[11]/ul/li[2]/a")
	     private WebElement signup;
	    
	    public Homepage(WebDriver driver){
	        this.driver = driver;
	       
	        PageFactory.initElements(driver, this);
	    }
	    
	  public void setHomef()
	  {
	  	Homef.click();  
	    	
	  }

	  public void setCategories()
	  {
	  	Categories.click();
	    }
	  public void Categoriessort()
	  {
		  Sorttocat.click();
	    }
	    
	   public void clickaboutus()
	   {
	   	Aboutus.click();
	   }
	   public void clickcontactus()
	   {
	   	contactUs.click();
	   }
	   public void clickprofile()
	   {
	   	profile.click();
	   }
	   public void loginpage()
	   {
	   	login.click();
	   }
	   public void signuppage()
	   {
	   	signup.click();
	   }

}
