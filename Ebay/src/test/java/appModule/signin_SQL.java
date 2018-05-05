package appModule;
import org.openqa.selenium.WebDriver;
import PageObjects.SignIn_Page;
import utility.Constant;
import utility.Log;
import utility.SQLUtils;
public class signin_SQL {
	public static void Execute(WebDriver driver) throws Exception{
		String UserName = SQLUtils.GetSQLData(Constant.SQL_UserName);
		Log.info("User name picked from SQL is:  " +UserName);
		String PassWord = SQLUtils.GetSQLData(Constant.SQL_Password);
		Log.info("Password picked from SQL is:  " +PassWord);
		SignIn_Page.WaitForElementPresent(driver);
		SignIn_Page.checkbox_UserName(driver).sendKeys(UserName);
		Log.info("UserName is entered");
		SignIn_Page.checkbox_Password(driver).sendKeys(PassWord);
		Log.info("Password id entered");
		SignIn_Page.button_Signin(driver).click();
		Log.info("Login Successfully");
		//System.out.println("Login Successfully");
	}
}
