import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//selenium code-
		//CREATE Driver object for firefox Browser
		
		//We will strictly implement methods of webdriver
		/* Class name= ChromeDriver,
		 * X driver=new X();
		 */
		//invoke .exe file first
		System.setProperty( "webdriver.gecko.driver","C:\\Users\\Katarina\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		//gecko driver
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");//hit url on the browser
		System.out.println(driver.getTitle());// validate if your page title is correct
		System.out.println(driver.getCurrentUrl());//validate if you are landed to the correct URL
		System.out.println (driver.getPageSource());//print page source
		driver.navigate().to("https://qa1.youtestme.com/ytm13/login.xhtml");
	//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();// it closes current browser
		//driver.quit();// it closes all the browser opened by selenium script
	}
	

	
}
