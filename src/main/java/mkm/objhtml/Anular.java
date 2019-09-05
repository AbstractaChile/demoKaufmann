package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Anular extends PageObject {
	
    private WebElement anular =  driver.findElement(By.xpath("//input[@name='ANULAR']"));
    
    	
	public Anular(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.anular));
		return this.anular.isDisplayed();
	}
	
	public void AnularClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.anular);
	}
}
