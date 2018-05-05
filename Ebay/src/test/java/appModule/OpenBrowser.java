package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import utility.Log;

public class OpenBrowser {
	public static void load_Ebay(WebDriver driver,String baseUrl){
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		Log.info("Browser is Lunched");
		driver.manage().window().maximize();
		Log.info("Browser is Maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
