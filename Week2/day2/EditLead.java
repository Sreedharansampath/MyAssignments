package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		E.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ishu");
		E.findElement(By.xpath("//table[@id='ext-gen242']/tbody[1]/tr[1]/td[2]/em[1]/button[1]")).click();
		Thread.sleep(3000);
		E.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		String s=E.getTitle();
		System.out.println("Current title of page is "+s);
		E.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		E.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf");
		E.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String t = E.findElement(By.id("viewLead_companyName_sp")).getText();
		String e="MaheshTest Leaf (10093)";
		if(t.equalsIgnoreCase(e))
			System.out.println("Company name matches - "+t);
		else
			System.out.println("Company name not matches - "+t);
		E.quit();
	}
}
