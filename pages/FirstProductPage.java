package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ProjectSpecificMethod;

public class FirstProductPage extends ProjectSpecificMethod {

public FirstProductPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	
	}



public FirstProductPage ClickQuickView() throws InterruptedException {
	List<WebElement> images = driver.findElementsByXPath("//div[@class='product-tuple-description ']");
    Thread.sleep(5000);
    WebElement firstelement = images.get(0);
    opt.moveToElement(firstelement).build().perform();
    driver.findElementByXPath("(//div[@class='clearfix row-disc']/div)[1]").click();
    return this;
    
}



public FirstProductPage ClickViewDetails() {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' btn btn-theme-secondary prodDetailBtn']"))).click();
	 return this;
}
}
