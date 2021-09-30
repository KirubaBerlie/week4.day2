package week4.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsResizable {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://jqueryui.com/resizable");
driver.switchTo().frame(0);
WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
Actions builder = new Actions(driver);
//builder.moveToElement(resize).perform();
builder.clickAndHold(resize).moveByOffset(-150,-150).perform();
builder.release();



	}

}
