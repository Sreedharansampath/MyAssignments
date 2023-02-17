package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		ChromeDriver CD=new ChromeDriver();
		CD.get("https://en-gb.facebook.com/");
		CD.manage().window().maximize();
		CD.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		CD.findElement(By.xpath("//div[contains(@class,'ltg')][2]/a")).click();
		CD.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		CD.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Leaf");
		CD.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("TestLeaf@gmsil.com");
		CD.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("9988776655");
		WebElement d = CD.findElement(By.xpath("//select[@id='day']"));
		Select date=new Select(d);
		date.selectByValue("3");
		WebElement m = CD.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(m);
		month.selectByVisibleText("Jul");
		WebElement y = CD.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(y);
		year.selectByValue("1990");
		CD.findElement(By.xpath("//label[text()=\"Female\"]")).click();	
	}

}
