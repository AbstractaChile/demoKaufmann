package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class FondoNegro extends PageObject {
	
    private WebElement fondonegro =  driver.findElement(By.xpath("//div[@id='SECTIONFONDONEGRO']"));
    
    	
	public FondoNegro(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(fondonegro));
		return this.fondonegro.isDisplayed();
	}
	
	public void FondoNegroClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", fondonegro);
	}
}
