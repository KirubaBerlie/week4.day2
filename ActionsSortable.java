package week4.day2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		List<WebElement> unorderList = driver.findElements(By.xpath("//ul[@class='ui-sortable']/li"));
		Actions builder = new Actions(driver);
		builder.moveToElement(unorderList.get(6)).perform();
		builder.dragAndDrop(unorderList.get(6), unorderList.get(0)).release().perform();
		
	}

}
