package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.HomePage;

public class Runtest extends ProjectSpecificMethod {

@Test
public void run() throws InterruptedException{

HomePage page= new HomePage(driver);
page
.MoveToToys()
.ClickEducationalToys()
.ClickAverageRating()
.ClickDiscount()
.CheckPincode()
.ClickQuickView()
.ClickViewDetails();
}

}
