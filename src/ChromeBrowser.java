import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBroswser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code-
				//CREATE Driver object for Chrome Browser
				
				//We will strictly implement methods of webdriver
				/* Class name= ChromeDriver,
				 * X driver=new X();
				 */
				//invoke .exe file first
				System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://facebook.com");//URL in the browser
				System.out.println(driver.getTitle());
				
				driver.findElement(By.id("email")).sendKeys("This is my first code");
				driver.findElement(By.name("pass")).sendKeys("123456");
				driver.findElement(By.linkText("Заборавили сте лозинку?"));
	driver.findElement(By.xpath("*//*[@id='u_0_h_8U']")).click();
	}


}


