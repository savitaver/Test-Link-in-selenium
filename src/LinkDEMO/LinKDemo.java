package LinkDEMO;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinKDemo {
		@Test

		public void LinkDemo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Desktop\\selenium aotomation\\Testlinkdemo\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int Nolinks = Links.size();
		System.out.println("Number of Links in Calculator is....."+Nolinks);
		for(int i = 0; i <=Links.size(); i++) {
			System.out.println(Links.get(i).getText());
			
			String str = Links.get(i).getText();
			String str1 ="Love Calculator";
			if(str1.equals(str1)) {
				driver.findElement(By.linkText("Love Calculator")).click();
				driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a")).click();
			}
		}
		}

	}
		
