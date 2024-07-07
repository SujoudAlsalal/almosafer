package almosafer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mysetup {
	WebDriver driver = new ChromeDriver();
	String Url=("https://www.almosafer.com/en?ncr=1");
	@BeforeTest
	public void setup(){
		driver.get(Url);
	
	}
	
	@Test
	public void firsttest(){
		
		System.out.println("hello");
	}
	

}
