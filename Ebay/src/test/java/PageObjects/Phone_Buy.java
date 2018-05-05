package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phone_Buy {

	private static WebElement element = null;
	
	public static void WaitForElementPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='binBtn_btn'][contains(text(),'Buy It Now')]")));

	}

	public static WebElement Colour_box(WebDriver driver){
		element = driver.findElement(By.id("msku-sel-1"));
		return element;

	}

	public static WebElement button_Buyitnow(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='binBtn_btn'][contains(text(),'Buy It Now')]"));
		return element;
	}
}