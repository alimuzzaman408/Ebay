package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appModule.OpenBrowser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.ExcelUtils;

public class TestRun {
	
	private static WebDriver driver = null;	
	@Test
	public void run() throws Exception{
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		OpenBrowser.load_Ebay(driver,Constant.URL);		
		driver.quit();
		System.out.println(Constant.Path_TestData + Constant.File_TestData);
		ExcelUtils.SetExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		ExcelUtils.SetCellData(1, Constant.Col_Results, "Pass");
	}	  
}

