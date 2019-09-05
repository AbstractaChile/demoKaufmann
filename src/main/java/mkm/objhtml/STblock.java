package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class STblock extends PageObject {
	
    private WebElement stblock =  driver.findElement(By.xpath("//span[@id='TEXTBLOCK1']"));
    
    	
	public STblock(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.stblock));
		return this.stblock.isDisplayed();
	}
	
	public void STblockClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", this.stblock);
	}
}
