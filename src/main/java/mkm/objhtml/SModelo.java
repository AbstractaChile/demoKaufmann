package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SModelo extends PageObject {
	
    private WebElement smodelo =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[6]/div[1]/div[2]/div[1]/input[1]"));
    	
	public SModelo(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(smodelo));
		return this.smodelo.isDisplayed();
	}
	
	public void ingresaModelo(String smodelo){
		this.smodelo.clear();
		this.smodelo.sendKeys(smodelo);
	}
}
