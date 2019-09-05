package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Section3AnularReserva extends PageObject {
	
    private WebElement section3anularreserva =  driver.findElement(By.xpath("//div[@id='SECTION3']"));
    
    	
	public Section3AnularReserva(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.section3anularreserva));
		return this.section3anularreserva.isDisplayed();
	}
	
	public void Section3AnularReservaClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.section3anularreserva);
	}
}
