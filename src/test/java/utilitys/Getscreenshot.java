package utilitys;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Getscreenshot {
	
	public static String captureScreenShot(WebDriver driver,String screenshotName){
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;

		    File sources = ts.getScreenshotAs(OutputType.FILE);

	    String dest= System.getProperty("user.dir")+"/ErrorScreenShots/"+screenshotName+".png";
        
	    File destination = new File(dest);
	   
        FileUtils.copyFile(sources,destination );
	   
	    System.out.println("ScreenShot taken");
	   
	    return dest;   
		   } 
		
		
		catch (Exception e) 
		
		{
	
System.out.println("Exception while taking screenshot"+e.getMessage());
		
			return e.getMessage();
		}
		
}

}
