package Week2.Day1.Assignmnet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Pujitha");
		driver.findElement(By.name("UserEmail")).sendKeys("Pujitha@gmail.com");
		driver.findElement(By.name("UserLastName")).sendKeys("J");
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		driver.findElement(By.name("UserPhone")).sendKeys("9988774410");
		
		WebElement drop1=driver.findElement(By.name("UserTitle"));
		Select Box1=new Select(drop1);
		Box1.selectByIndex(0);
		
		WebElement drop2=driver.findElement(By.name("CompanyEmployees"));
		Select Box2=new Select(drop2);
		Box2.selectByValue("9");

		WebElement drop3=driver.findElement(By.name("CompanyCountry"));
		Select Box3=new Select(drop3);
		Box3.selectByVisibleText("United States");
		
		driver.findElement(By.className("checkbox-ui-label")).click();
		driver.close();

		
	}

}
