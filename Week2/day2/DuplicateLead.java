package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver E=new ChromeDriver();
		E.manage().window().maximize();
		E.get("http://leaftaps.com/opentaps/control/main");
		E.findElement(By.id("username")).sendKeys("Demosalesmanager");
		E.findElement(By.id("password")).sendKeys("crmsfa");
		E.findElement(By.className("decorativeSubmit")).click();
		E.findElement(By.linkText("CRM/SFA")).click();
		E.findElement(By.linkText("Leads")).click();
		E.findElement(By.linkText("Find Leads")).click();
		E.findElement(By.xpath("//span[text()='Email']")).click();
		E.findElement(By.name("emailAddress")).sendKeys("heelo@gmail.com");
		E.findElement(By.xpath("//td[@class='x-panel-btn-td']/table/tbody/tr/td[2]/em/button[text()='Find Leads']")).click();
		String Fname = E.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).getText();
		System.out.println("Firstname is "+Fname);
		Thread.sleep(3000);
		E.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).click();
		E.findElement(By.linkText("Duplicate Lead")).click();
		String Dtitle= E.getTitle();
		System.out.println("The title of current page is "+Dtitle);
		if(Dtitle.contains("Duplicate Lead")) {
			System.out.println("Yes title contains duplicate lead");
		}
		else {
			System.out.println("No title contains duplicate lead");
		}
		E.findElement(By.xpath("//div[@class='fieldgroup-body']//table/tbody[1]/tr[24]/td[2]/input[1]")).click();
		String Dname = E.findElement(By.id("viewLead_firstName_sp")).getText();
		if(Fname.equals(Dname)) {
			System.out.println("Both names are equal");
		}
		else {
			System.out.println("Both names are different");
		}
		E.quit();
		}
}
