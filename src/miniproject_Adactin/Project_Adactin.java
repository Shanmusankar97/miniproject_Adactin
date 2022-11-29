package miniproject_Adactin;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shanmuga priya\\eclipse-workspace\\miniproject_Adactin\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		//Login
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sanjaysankar99");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Shanmusankar97");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();	
		Thread.sleep(3000);
		//Hotel search
		driver.findElement(By.xpath("//select[@name='location']")).sendKeys("New York");
		driver.findElement(By.xpath("//select[@name='hotels']")).sendKeys("Hotel Cornice");
		driver.findElement(By.xpath("//select[@name='room_type']")).sendKeys("Standard");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).clear();
		driver.findElement(By.xpath("//input[@name='datepick_out']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("20/11/2022");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("22/11/2022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//Select Hotel
		driver.findElement(By.cssSelector("input#radiobutton_0")).click();
		driver.findElement(By.cssSelector("input.reg_button")).click();
		Thread.sleep(3000);
		//Book a Hotel
		driver.findElement(By.cssSelector(".reg_input")).sendKeys("Sanjay");
		driver.findElement(By.cssSelector("#last_name")).sendKeys("Sankar");
		driver.findElement(By.cssSelector(".txtarea")).sendKeys("5 Washing ton square S,NewYork,NY 10012,USA");
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("7894561231234567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='cc_type']")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("September");
		driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(10000);
        // TakesScreenshot
	    TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File ss=new File("C:\\Users\\Shanmuga priya\\eclipse-workspace\\miniproject_Adactin\\Display\\project.png");
		FileUtils.copyFileToDirectory(src,ss);
		Thread.sleep(5000);
		driver.quit();
	}

}
