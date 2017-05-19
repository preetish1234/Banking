package page;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import utilitys.Baseclasse;

import utilitys.log.Log;
import utilitys.util;

public class Shop extends Baseclasse {

	WebDriver  driver;

	public Shop(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='dl-menu']//following::*[contains(text(),'Shop')]")
	public static WebElement Shop_Tab;
	
	public void click_on_ShopTab(WebDriver driver){
		
		 try {
			   util.isElementPresnt(driver, ".//*[@id='dl-menu']//following::*[contains(text(),'Shop')]", 40);

			   

			 test.log(Status.INFO, "click on shoptab");
			    	
			   JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();",Shop_Tab );
			               
					   Log.info("click in Shop");

		 
					   utilitys.util.SwitchWindow(driver);
					test.log(Status.INFO, "Switch to new tab");
		 
		 }
			    catch (Exception e) {
					e.printStackTrace();
				}
		 
				}
		
		
		
	}
	
