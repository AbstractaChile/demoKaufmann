package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class STipoVehiculo extends PageObject {
	
    private WebElement stipovehiculo =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
    	
	public STipoVehiculo(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(stipovehiculo));
		return this.stipovehiculo.isDisplayed();
	}
	
	public void STipoVehiculoClick(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", stipovehiculo);
	}
	public void STipoVehiculoOpcionClick() {
		stipovehiculo.findElement(By.xpath("//option[. = 'Bus']")).click();
	}
}
