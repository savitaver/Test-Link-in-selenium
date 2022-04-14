package LinkDEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkDemoforOpenCart {
	@Test
	public void LinkDemo() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Desktop\\selenium aotomation\\Testlinkdemo\\SeleniumBrowserJars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	List<WebElement> Links = driver.findElements(By.xpath("//a"));
	int Nolinks = Links.size();
	System.out.println("Number of Links in orangehrm is....."+Nolinks);
	
	}

}
