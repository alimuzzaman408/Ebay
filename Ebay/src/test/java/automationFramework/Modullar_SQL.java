package automationFramework;
import org.testng.annotations.Test;
import PageObjects.Electronics_Page;
import PageObjects.Home_Page;
import PageObjects.Limited_deals;
import PageObjects.Phone_Buy;
import PageObjects.Shop_By_Brand;
import PageObjects.Shop_By_Model;
import PageObjects.Shop_By_Network;
import PageObjects.Shop_By_storage;
import appModule.OpenBrowser;
import appModule.signin_SQL;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import utility.Constant;
import utility.Log;
import utility.SQLUtils;

import org.testng.annotations.BeforeTest;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
public class Modullar_SQL {
	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Ebay_01");
		String browserName =SQLUtils.GetSQLData(Constant.SQL_Browser);

		if(browserName.equals("Chrome")) {

			ChromeDriverManager.getInstance().setup();

			driver = new ChromeDriver();	

		}

		if(browserName.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver","C:\\Users\\shapan\\eclipse\\java-neon\\FirefoxDriver\\geckodriver.exe");	
			driver = new FirefoxDriver();	

		}

		if(browserName.equals("IE")) {

			InternetExplorerDriverManager.getInstance().setup();

			driver = new InternetExplorerDriver();	

		}

		OpenBrowser.load_Ebay(driver,Constant.URL);
	}		

	@Test
	public void run() throws Exception { 
		Home_Page.link_Electronics(driver).click();
		Electronics_Page.WaitForElementPresent(driver);
		Electronics_Page.text_CellphonesAndAccessories(driver).click();
		Electronics_Page.text_CellphonesAndSmartPhones(driver).click();
		Shop_By_Brand.WaitForElementPresent(driver);
		Shop_By_Brand.text_Apple(driver).click();
		Shop_By_Model.WaitForElementPresent(driver);
		Shop_By_Model.text_iphone7(driver).click();
		Shop_By_storage.WaitForElementPresent(driver);
		Shop_By_storage.text_128gb(driver).click();
		Shop_By_Network.WaitForElementPresent(driver);
		Shop_By_Network.text_Verizon(driver).click();
		Limited_deals.WaitForElementPresent(driver);
		Limited_deals.link_UniversalUnlock(driver).click();
		Phone_Buy.WaitForElementPresent(driver);
		Phone_Buy.Colour_box(driver).click();
		Phone_Buy.Colour_box(driver).sendKeys("black");
		Phone_Buy.button_Buyitnow(driver).click();
		signin_SQL.Execute(driver);
		//Log.info("Sign in to Ebay");
	}

	@AfterTest
	public void afterTest() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		driver.quit();
		SQLUtils.SetSQLData(Constant.SQL_REsult);
		Log.info("Test excution result is written into database table");
		Log.EndTestCase("Ebay_01");
	}
}


