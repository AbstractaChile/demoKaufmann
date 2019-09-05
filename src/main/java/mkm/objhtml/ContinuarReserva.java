package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class ContinuarReserva extends PageObject {
	
    private WebElement continuarreserva =  driver.findElement(By.xpath("//input[@name='VOLVER']"));
    																	
	public ContinuarReserva(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.continuarreserva));
		return this.continuarreserva.isDisplayed();
	}
	
	public void ContinuarClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.continuarreserva);
	}
}