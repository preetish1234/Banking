package crm;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilitys.Baseclass;
import utilitys.BrowserFactory;
import utilitys.DataProviderFactory;

public class ApplicationTest extends Baseclass{
	
	

	
	@Test(alwaysRun=true)
	public void BrowserEngin() throws Exception{

	         try {
	        	 
	        	 
	        	 test = extent.createTest("BrowserEngin","this will start the browser");	 
	        	
	             driver = BrowserFactory.startBrowser("IE");
	             
	           driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	     
	         driver.manage().window().maximize();
	         
	           
	           String title = driver.getTitle();
	                  System.out.println(title);
	         
	   Assert.assertEquals(1235, title);  
	         
	         } catch (Exception e) {
					
			System.out.println(e);
				}
		} 	
}

