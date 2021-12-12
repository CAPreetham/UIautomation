package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


public class BuyingMobile {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)");
		driver.findElement(By.xpath("//*[@alt='Apple iPhone XR (64GB) - White']")).click();
		
		 java.util.Set<String> ids = driver.getWindowHandles();
	     Iterator<String> it = ids.iterator();
	     String parentId = it.next();
	     String childId = it.next();
	     driver.switchTo().window(childId);
	     driver.findElement(By.id("add-to-cart-button")).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();

}
}
