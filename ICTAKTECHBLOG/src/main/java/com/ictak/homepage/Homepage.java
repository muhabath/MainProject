package com.ictak.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 /* All WebElements are identified by @FindBy annotation
     */
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
    
    public Homepage(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver, this);
    }
    
  public void setHomef(){
  	Homef.click();  
    	
  }

  public void setCategories()
  {
  	Categories.click();
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

}
