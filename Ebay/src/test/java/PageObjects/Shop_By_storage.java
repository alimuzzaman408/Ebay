package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shop_By_storage {
	private static WebElement element=null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div/div/h1/span[text()='Apple iPhone 7']")));
	}
	
	public static WebElement text_128gb(WebDriver driver){
		element = driver.findElement(By.xpath(".//ul/li/a/p[text()='128GB']"));
		return element;
	}
}
