package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	public  ChromeDriver driver;
	public static WebDriverWait wait ;
	public static  Actions opt;
	
	@BeforeMethod
	public void StartBrowser() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers3/chromedriver.exe");
		driver= new ChromeDriver(options);
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
