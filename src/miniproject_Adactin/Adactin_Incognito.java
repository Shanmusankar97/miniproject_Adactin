package miniproject_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Incognito {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Incognito");
		System.setProperty("wendriver.chrome.driver","C:\\Users\\Shanmuga priya\\eclipse-workspace\\miniproject_Adactin\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();       
}

}
