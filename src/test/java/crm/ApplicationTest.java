package crm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.Shop;
import utilitys.Baseclasse;
import utilitys.BrowserFactory;
import utilitys.DataProviderFactory;
import utilitys.log;

public class ApplicationTest extends Baseclasse{
	
static	WebDriver driver;	


	
	@Test(alwaysRun=true,priority=0)
	public void BrowserEngin() throws Exception{

	         try {
	        	 
	        	 
	       test = extent.createTest("BrowserEngin","this will start the browser");	 
	        	
	              driver = BrowserFactory.startBrowser("chrome");
	                 driver.manage().window().maximize();
	          driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	                    log.Log.info("Take the url");
	               
	         } catch (Exception e) {
					
	 			System.out.println(e);
	 				}
	         }
	               
	
	@Test(alwaysRun=true,priority =1,description="Verify the Home Page",dependsOnMethods="BrowserEngin")
	           	public void verifyPage() throws IOException{       
	           
	            	   try {      
	            		   
	            		  
	            		   test = extent.createTest("verifyPage","Verify the home page");
	            		   
	            String title = driver.getTitle();
	                  System.out.println("Home page title- "+title);
	                  String Expected = "Café Coffee Day | A Lot Can Happen Over Coffee";
	   Assert.assertEquals(Expected,title);  
	               
	         } catch (Exception e) {
					
			System.out.println(e);
				}
		}
	@Test(alwaysRun=true,priority =2,description="Verify the Click on shop menu",dependsOnMethods="verifyPage")
	public void Click_on_Shop(){
		test = extent.createTest("click_on_ShopTab","Click on Shop_tab successful");
		        Shop el = new Shop(driver);
		el.click_on_ShopTab(driver);
	driver.quit();
		
	}
	}



