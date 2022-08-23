package introduction;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nestedFrames {

	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		getFrames();

	}

	@Test
	private static void getFrames() {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		/*
		 * System.out
		 * .println(driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]")).
		 * getAttribute("name").toString());
		 */
		
		// wrong xpath - need to find correct one using parent child xpath
		// parent xpath [/html[1]/frameset[1]/frame[1]/]
		
		
		
		  driver.switchTo().frame("frame-top");
		  
		  driver.switchTo().frame("frame-middle");
		  
		  System.out.println(driver.findElement(By.id("content")).getText());
		  driver.switchTo().parentFrame();
		  driver.switchTo().frame("frame-left");
		  System.out.println(driver.findElement(By.xpath("//body")).getText());
		  driver.close();
	}

}
