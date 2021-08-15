package Week2.Day1.Assignmnet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Pujitha");
		driver.findElement(By.name("lastname")).sendKeys("J");
		driver.findElement(By.name("reg_email__")).sendKeys("pujitha@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("PASS@123");
		
		WebElement db1=driver.findElement(By.id("day"));
		Select Drop1= new Select(db1);
		Drop1.selectByIndex(0);
		
		WebElement db2= driver.findElement(By.id("month"));
		Select drop2= new Select(db2);
		drop2.selectByValue("1");
		
		WebElement db3= driver.findElement(By.id("year"));
		Select drop3=new Select(db3);
		drop3.selectByVisibleText("2014");
		
		driver.findElement(By.className("_8esa")).click();
		
			

}
}
