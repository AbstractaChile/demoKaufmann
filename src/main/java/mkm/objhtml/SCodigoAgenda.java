package mkm.objhtml;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SCodigoAgenda extends PageObject {
	
    private WebElement scodigoagenda =  driver.findElement(By.xpath("//input[@id='vMASTERCODE2']"));
    	
	public SCodigoAgenda(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.scodigoagenda));
		return this.scodigoagenda.isDisplayed();
	}
	
	public void ingresaScodigoAgenda(String scodigoagenda){
		this.scodigoagenda.clear();
		this.scodigoagenda.sendKeys(scodigoagenda);
	}
}
