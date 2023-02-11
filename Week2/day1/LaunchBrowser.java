package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver CB= new ChromeDriver();
		CB.manage().window().maximize();
		CB.get("http://leaftaps.com/opentaps/control/login");
		CB.findElement(By.id("username")).sendKeys("Demosalesmanager");
		CB.findElement(By.id("password")).sendKeys("crmsfa");
		CB.findElement(By.className("decorativeSubmit")).click();
		CB.findElement(By.linkText("CRM/SFA")).click();
		CB.findElement(By.linkText("Leads")).click();
		CB.findElement(By.linkText("Create Lead")).click();
		CB.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD Company");
		CB.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname1");
		CB.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname1");
		CB.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Fnamelocal");
		CB.findElement(By.name("departmentName")).sendKeys("Financial");
		CB.findElement(By.name("description")).sendKeys("Sample record is created for testing purpose");
		CB.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test123@gmail.com");
		WebElement s1 = CB.findElement(By.name("generalStateProvinceGeoId"));
		Select s=new Select(s1);
		s.selectByVisibleText("Georgia");
		CB.findElement(By.name("submitButton")).click();
		Thread.sleep(1500);
		String title = CB.getTitle();
		System.out.println("Title" +title);
	}

}
