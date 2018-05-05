package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Limited_deals {
	private static WebElement element=null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div/div/div/section/div/h2[text()='Limited Time Deals']")));
	}

	public static WebElement link_UniversalUnlock(WebDriver driver){
		element = driver.findElement(By.xpath(".//ul/li/a/div/div[contains(text(),'Apple iPhone 7 a1660 128GB')]"));
		return element;
	}

}
