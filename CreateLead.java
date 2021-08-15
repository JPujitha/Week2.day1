package Week2.Day1.Assignmnet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Pujitha");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("J");

WebElement d1=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select Box=new Select(d1);
Box.selectByIndex(0);

driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pujitha");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("ABC");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Xyz");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");

WebElement d2=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select Box1=new Select(d2);
Box1.selectByValue("IND_AEROSPACE");

WebElement d3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select Box2=new Select(d3);
Box2.selectByVisibleText("Sole Proprietorship");

driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");

WebElement d4=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select Box3= new Select(d4);
Box3.selectByIndex(0);

driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Puja");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/14/2021");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
WebElement d5=driver.findElement(By.id("createLeadForm_currencyUomId"));
Select Box4= new Select(d5);
Box4.selectByValue("INR");

driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ASD");
WebElement A1=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
A1.clear();
A1.sendKeys("91");
	
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123456");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amail@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("NA");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("puji");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("AP");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Vij");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("522503");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("321");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("ppppp");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("viz");

WebElement d6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select Box5= new Select(d6);
Box5.selectByVisibleText("Indiana");

WebElement d7=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select Box6= new Select(d7);
Box6.selectByVisibleText("India");

driver.findElement(By.className("smallSubmit")).click();
String Title=driver.getTitle();
String lead="View Lead | opentaps CRM";
if (lead.equals(Title)) {
	System.out.println("Correct Page loaded");
}
else {
	System.out.println("Correct Page not loaded");
}


	}

}
