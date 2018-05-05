package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Home_Page {
	private static WebElement element=null;
	public static WebElement link_Electronics(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='w0-container']/li/a[text()='Electronics']"));
		return element;		
	}
	//element=driver.findElement(By.xpath(".//div/table/tbody/tr/td/a[text()='Motors']"));
	//element=driver.findElement(By.xpath(".//div/table/tbody/tr/td/a[text()='Fashion']"));
	//element=driver.findElement(By.xpath(".//div/table/tbody/tr/td/a[text()='Music']"));
	//element=driver.findElement(By.xpath(".//div/table/tbody/tr/td/a[text()='Toys']"));
	//element=driver.findElement(By.xpath(".//div/table/tbody/tr/td/a[text()='Deals']"));
}

