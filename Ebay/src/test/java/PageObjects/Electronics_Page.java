package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Electronics_Page {

	private static WebElement element=null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div/h1[text()='Electronics']")));
	}

	public static WebElement text_CellphonesAndAccessories(WebDriver driver){
		element=driver.findElement(By.xpath(".//div/ul/div/li/ul/li/a[contains(text(),'Cell Phone')]"));
		return element;
	}
	
	public static WebElement text_CellphonesAndSmartPhones(WebDriver driver){
		element=driver.findElement(By.xpath(".//div/ul/div/li/ul/li/ul/li/a/span[text()='Cell Phones & Smartphones']"));
		return element;
	}

}
