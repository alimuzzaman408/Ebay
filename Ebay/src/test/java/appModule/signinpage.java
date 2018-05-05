package appModule;
import org.openqa.selenium.WebDriver;
import PageObjects.SignIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
public class signinpage {
	public static void Execute(WebDriver driver) throws Exception{
		String UserName = ExcelUtils.GetCellData(1, Constant.Col_UserName);
		Log.info("User name picked from Excel is:  " +UserName);
		String PassWord = ExcelUtils.GetCellData(1,Constant.Col_PassWord);
		Log.info("Password picked from Excel is:  " +PassWord);
		SignIn_Page.WaitForElementPresent(driver);
		SignIn_Page.checkbox_UserName(driver).sendKeys(UserName);
		SignIn_Page.checkbox_Password(driver).sendKeys(PassWord);
		SignIn_Page.button_Signin(driver).click();
		System.out.println("Login Successfully");
	}
}
