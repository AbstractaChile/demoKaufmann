package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SPatente extends PageObject {
	
    private WebElement spatente =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[7]/div[1]/div[2]/div[1]/input[1]"));
    	
	public SPatente(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(spatente));
		return this.spatente.isDisplayed();
	}
	
	public void ingresaPatente(String spatente){
		this.spatente.clear();
		this.spatente.sendKeys(spatente);
	}
}
