package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf_Input {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver In=new ChromeDriver();
		In.manage().window().maximize();
		In.get("https://www.leafground.com/input.xhtml");
		In.findElement(By.xpath("//input[@placeholder=\"Babu Manickam\"]")).sendKeys("Sreedharan");
		In.findElement(By.xpath("//input[@value=\"Chennai\"]")).sendKeys(", Tamilnadu");
		boolean A = In.findElement(By.xpath("//input[@placeholder=\"Disabled\"]")).isEnabled();
		System.out.println(A);
		In.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String B = In.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println(B);
		In.findElement(By.xpath("//input[contains(@placeholder,'email')]")).sendKeys("TestLeaf@gmail.com",Keys.TAB);
		In.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Smark worker");
		In.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hi ALL!");
		//In.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).click();
		In.findElement(By.xpath("//h5[contains(text(),'Just Press Enter and confirm error message*')]/following::input[2]")).sendKeys(Keys.ENTER);
		boolean C = In.findElement(By.xpath("//span[@class='ui-message-error-detail']")).isDisplayed();
		System.out.println(C);
		Point P=In.findElement(By.xpath("//span[@class='ui-float-label']//input[1]")).getLocation();
		System.out.println(P.getX());
		System.out.println(P.getY());
		Point P1=In.findElement(By.xpath("//span[@class='ui-float-label']//input[1]")).getLocation();
		System.out.println(P1.getX());
		System.out.println(P1.getY());
		if(P.getX()!=P1.getX()||P.getY()!=P1.getY())
			System.out.println("position changed");
		else
			System.out.println("position not changed");
		In.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Test");
		Thread.sleep(2500);
		List<WebElement> D = In.findElements(By.xpath("//span[@role='listbox']/ul/li"));
		D.get(2).click();
		In.findElement(By.xpath("//input[contains(@class,'ui-keyboard-input')]")).click();
		Boolean E=In.findElement(By.xpath("//div[@class='keypad-row']/parent::div")).isDisplayed();
		System.out.println("Keyboard is "+E);
		In.findElement(By.xpath("//div[contains(@data-placeholder,'content')]")).sendKeys("All good");
	}

}
