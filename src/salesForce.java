import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//chromedriver.exe
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.name("pw")).sendKeys("123456");
		/*driver.findElement(By.className("button r4 wide primary")).click();//error
		  */
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"un\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
	}

}
