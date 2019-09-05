package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class STipoServicio extends PageObject {
	
    private WebElement stiposervicio =  driver.findElement(By.xpath("//select[@id='vTIPOSSERVICIO']"));
    
    	
	public STipoServicio(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(stiposervicio));
		return this.stiposervicio.isDisplayed();
	}
	
	public void STipoServicioClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", stiposervicio);
	}
	public void STipoServicioOpcionClick() {
		stiposervicio.findElement(By.xpath("//option[. = '21 Puntos']")).click();
	}
}
