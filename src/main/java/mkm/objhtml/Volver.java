package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Volver extends PageObject {
	
    private WebElement volver =  driver.findElement(By.xpath("//input[@name='VOLVER']"));
    
    	
	public Volver(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.volver));
		return this.volver.isDisplayed();
	}
	
	public void VolverClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.volver);
	}
}
