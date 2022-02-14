package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ProjectSpecificMethod;

public class EducationalToysPage extends ProjectSpecificMethod {

	
public EducationalToysPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public EducationalToysPage ClickAverageRating() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("//label[@for='avgRating-4.0']")))).click();
	return this;
}

public EducationalToysPage ClickDiscount() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElementByXPath("(//i[@class='sd-icon sd-icon-plus'])[1]").click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("//label[@for='discount-40%20-%2050']")))).click();
    return this;
}

public FirstProductPage CheckPincode() throws InterruptedException {
	 driver.findElementByXPath("//input[@placeholder='Enter your pincode']").sendKeys("600053");
     Thread.sleep(3000);
     driver.findElementByXPath("//button[text()='Check']").click();
     Thread.sleep(5000);
     return new FirstProductPage(driver);
    
}

}
