package week4.day2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectable {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/selectable");
	driver.switchTo().frame(0);
	List<WebElement> lis = driver.findElements(By.xpath("//ol[@class ='ui-selectable']/li"));
	System.out.println(lis.size());
	Actions builder = new Actions(driver);
	//Thread.sleep(2000);
	builder.clickAndHold(lis.get(0)).perform();
	builder.moveToElement(lis.get(3)).perform();
	//Thread.sleep(1000);
	builder.release().perform();
	for (WebElement webElement : lis) {
	System.out.println(webElement.getText());
	
}
	
	

	}

}
