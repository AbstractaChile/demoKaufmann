package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SHorometro extends PageObject {
	
    private WebElement shorometro =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[2]/div[1]/input[1]"));
    	
	public SHorometro(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.shorometro));
		return this.shorometro.isDisplayed();
	}
	
	public void ingresaHorometro(String shorometro){
		this.shorometro.clear();
		this.shorometro.sendKeys(shorometro);
	}
}
