package week3.day2;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Ajio {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.ajio.com/");
				driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				String totalItems = driver.findElement(By.className("length")).getText();
		    System.out.println("Total number of items : " + totalItems);
      		System.out.println(" List of Brands");
      		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
      		System.out.println(" Size :" + bagBrandList.size());
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
				List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
			}
}


