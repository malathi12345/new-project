package log.simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
      public static WebDriver driver;
      public static Actions actions;
      
      public void lanchChromeBrowser(String url) {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.get(url);
	}
      
      public WebElement findElementById(String id) {
  		WebElement findElement = driver.findElement(By.id(id));
  		return findElement;
  		
  	}
      public WebElement findElementByXpath(String xpathExpression ) {
  		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
  		return findElement;
  	}
      public  static void click(WebElement findElement) {
  		
  		findElement.click();
  		

  	}
  	
  	public void sendKeys(WebElement findElement,String sendkeys) {
  		findElement.sendKeys(sendkeys);
  	}
  	public void doubleClick(WebElement findElement) {
  		actions.doubleClick(findElement).perform();

  	}
  	public void singleClick(WebElement findElement) {
  actions.click(findElement).perform();
  	}
  	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public static void enterText(WebElement element,String text) {
		element.sendKeys(text);

	}
	
    public void selectByIndex(WebElement findElement,int i) {
    	
    	Select select=new Select(findElement);
    	
    	select.selectByIndex(i);
    	
    	
    }
    

	public static void deselectByIndex(WebElement element, int i) {
		Select select = new Select(element);
		select.deselectByIndex(i);
	}

    public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
    public void implicitWait() {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    public  String getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}
    public static void scrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(false)", element);
	}
    public static String getAttributeByJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object value = executor.executeScript("argument[0].getAttribute('value')", element);
		return (String) value;
	}
    

}
