package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/solutions/people-management/hr-administration/");
		driver.getTitle();
		
		driver.findElement(By.linkText("Careers"));
	}

}
