package utilitys;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BrowserFactory
      {
      
 static WebDriver driver;
@BeforeTest(alwaysRun=true)
@Parameters("Browser")
public static WebDriver startBrowser(String browserName)throws MalformedURLException
		{
			if(browserName.equalsIgnoreCase("firefox")){
				
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					   capabilities.setCapability("marionette", false);
					   capabilities.setPlatform(Platform.WIN8_1);
					   capabilities.setBrowserName("firefox");
					   capabilities.setCapability(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,System.setProperty("webdriver.firefox.marionette",
					    		                        DataProviderFactory.getConfig().getFireFoxGekoPath()));
						
					    ProfilesIni profile = new ProfilesIni();
				FirefoxProfile myprofile = profile.getProfile("preetish");
				          driver =new FirefoxDriver(myprofile);
				}
				
				else if(browserName.equalsIgnoreCase("chrome"))
				{
					DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					capabilities.setPlatform(Platform.WIN8_1);
					capabilities.setBrowserName("chrome");
				    capabilities.setCapability(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,System.setProperty("webdriver.chrome.driver", 
				    		"C:\\Users\\Preetish Kumar\\workspace\\Banking\\driver\\chromedriver.exe"));
				
				    driver =  new ChromeDriver(capabilities);
				}
				
				else if(browserName.equalsIgnoreCase("ie"))
				{
					
					
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setPlatform(Platform.WIN8_1);
					capabilities.setBrowserName("ie");
					capabilities.setCapability(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,System.setProperty("webdriver.ie.driver",
                            "C:\\Users\\Preetish Kumar\\Desktop\\Banking\\driver\\IEDriverServer.exe"));
                       driver = new InternetExplorerDriver(capabilities);
					
					
				}
				
			
			
		
			return driver;

            }
	
		
}