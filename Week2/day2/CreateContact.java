package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver CB=new ChromeDriver();
		CB.manage().window().maximize();
		CB.get("http://leaftaps.com/opentaps/control/login");
		CB.findElement(By.id("username")).sendKeys("Demosalesmanager");
		CB.findElement(By.id("password")).sendKeys("crmsfa");
		CB.findElement(By.className("decorativeSubmit")).click();
		CB.findElement(By.linkText("CRM/SFA")).click();
		CB.findElement(By.linkText("Create Contact")).click();
		CB.findElement(By.id("firstNameField")).sendKeys("Test");
		CB.findElement(By.id("lastNameField")).sendKeys("Test");
		CB.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Leaftest");
		CB.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("User");
		CB.findElement(By.id("createContactForm_departmentName")).sendKeys("User");
		CB.findElement(By.name("description")).sendKeys("A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph.");
		CB.findElement(By.id("createContactForm_primaryEmail")).sendKeys("TestLeaf@gmail.com");
		WebElement dropdown = CB.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select S=new Select(dropdown);
		S.selectByVisibleText("New York");
		CB.findElement(By.name("submitButton")).click();
		CB.findElement(By.linkText("Edit")).click();
		CB.findElement(By.name("description")).clear();
		CB.findElement(By.id("updateContactForm_importantNote")).sendKeys("Take a note");
		CB.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title=CB.getTitle();
		System.out.println("Title of current page is " +title);
	}
}
