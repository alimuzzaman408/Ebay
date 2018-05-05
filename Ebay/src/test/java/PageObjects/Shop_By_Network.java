package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shop_By_Network {
	private static WebElement element=null;

	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div/div/h1/span[contains(text(), 'Apple iPhone 7 128GB')]")));
	}

	public static WebElement text_Verizon(WebDriver driver){
		element = driver.findElement(By.xpath(".//ul/li/a/p[text()='Verizon']"));
		return element;
	}
}

