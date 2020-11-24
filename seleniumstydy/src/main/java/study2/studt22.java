package study2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class studt22 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form/");
driver.manage().window().maximize();
WebElement name =driver.findElement(By.id("firstName"));
name.sendKeys("SILPA");
Thread.sleep(3000);
WebElement lastname=driver.findElement(By.id("lastName"));
lastname.sendKeys("k s");
Thread.sleep(3000);
WebElement email=driver.findElement(By.id("userEmail"));
email.sendKeys("silparamapuram@gmail.com");
Thread.sleep(3000);
WebElement submit=driver.findElement(By.id("submit"));
submit.click();


driver.close();

	}

}
