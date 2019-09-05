package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Section1Agendar extends PageObject {
	
    private WebElement section1agendar =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    
    	
	public Section1Agendar(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(section1agendar));
		return this.section1agendar.isDisplayed();
	}
	
	public void Section1AgendarClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", section1agendar);
	}
}
