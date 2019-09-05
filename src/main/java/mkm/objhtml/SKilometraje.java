package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SKilometraje extends PageObject {
	
    private WebElement skilometraje =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[8]/div[1]/div[2]/div[1]/input[1]"));
    	
	public SKilometraje(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(skilometraje));
		return this.skilometraje.isDisplayed();
	}
	
	public void ingresaKilometraje(String skilometraje){
		this.skilometraje.clear();
		this.skilometraje.sendKeys(skilometraje);
	}
}
