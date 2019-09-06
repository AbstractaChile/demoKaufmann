package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SModelo extends PageObject {

//	@FindBy(id = "vMODELO")
	private WebElement smodelo = driver.findElement(By.xpath("//input[@id='vMODELO']"));

	public SModelo(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(smodelo));
		return this.smodelo.isDisplayed();
	}

	public void ingresaModelo(String smodelo) {
		this.smodelo.clear();
		this.smodelo.sendKeys(smodelo);
	}
}
