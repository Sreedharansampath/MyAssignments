package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver D=new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://leaftaps.com/opentaps/control/main");
		D.findElement(By.id("username")).sendKeys("Demosalesmanager");
		D.findElement(By.id("password")).sendKeys("crmsfa");
		D.findElement(By.className("decorativeSubmit")).click();
		D.findElement(By.linkText("CRM/SFA")).click();
		D.findElement(By.linkText("Leads")).click();
		D.findElement(By.linkText("Find Leads")).click();
		D.findElement(By.xpath("//span[text()='Phone']")).click();
		D.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("2");
		Thread.sleep(3500);
		D.findElement(By.xpath("//table[@id='ext-gen242']/tbody[1]/tr[1]/td[2]/em[1]/button[1]")).click();
		Thread.sleep(3500);
		String leadid = D.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).getText();
		System.out.println(leadid);
		D.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		D.findElement(By.linkText("Delete")).click();
		D.findElement(By.linkText("Find Leads")).click();
		D.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(leadid);
		D.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3500);
		String text = D.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		D.quit(); 
	}

}
