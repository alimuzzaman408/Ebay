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
import PageObjects.SignIn_Page;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class POM_TC {
	private static WebDriver driver=null;
	@BeforeTest
	public void beforeTest(){
		ChromeDriverManager.getInstance().setup();
		driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\shapan\\eclipse\\java-neon\\FirefoxDriver\\geckodriver.exe");  
		//WebDriver driver=new FirefoxDriver();
		String baseUrl="http://www.ebay.com/";
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@Test
	public void run() {
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
		Limited_deals.WaitForElementPresent(driver)	;
		Limited_deals.link_UniversalUnlock(driver).click();
		Phone_Buy.WaitForElementPresent(driver);
		Phone_Buy.Colour_box(driver).click();
		Phone_Buy.Colour_box(driver).sendKeys("black");
		Phone_Buy.button_Buyitnow(driver).click();
		SignIn_Page.WaitForElementPresent(driver); 
		SignIn_Page.checkbox_UserName(driver).sendKeys("alimuzzaman408@yahoo.com");
		SignIn_Page.checkbox_Password(driver).sendKeys("Zerin1994");
		SignIn_Page.button_Signin(driver).click();
		System.out.println("Login successfull");
		//Ebay_Chechout.WaitForElementPresent(driver);
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();  

	}

}


