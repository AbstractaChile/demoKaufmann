package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class AceptaPP extends PageObject {
	
    private WebElement aceptapp =  driver.findElement(By.xpath("//input[@name='ACEPTARPOPUP']"));
    
    	
	public AceptaPP(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.aceptapp));
		return this.aceptapp.isDisplayed();
	}
	
	public void AnularClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.aceptapp);
	}
}
