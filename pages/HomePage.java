package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {

	
	public HomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public HomePage MoveToToys() {
		opt= new Actions(driver);
		WebElement toys = driver.findElementByXPath("(//span[@class='catText'])[4]");
		opt.moveToElement(toys).build().perform();
		return this;
	}
	
	public EducationalToysPage ClickEducationalToys() {
		driver.findElementByXPath("//span[text()='Educational Toys']").click();
		return new EducationalToysPage(driver);
	}
}
