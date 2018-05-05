package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn_Page {
	
	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='fld'][@placeholder='Email or username']")));
	}
	
	public static WebElement checkbox_UserName(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@class='fld'][@placeholder='Email or username']"));
		return element;
	}
	
	public static WebElement checkbox_Password(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@class='fld'][@placeholder='Password']"));
		return element;
	}
	
	public static WebElement button_Signin(WebDriver driver){
		element=driver.findElement(By.id("sgnBt"));
		return element;	

	}	

}

//.//form[@id='SignInForm']//input[@id='226644517'][@placeholder='Email or username']