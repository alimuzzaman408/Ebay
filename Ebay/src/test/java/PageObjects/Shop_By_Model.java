package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Shop_By_Model {

	private static WebElement element=null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='w1']/div/h2[text()='Shop by Model']")));
	}

	public static WebElement text_iphone7(WebDriver driver){
		element = driver.findElement(By.xpath(".//ul/li/a/p[text()='iPhone 7']"));
		return element;
	}

}
